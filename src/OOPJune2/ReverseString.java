package OOPJune2;
import Main.*;
import java.util.*;

public class ReverseString {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(){

        while (true){
            System.out.printf("\n\t >%s Enter a string: %s", CC.YELLOW_BRIGHT, CC.RESET);
            String input = While.getSentenceStringScanOnly(scan);

            String reversed = reverseString(input);
            System.out.printf("\n\t > %sReversed string: %s%s%s", CC.YELLOW_BRIGHT,CC.GREEN_BRIGHT, reversed, CC.RESET);

            while (true) {
                System.out.print(CC.WHITE_BOLD_BRIGHT + "\n\n ⚪️ Try Again? < Yes / No > ");
                String Option = scan.next().toLowerCase().trim().strip();
                if (Option.equals("yes")) {
                    break;
                } else if (Option.equals("no")) {
                    return;
                } else {
                    System.out.println(CC.RED_BOLD_BRIGHT + " ⛔️ Error - \"" + Option + "\" Not Fount! ");
                }
            }
        }

    }


    private static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}
