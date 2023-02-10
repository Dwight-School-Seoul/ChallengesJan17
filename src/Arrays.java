public class Arrays {

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
}
