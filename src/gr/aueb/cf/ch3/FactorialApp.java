package ch3;

import java.util.Scanner;

/**
 * ipologizei to n!
 */

public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long facto = 1L;
        int i = 1;
        int n = 0;

        System.out.println("please insert n");
        n = in.nextInt();

        while (i <= n){
            facto *= i;
            i++;
        }

        System.out.printf("%d! = %,d" , n, facto);
    }
}
