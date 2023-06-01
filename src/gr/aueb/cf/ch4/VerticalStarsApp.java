package ch4;

import java.util.Scanner;

/*
 εκτυπωνει n καθετα αστερακια
 */

public class VerticalStarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please provide a number of stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i ++){
            System.out.println("*");
        }

    }
}
