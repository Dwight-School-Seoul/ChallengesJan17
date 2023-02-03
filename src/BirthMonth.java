import java.util.Scanner;

public class BirthMonth {

    public static void birthMonth(){
        Scanner birthMon = new Scanner(System.in);

        while(true){
            System.out.print("\nEnter your Birth Month. >  ");
            int birthMonth = birthMon.nextInt();

            if (birthMonth < 1 || birthMonth > 12) {
                System.out.println("Invalid input. Please enter a valid birth month.");
            } else if (birthMonth <= 6) {
                System.out.println("You were born in the first half of the year.");
            } else if (birthMonth == 6 || birthMonth == 7) {
                System.out.println("You were born in the middle of the year.");
            } else {
                System.out.println("You were born in the second half of the year.");
            }

            While.again();

        }
    }


}
