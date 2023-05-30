package gr.aueb.cf.ch2;

//diavazei apo to std input (pliktrologio)
//dio akeraious kai tous prosthetei (υπολογιστης τσεπης )

import java.util.Scanner;

public class ScannerApp {

    public static void main(String[] args) {
        // dilosi metavliton kai arxikopisi
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;


        //Entoles
        System.out.println("Please insert two ints");
        num1 = in.nextInt();
        num1 = in.nextInt();
        sum = num1 + num2;

        //Ektiposi apotelesmatwn
        System.out.printf("%d + %d = %d",num1, num2, sum);
    }
}
