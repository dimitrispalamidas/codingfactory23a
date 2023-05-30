package ch3;

import java.util.Scanner;

/**
 * emfanizei epanaliptika ena menu epilogwn mexri o xristris na epileksei
 * eksodo
 */

public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("epilektse ena apo ta parakatw");
            System.out.println("1. eisagogi proiontos");
            System.out.println("2. Diagrafi proiontos");
            System.out.println("3. Eksodos");
            choice = in.nextInt();
        } while (choice != 3);


    }
}
