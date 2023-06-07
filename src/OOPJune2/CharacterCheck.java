package OOPJune2;
import Main.*;
import java.util.*;

public class CharacterCheck {

    private static final Scanner scan = new Scanner(System.in);


    public static void main(){

       while (true){
           System.out.printf(" \n\t > %sEnter a Word: %s", CC.YELLOW_BRIGHT, CC.RESET);
           String word = While.getStringScanOnly(scan);

           System.out.printf(" \n\t > %sEnter the Character: %s",CC.YELLOW_BRIGHT, CC.RESET);
           char character = While.getCharacterScanOnly(scan);

           int charCount = countOccurrences(word, character);

           System.out.printf(" \n\t > %sWord: %s%s%s", CC.YELLOW_BRIGHT, CC.GREEN_BRIGHT, word, CC.RESET);
           System.out.printf("\n\t > %sThe Number of \"%s%s%s\" occurs in the Word: %s%s%s", CC.YELLOW_BRIGHT, CC.GREEN_BRIGHT, character, CC.YELLOW_BRIGHT, CC.GREEN_BRIGHT, charCount, CC.RESET);

           While.again();
       }
    }
    private static int countOccurrences(String word, char character) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }

}
