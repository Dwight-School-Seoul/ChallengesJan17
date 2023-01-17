import java.util.Scanner;
   public class Name {
      
//       keep 1 main function in the Main file, give a different name for this one
       public static void main (String[] args){

            System.out.println("What is your name?");
            Scanner dataInput = new Scanner(System.in);
            System.out.println("Hello"+ " " +dataInput.nextLine()+" nice to meet you");
        }
    }

