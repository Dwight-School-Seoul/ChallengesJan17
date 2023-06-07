package OOPJune2;
import Main.*;
import java.util.*;

public class CountVowelsAndConsonants {

    private static final Scanner scan = new Scanner(System.in);
    private static int vowels;
    private static int consonants;

    public static void main(){

        while(true){
            System.out.printf("\n\t > %sEnter a string: %s",CC.YELLOW_BRIGHT, CC.RESET);
            String input = While.getStringScanOnly(scan).toLowerCase();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                if (Character.isLetter(ch)) {
                    if (isVowel(ch)) {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }

            System.out.printf("\n\t > %s Number of vowels: %s%s%s", CC.YELLOW_BRIGHT, CC.GREEN_BRIGHT, vowels, CC.RESET);
            System.out.printf("\n\t > %sNumber of consonants: %s%s%s", CC.YELLOW_BRIGHT, CC.GREEN_BRIGHT, consonants, CC.RESET);

            While.again();
        }

    }


    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
