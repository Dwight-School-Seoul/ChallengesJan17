package OOPJune2;
import Main.*;
import java.util.*;

public class FibonacciSeries {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(){

        while(true){
            System.out.printf("\n >%s Enter the number of terms:%s ", CC.YELLOW_BRIGHT, CC.RESET);
            int terms = While.getIntegerScanOnly(scan);

            System.out.printf("\n\t > %sFibonacci series up to %s" + terms + " %sterms:%s \n\t", CC.YELLOW_BRIGHT, CC.GREEN_BRIGHT, CC.YELLOW_BRIGHT, CC.RESET);
            generateFibonacciSeries(terms);

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



    private static void generateFibonacciSeries(int terms) {
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print(firstTerm + " " + secondTerm + " ");

        for (int i = 3; i <= terms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

