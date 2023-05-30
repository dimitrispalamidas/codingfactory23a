package ch3;

import java.util.Scanner;

/**
 * ektipwnei h orizontia asterakia,
 * opou n enas akeraios poy dinei o xristis
 */

public class StartsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStars = 0;
        int i = 1;

        System.out.println("please insert number of stars");
        numberOfStars = in.nextInt();

        while (i <= numberOfStars) {
            System.out.print("*");
            i++;
            if (i % 50 ==0){
                System.out.println();
            }
        }
    }
}
