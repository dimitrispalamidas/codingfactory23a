package ch3;

import java.util.Scanner;

/**
 * Metraei to plithos twn thetikwn arithmwn
 * poy dinei o xristis
 */

public class PositivesCountApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;

        System.out.println("Please give a num(int)");
        num = in.nextInt();

        while (num >= 0){
            positivesCount++;
            System.out.println("Please give a num(int)");
            num = in.nextInt();
        }

        System.out.println("Positive-count: " + positivesCount);
    }
}
