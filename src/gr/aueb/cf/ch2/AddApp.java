package gr.aueb.cf.ch2;

/**
 *Overflow
 *
 */
public class AddApp {
    public static void main(String[] args) {
        // dilosi kai arxikopoisi metavliton
        int num1 = 2_147_483_647;
        int num2 = 2;
        int result = 0;

        //Entoles
        result = num1 +num2;

        //emfanisi apotelesmatwn
        System.out.println("Sum: " + result);
    }
}
