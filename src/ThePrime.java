import java.util.ArrayList;

public class ThePrime {

    public static void thePrime(){

        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> primes = new ArrayList<>();

        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        System.out.println("The prime numbers in the array are: " + primes);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
