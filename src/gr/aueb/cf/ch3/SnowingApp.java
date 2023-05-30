package ch3;

import java.util.Scanner;

/**
 * apofasizei an xionizei h oxi me basi
 * oxi mono ti thermokrasia alla kai to an brexei
 * an brexei kai i thermokrasia einaio < 0 tote xioniazei alliws oxi.
 */
public class SnowingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.println("Please insert if it is rainning (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert temperature(int)");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);

        System.out.println("Is snowing" + isSnowing);
    }
}
