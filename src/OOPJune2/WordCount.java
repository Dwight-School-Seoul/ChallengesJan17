package OOPJune2;
import Main.*;
import java.util.*;

public class WordCount {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(){

        while(true){
            System.out.printf("\n\t > %s Enter a sentence: %s", CC.YELLOW_BRIGHT, CC.RESET);
            String sentence = While.getSentenceStringScanOnly(scan);

            int wordCount = countWords(sentence);
            System.out.printf(" \n\t > %sSentence: %s\"%s%s%s\"", CC.YELLOW_BRIGHT, CC.RESET, CC.GREEN_BRIGHT, sentence, CC.RESET);
            System.out.printf(" \n\t > %sNumber of words in the sentence: %s%s%S", CC.YELLOW_BRIGHT, CC.GREEN_BRIGHT, wordCount, CC.RESET);

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



    private static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        String[] words = sentence.split("\\s+");
        return words.length;
    }


}
