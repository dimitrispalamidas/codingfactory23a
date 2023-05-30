package gr.aueb.cf.testbed;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;

public class MiniProject1 {
    public static void main(String[] args) {
        int[] numbers = new int[49];
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("C:/tmp/numbersfile.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                int number = Integer.parseInt(line);
                if (number >= 1 && number <= 49 && count < 49) {
                    numbers[count] = number;
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort the array
        Arrays.sort(numbers, 0, count);

        // Generate all possible combinations of six numbers and filter them
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:/tmp/numbersout.txt"))) {
            int combinationsCount = 0;

            for (int i = 0; i < count - 5; i++) {
                for (int j = i + 1; j < count - 4; j++) {
                    for (int k = j + 1; k < count - 3; k++) {
                        for (int m = k + 1; m < count - 2; m++) {
                            for (int n = m + 1; n < count - 1; n++) {
                                for (int p = n + 1; p < count; p++) {
                                    int[] combination = {numbers[i], numbers[j], numbers[k], numbers[m], numbers[n], numbers[p]};

                                    // Apply filters
                                    if (!meetsCriteria(combination)) {
                                        continue;
                                    }

                                    // Print the final valid combination
                                    for (int num : combination) {
                                        bw.write(num + " ");
                                    }
                                    bw.newLine();
                                    combinationsCount++;
                                }
                            }
                        }
                    }
                }
            }

            System.out.println("Total valid combinations: " + combinationsCount);
            System.out.println("Filtered combinations exported to numbersout.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean meetsCriteria(int[] combination) {
        // Criteria 1: Contain at most 4 even numbers
        int evenCount = 0;
        for (int num : combination) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        if (evenCount > 4) {
            return false;
        }

        // Criteria 2: Contain at most 4 odd numbers
        int oddCount = 0;
        for (int num : combination) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }
        if (oddCount > 4) {
            return false;
        }

        // Criteria 3: Contains at most 2 consecutive numbers
        for (int i = 0; i < combination.length - 1; i++) {
            if (Math.abs(combination[i] - combination[i+1]) <= 1) {
                return false;
            }
        }

        // Criteria 4: Contains at most 3 same endings
        int[] endingsCount = new int[10];
        for (int num : combination) {
            int ending = num % 10;
            endingsCount[ending]++;
        }
        for (int count : endingsCount) {
            if (count > 3) {
                return false;
            }
        }

        // Criteria 5: Contains at most 3 numbers in the same ten
        int[] tensCount = new int[5];
        for (int num : combination) {
            int ten = (num - 1) / 10;
            tensCount[ten]++;
        }
        for (int count : tensCount) {
            if (count > 3) {
                return false;
            }
        }

        return true;
    }

}






