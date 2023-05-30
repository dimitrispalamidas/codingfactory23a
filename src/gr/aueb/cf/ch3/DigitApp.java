package ch3;

import java.util.Scanner;

/**
 * Ipologizei to plithos ton psifion
 * enos akeraiou, to athrisma ton psifion
 * kai to athroisma tou prwtou psifioy kai toy teleutaioy
 */

public class DigitApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int count = 0;
        int sum = 0;
        int sumLeftRight = 0;
        int currentDigit = 0;
        int rightmost = 0;
        int leftmost = 0;

        System.out.println("Please insert num(int)");
        inputNum = in.nextInt();

        num = inputNum;
        do {
            count++;
            currentDigit = num % 10;
            sum = sum + currentDigit;
            if (count == 1) {
                rightmost = currentDigit;
            }
            num = num / 10;
        } while (num != 0);

        System.out.println("Count: " + count);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of leftmost , rightmost digits: " + sumLeftRight);
    }
}
