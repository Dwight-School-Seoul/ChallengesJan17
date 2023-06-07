package OOPJune2;
import Main.*;
import java.util.*;

public class ArraySearch {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

       while (true){
           int[] numbers = {10, 20, 30, 40, 50};

           System.out.printf(" \n\t >%s Enter the element to search:%s ", CC.YELLOW_BRIGHT, CC.RESET);
           int element = While.getIntegerScanOnly(scan);

           int index = searchElement(numbers, element);
           if (index != -1) {
               System.out.printf("\n\t > %sElement %s" + element + " %sfound at index: %s" + index+"%s", CC.YELLOW_BRIGHT, CC.GREEN_BRIGHT, CC.YELLOW_BRIGHT, CC.GREEN_BRIGHT, CC.RESET);
           } else {
               System.out.printf("\n\t > %sElement %s" + element + "%s not found in the array.%s", CC.YELLOW_BRIGHT, CC.RED_BOLD_BRIGHT, CC.YELLOW_BRIGHT, CC.RESET);
           }
           While.again();
       }
    }

    private static int searchElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
