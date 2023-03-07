package Functions;

public class SumOfEvenAndOdd {

    public static void main(){


        int[] aArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int evenSum = 0;
        int oddSum = 0;

        for (int number : aArray) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

    }

}
