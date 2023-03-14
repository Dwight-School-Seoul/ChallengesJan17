package Challenges;

import java.text.DecimalFormat;
import java.util.Scanner;
import Main.*;

public class MinuteConvertor {

    public static void main(){

        DecimalFormat df = new DecimalFormat("#.###");
        Scanner conScanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter Number of Min.. ");
            Double numMin = conScanner.nextDouble();

            double numHours = numMin / 60;
            double numDay = numMin / 1440;

            System.out.printf("%s minutes equals %s hours and equals %s days.", df.format(numMin), df.format(numHours), df.format(numDay));

            While.again();
        }

    }

}
