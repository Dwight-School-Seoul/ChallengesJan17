import java.util.Scanner;

public class ComparingNumbers {

    public static void main(){
        Scanner sc = new Scanner(System.in);
        while(true) {
            int num1, num2, num3;
            System.out.print("Enter the first number: ");
            num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            num2 = sc.nextInt();
            System.out.print("Enter the third number: ");
            num3 = sc.nextInt();

            if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("numbers should be different");
                return;
            }
            int largest = num1;
            if (num2 > largest) {
                largest = num2;
            }
            if (num3 > largest) {
                largest = num3;
            }
            System.out.println("The largest number is " + largest);

            While.again();
        }
    }

}
