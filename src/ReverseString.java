import java.util.Scanner;

public class ReverseString {

    public static void reverseString(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = scanner.nextLine();

        String nstr="";

        for (int i=0; i<string.length(); i++){
            nstr = string.charAt(i)+nstr;
        }

        System.out.println(nstr);
    }

}
