import java.util.Scanner;

public class StringLength {

    public static void countStringLength(){

        Scanner lengthScanner = new Scanner(System.in);

        while(true){
            System.out.print("\n > Enter a String: ");
            String myString = lengthScanner.next();
            int stringLength = myString.length();
            System.out.println("\n > The length of \""+myString+"\" is " + stringLength+ " characters long ");
            System.out.println("\n> The String in Upper Case \""+myString.toUpperCase()+"\"");
            System.out.println("> The String in Lower Case \""+myString.toLowerCase()+"\"");

            While.again();

        }
    }

}
