package ch3;

import java.util.Scanner;

/**
 * apofasizei an prepei na anapsoyn ta fwta
 * tou autkonhtoy me basi 3 metavlites
 * an brexei KAI tautoxrona isxuei ena toulaxiston
 * apo ta epomena: einai skotadi h trexoume (speed > 100)
 * apo ton xristi (stdin)
 */
public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;

        System.out.println("Please insert if it is raining (tre/false)");
        isRaining =  in.nextBoolean();

        System.out.println("Please insert if it is dark (true/false)");
        isDark = in.nextBoolean();

        System.out.println("Please instert car speed");
        speed = in.nextInt();

        isRunning = (speed > 100);
        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights On:" + lightsOn);
    }
}
