package OOPJune2;
import Main.*;
import java.util.*;

public class LeapYear {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(){

       while(true){

           System.out.printf(" \n\n\t> %sEnter A Year: %s",CC.YELLOW_BRIGHT, CC.RESET);
           int year = While.getIntegerScanOnly(scan);

           if(isLeapYear(year)){
               System.out.printf(" \n\t> %s%s%s is a leap Year.%s",CC.YELLOW_BRIGHT, year, CC.GREEN_BRIGHT, CC.RESET);
           }else{
               System.out.printf(" \n\t> %s%s%s is not a leap year.%s", CC.YELLOW_BRIGHT, year, CC.RED_BRIGHT, CC.RESET);
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


    private static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else return year % 400 == 0;
    }
}
