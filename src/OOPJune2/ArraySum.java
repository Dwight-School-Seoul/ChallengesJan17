package OOPJune2;
import Main.*;
import java.util.*;

public class ArraySum {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args){

        while(true){
            System.out.printf("\n\t > %s Enter the Size of the array:%s ", CC.YELLOW_BRIGHT, CC.RESET);
            int size = While.getIntegerScanOnly(scan);

            int[] numbers = new int[size];

            System.out.printf("\n\t > %s Enter the elements of he array: %s\n", CC.YELLOW_BRIGHT, CC.RESET);

            for (int i = 0; i < size; i++) {

                System.out.printf(" \t\t > %sElement " + (i + 1) + ":%s ", CC.YELLOW_BRIGHT, CC.RESET);
                numbers[i] = While.getIntegerScanOnly(scan);

            }

            double sum = calculateSum(numbers);
            System.out.printf(" \n\t > %sThe Average of the Array is %s%s%s", CC.YELLOW_BRIGHT, CC.GREEN_BRIGHT, sum, CC.RESET);
            While.again();
        }

    }


    private static double calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum ;
    }
}
