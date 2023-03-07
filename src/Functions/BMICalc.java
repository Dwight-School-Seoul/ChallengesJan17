package Functions;

import java.util.Scanner;

public class BMICalc {

    public static void main(){
        Scanner anotherScanner = new Scanner(System.in);

        System.out.println("what is your weight <kg>? ");
        double weight = anotherScanner.nextDouble();
        System.out.println("what is your height <meters>? ");
        double height = anotherScanner.nextDouble();
        double BMI = Math.round(weight/(height*height));
        System.out.println();
        System.out.println("your weight is " + weight);
        System.out.println("your height is " + height);
        System.out.println("Calculating BMI");
        System.out.println();

        if(BMI < 18.5){
            System.out.println("your BMI is "+BMI + ": underweight");
        }else if (BMI > 25 ){
            System.out.println("your BMI is "+BMI + ": overweight");
        }else{
            System.out.println("your BMI is "+ BMI +"I don't Know");
        }

    }


}
