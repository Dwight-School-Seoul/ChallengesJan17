import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {


    public static void main(){

        String[] stringArray = {"hello", "this", "is","dwight","school","Seoul"};
        stringArray[0] = "Good morning";
        System.out.println("\n\n"+ java.util.Arrays.toString(stringArray));

        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        for(int i= 0; i < intArray.length; i++){
            intArray[i] = intArray[i]*2;
        }
        System.out.println("\n\n"+ java.util.Arrays.toString(intArray));


        for (int i= 0; i < stringArray.length; i++){
            stringArray[i] = stringArray[i].toUpperCase();
        }

        System.out.println("\n\n"+ java.util.Arrays.toString(stringArray));


    }

    public static void printArray(){
        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(arr));
    }

    public static void printStrArray(){
        String[] strArr = {"arrays","are","made","up","of","elements"};
        System.out.println(Arrays.toString(strArr));

    }

    public static void checkForYear(){
        int[] years = {1911,1987,1989,1999,2008,2012,2015,2019};

        Scanner scan = new Scanner(System.in);
        System.out.print(ConsoleColors.YELLOW_BRIGHT+"\nWhat year do you want to check? ");
        int yearCheck = scan.nextInt();

        for(int i=0; i<years.length; i++){
            if(years[i] == yearCheck){
                System.out.printf(ConsoleColors.GREEN_BRIGHT+"Fount it it is in index %d 😀\n", i);
            }else{
                System.out.printf(ConsoleColors.RED_BRIGHT+"The Year %d is not found in the array ☹️", yearCheck );
                break;
            }
        }
    }

    public static void arrayAverage(){
        int[] array ={20, 32, 29, 35, 16, 99, 100};
        int sum = 0;

        for (int j : array) {
            sum += j;
        }
        double average = sum/2;

        System.out.printf("The Average of the array %s is %s", Arrays.toString(array), average);
    }

    public static void indexEverySec() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int j : array) {
            System.out.println(j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void compareArray(){
        int[] array1 = new int[]{5, 10, 15, 20, 25};
        int[] array2 = new int[]{1, 4, 5, 7, 10};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.printf(ConsoleColors.YELLOW_BRIGHT+"The number %s at array1 index %s matches the number %s at array2 index %s\n",  array1[i], i, array2[j],j);
                }
            }
        }
    }

    public static void sortPrint(){
        int[] array = {4,16,3,11,21,46,34,57};

        System.out.println(ConsoleColors.YELLOW+"The Original Array "+Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(ConsoleColors.GREEN_BRIGHT+"The Sorted Array "+Arrays.toString(array));

    }

    public static void sortPrintFromUser(){
        Scanner scan = new Scanner(System.in);
        System.out.print(ConsoleColors.YELLOW_BRIGHT+"\nEnter the length of the array.. ");
        int length = getInt(scan);

        int[] array = new int[length];

        for (int i=0; i< array.length; i++){
            System.out.printf(ConsoleColors.YELLOW_BOLD_BRIGHT+"\nEnter element %d of your array... ", i+1);
            array[i] = getInt(scan);
        }

        System.out.println(ConsoleColors.YELLOW+"\nThe Original Array "+Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(ConsoleColors.GREEN_BRIGHT+"\nThe Sorted Array "+Arrays.toString(array));

    }

    private static int getInt(Scanner scan){
        while (!scan.hasNextInt()){
            System.out.print(ConsoleColors.RED_BOLD_BRIGHT+"\n ⛔️ Invalid, the Passcode Must Be a Numbers\n"+ConsoleColors.YELLOW_BRIGHT + "\n 🔒Try Again! : ");
            scan.next();
        }
        return scan.nextInt();
    } // getInt

} // mains
