import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        java.lang.StringBuilder myString = new java.lang.StringBuilder();
        myString.append("hello this is dwight school seoul");

        // Find the index of the word "this"
        int index = myString.indexOf("this");
        System.out.println("Index of 'this': " + index);

        // Replace "hello" with "Hi"
        myString.replace(0, 5, "Hi");
        System.out.println(myString);

        // Delete the word "school"
        int startIndex = myString.indexOf("school");
        int endIndex = startIndex + "school".length();
        myString.delete(startIndex, endIndex);
        System.out.println(myString);

    }
}