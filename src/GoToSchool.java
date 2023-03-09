import java.util.Scanner;

public class GoToSchool {

    public static void main(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Number of the Day. ");
        int day = sc.nextInt();
        if (day >= 1 && day <= 5) {
            System.out.println("go to school");
        } else if (day >= 6 && day <= 7) {
            System.out.println("it is the weekend");
        } else {
            System.out.println("Invalid input");
        }
    }

}
