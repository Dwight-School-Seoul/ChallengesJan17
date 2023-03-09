import java.util.Arrays;
import java.util.Scanner;
public class Formative {


//    Question 1:
//    Write a Java method to find the 3 smallest elements in the given array and output these to screen, with a suitable message.
//    [1, 4, 17, 7, 25, 3, 100]


    //    Example output :
    //    ******
    //    the smallest numbers are 1, 3, 4
    //    [1,8,17,29,4,3,100]
    public static void question1(){

        int[] array = {1,8,17,29,4,3,100};
        int length = array.length;
        int temp = 0;

        for(int i=0; i < length; i++){

            for(int j=1; j < (length-i); j++){

                if(array[j-1] > array[j]){

                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;

                }
            }
        }

        System.out.println("The smallest numbers are " + array[0] + ", " + array[1] + ", " + array[2]);
    }


//    Question 2:
//    Write a Java method to find the numbers greater than the average of the numbers of a given array and
//    output these to screen, with a suitable message.


//    Example output :


//    the number 29 is greater than the array average 23
//    the number 100 is greater than the array average 23


    public static void question2(){

        Scanner scan = new Scanner(System.in);
        int[] array = {1,8,17,29,4,3,100,};
        int sum = 0;

        for(int i=0; i < array.length ; i++ ){
            sum += array[i];
        }

        double average = sum/2;

        for(int i=0; i < array.length ; i++ ){

            if (average < array[i]){
                System.out.println("The number "+array[i]+" is greater than the array average "+average);
            }
        }
    }

    //Question 3:
    //Write a Java method that will accept a decimal number and convert it into a binary number and output to screen with a suitable message.
    //Example output:
    //    Enter a decimal value to be converted to binary
    //    577
    //    the binary value is 100100001


    public static void question3(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the decimal number... ");
        int number = scan.nextInt();

        String binary = "";
        while (number > 0) {
            binary = (number % 2) + binary;
            number = number / 2;
        }
        System.out.println("The binary value is " + binary);

    }
    //    Question 2:
    //Write a Java method that merges 2 given arrays into 1 new array and outputs the new array to screen.
    //[1,8,17,29,4]
    //[1,4,17,7]


    //Example Output:
    //the merged array as [1,8,17, 29, 4, 1, 4, 17, 7 ]

    public static void question4(){

        int[] array1 = {1,8,17,29,4};
        int[] array2 = {1,4,17,7};

        int length = array1.length + array2.length;
        int[] result = new int[length];
        int pos = 0;

        for(int i = 0 ; i < array1.length; i++) {
            result[pos] = array1[i];
            pos++;
        }

        for(int i = 0 ; i < array2.length; i++) {
            result[pos] = array2[i];
            pos++;
        }
        System.out.print("The merged array as " + Arrays.toString(result));
    }
}

