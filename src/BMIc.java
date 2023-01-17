import java.util.Scanner;

public class BMIc {

    public static void calc(){
        Scanner dataHeight = new Scanner(System.in);

        System.out.println("What is your height?");
        double height2 = dataHeight.nextDouble();

        System.out.println("What is your weight?");
        double weight = dataHeight.nextDouble();


        double bmi = Math.round(weight / (height2 * height2)) ;
        System.out.println("Your BMI is " +bmi);

        if(bmi < 18.5){
            System.out.println("your BMI is "+bmi + ": underweight");
        }else if (bmi > 25 ){
            System.out.println("your BMI is "+bmi + ": overweight");
        }else{
            System.out.println("your BMI is "+bmi +"unkown");
        }


    }


}
