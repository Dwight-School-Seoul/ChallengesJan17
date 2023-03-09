import java.util.Scanner;

public class DNA {

    public static void main(){
        Scanner DNASCanner = new Scanner(System.in);

        while(true){
            System.out.print(" \n>DNA: ");
            String DNA = DNASCanner.next();

            int ATG = DNA.indexOf("ATG");
            int TGA = DNA.indexOf("TGA");

            int sequenceDifference = ATG - TGA;

            if (DNA.contains("ATG") && DNA.contains("TGA") && (sequenceDifference % 3) == 0) {
                System.out.println("\""+DNA +"\" Does contain protein!");
            } else {
                System.out.println("\""+DNA +"\" Does not contain protein!");
            }

            While.again();
        }
    }

}
