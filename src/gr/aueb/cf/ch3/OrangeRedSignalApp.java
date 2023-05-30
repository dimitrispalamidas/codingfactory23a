package ch3;

import java.util.Scanner;

/**ena aeroskafos exei dio deksamenes
 * an mia deksameni exei ligotero apo 1/4 kausimo tote anabei portokali
 * sima, enw an kai oi dio deksamenes exoun < 1/4 tote anabei kokkino sima
 * o pilotos (xristis) dinei true h false
 * analoga an tank <1/4 i oxi, antistoixa.
 *
 */

public class OrangeRedSignalApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTank1LTQuarter = false;
        boolean isTank2LTQuarter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        System.out.println("Please insert if tank1, tank2 are less than 1/4");
        isTank1LTQuarter = in.nextBoolean();
        isTank2LTQuarter = in.nextBoolean();

        orangeOn = isTank1LTQuarter || isTank2LTQuarter;
        redOn = isTank1LTQuarter && isTank2LTQuarter;

        System.out.println("Orange on:" + orangeOn);
        System.out.println("Red on:" + redOn);
    }
}
