import java.util.Scanner;

public class NumberToName {

    public static void numberToName(){

        Scanner numberToNameScanner = new Scanner(System.in);

        while (true){
            System.out.print("Please enter the number of the month: ");
            int monthNumber = numberToNameScanner.nextInt();

            if (monthNumber < 1 || monthNumber > 12) {
                System.out.println("Invalid month number. Please enter a value between 1 and 12.");
            } else {
                String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
                System.out.println("The name of the month is " + months[monthNumber - 1] + ".");
            }
            While.again();
        }
    }

}
