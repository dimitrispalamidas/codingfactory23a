package gr.aueb.cf.testbed;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MiniProject3 {
    public static void main(String[] args) {
        int[][] charArray = new int[256][2];

        try {
            File file = new File("C:/tmp/numbersfile.txt");
            FileReader reader = new FileReader(file);

            int character;
            while ((character = reader.read()) != -1) {
                charArray[character][0] = character;
                charArray[character][1] = charArray[character][1] + 1;
            }


        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        // Sort the array by character
        Arrays.sort(charArray, (a, b) -> Integer.compare(a[0], b[0]));

        System.out.println("Statistics by character:");
        for (int[] entry : charArray) {
            if (entry[1] > 0) {
                char character = (char) entry[0];
                int frequency = entry[1];
                System.out.println(character + ": " + frequency);
            }
        }

        // Sort the array by frequency
        Arrays.sort(charArray, (a, b) -> Integer.compare(b[1], a[1]));

        System.out.println("Statistics by frequency of occurrence:");
        for (int[] entry : charArray) {
            if (entry[1] > 0) {
                char character = (char) entry[0];
                int frequency = entry[1];
                System.out.println(character + ": " + frequency);
            }
        }


    }
}