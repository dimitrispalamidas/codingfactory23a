package ch4;

import java.util.Scanner;

/*
 εκτυπωνει nxn αστερακια
 */


public class MulStarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("please provide a number of stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
