package ErrorHandling;

import java.util.Scanner;
import Main.*;

public class TryCatch {

    private static Scanner scan = new Scanner(System.in);

    public static void ErrorHandle1(){

        try{
            System.out.print("\nEnter an Integer: ");
            int value = scan.nextInt();
            System.out.println("this is an integer");

        }catch ( Exception e){
            System.out.println(e);
        }

        While.again();

    }

    public static void ErrorHandle2() {
        try {
            System.out.print("\nEnter a number: ");
            int aNumber = scan.nextInt();

            System.out.println("you entered a number " + aNumber);
            System.out.println("program ended");
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
