package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρεπει euros σε δολαρια ΗΠΑ.
 * Λαμβανει απο τον χρηστη (stdin) ενα ακεραιο
 * που συμβολιζει το ποσο σε Euros και μετατρεπει
 * σε δολαρια και εμφανιζει το τελικο αποτελεσμα
 */

public class EurosToUsdConverterApp {

    public static void main(String[] args) {
        //Dilosi kai arxikopoisi
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;

        //Entoles
        System.out.println("Please insert an amount (in Euros)");
        inputEuros = scanner.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents /100;
        usaCents = totalUsaCents % 100;

        //Ektiposi apotelesmatwn
        System.out.printf("%d Euros = %d USA dollars, %d USA cents", inputEuros, usaDollars, usaCents);

    }
}
