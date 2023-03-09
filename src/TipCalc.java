import java.util.Scanner;

public class TipCalc {
    public static void main(){

        Scanner tipScanner = new Scanner(System.in);
        double bill, tip, sum;
        System.out.println("your total bill? ");
        bill = tipScanner.nextInt();
        System.out.println("your Tip percentage");
        tip = tipScanner.nextInt();
        sum = bill + bill*(tip/100);
        System.out.println("Your total bill is "+bill+", your tip is "+ tip +", and the sum is " +sum);
    }


}
