package ch5;

import java.util.Scanner;

public class StarsCh5App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int result = 0;


        do {
            printMenu();
            choice = getNextInt();

            if (isChoiceInvalid(choice)){
                System.out.println("Λαθος Επιλογη");
                continue;
            }

            if (isChoiceQuit(choice)){
                break;
            }

            } while (true);

        }


//** ΜΕΘΟΔΟΙ **//
    public static void printMenu() {
        System.out.println("1.Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2.Εμφάνισε n αστεράκια καθετα");
        System.out.println("3.Εμφάνισε n γραμμες με n αστεράκια");
        System.out.println("4.Εμφάνισε n γραμμες με αστεράκια 1-n");
        System.out.println("5.Εμφάνισε n γραμμες με αστεράκια n-1");
        System.out.println("6.Έξοδος απο το πρόγραμμα");
        System.out.println("Δώσε επιλογή");
    }
    public static boolean isChoiceInvalid(int choice) {
        return choice < 1 || choice >6;
    }

    public static boolean isChoiceQuit(int choice) {
        return choice == 6;
    }

    public static int getNextInt() {
        return in.nextInt();
    }

    public static int choice1(int result) {
        int n = 0;

        System.out.println("Please provide a number of stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        return result;

    }

    public static int choice2(int result) {
        int n = 0;

        System.out.println("Please provide a number of stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
        return result;
    }

    public static int choice3(int result) {
        int n = 0;

        System.out.println("please provide a number of stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return result;
    }

    public static int choice4(int result) {
        int n = 0;

        System.out.println("Please provide a number of stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return result;
    }

    public static int choice5(int result) {
        int n = 0;

        System.out.println("Please provide a number of stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return result;
    }



}
