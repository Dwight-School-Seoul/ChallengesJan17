package OOPJune2;
import Main.*;
import java.util.*;

public class ReverseString {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        while (true){
            System.out.printf("\n\t >%s Enter a string: %s", CC.YELLOW_BRIGHT, CC.RESET);
            String input = While.getStringScanOnly(scan);

            String reversed = reverseString(input);
            System.out.printf("\n\t > %sReversed string: %s%s%s", CC.YELLOW_BRIGHT,CC.GREEN_BRIGHT, reversed, CC.RESET);
            While.again();
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
