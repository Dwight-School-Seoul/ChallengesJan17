package OOPJune2;
import Main.*;
import java.util.*;

public class PrimeNumberChecker {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        while(true){
            System.out.printf(" \n\n\t> %sEnter A Number: %s",CC.YELLOW_BRIGHT, CC.RESET);
            int number = While.getIntegerScanOnly(scan);

            if(isPrime(number)){
                System.out.printf(" \n\t> %s%s%s is a Prime Number.%s",CC.YELLOW_BRIGHT, number, CC.GREEN_BRIGHT, CC.RESET);
            }else{
                System.out.printf(" \n\t> %s%s%s is not a Prime Number.%s",CC.YELLOW_BRIGHT, number, CC.RED_BRIGHT, CC.RESET);
            }
            While.again();
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
