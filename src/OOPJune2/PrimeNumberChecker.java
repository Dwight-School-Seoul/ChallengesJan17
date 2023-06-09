package OOPJune2;
import Main.*;
import java.util.*;

public class PrimeNumberChecker {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(){

        while(true){
            System.out.printf(" \n\n\t> %sEnter A Number: %s",CC.YELLOW_BRIGHT, CC.RESET);
            int number = While.getIntegerScanOnly(scan);

            if(isPrime(number)){
                System.out.printf(" \n\t> %s%s%s is a Prime Number.%s",CC.YELLOW_BRIGHT, number, CC.GREEN_BRIGHT, CC.RESET);
            }else{
                System.out.printf(" \n\t> %s%s%s is not a Prime Number.%s",CC.YELLOW_BRIGHT, number, CC.RED_BRIGHT, CC.RESET);
            }

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

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
