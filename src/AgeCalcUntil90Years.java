import java.util.Scanner;

public class AgeCalcUntil90Years {
    public static void ageCalcTill90Years(){
        Scanner ageScanner = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = ageScanner.nextInt();

        int day,week,month;
        day = (90-age)*365;
        week = (90-age)*52;
        month = (90-age)*12;


        System.out.println("You have "+day+" days, "+week+" weeks and "+month+" months left.");
    }
}
