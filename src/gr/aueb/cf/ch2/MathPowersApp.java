import java.util.Scanner;

//briskei to tetragono kai ton kuvo 2 timwn pou dinei o xristis
public class MathPowersApp {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int inputNum = 0;
    int num = 0;

        System.out.println("please insert a num(int)");
        inputNum = in.nextInt();

        System.out.printf("num: %d, square: %d, cube:%d",
                inputNum, (int) Math.pow(inputNum,2), (int) Math.pow(inputNum, 3));
    }

}
