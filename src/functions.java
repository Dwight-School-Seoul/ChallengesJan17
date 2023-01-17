
import java.util.Random;
import java.util.Scanner;

public class functions {

    public static void hello(){
        System.out.println("Hello Dwight!");
    }

    public static void lifeInWeeks(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your current age: ");
        int age = scan.nextInt();

        int daysLeft = (90 - age) * 365;
        int weeksLeft = daysLeft / 7;
        int monthsLeft = daysLeft / 30;

        System.out.println("You have " + daysLeft + " days, " + weeksLeft + " weeks and " + monthsLeft + " months left.");
    }

    public static void BMICalculator(){
        Scanner dataInput = new Scanner(System.in);
        System.out.println("What's your weight?");
        double weight = dataInput.nextDouble();
        System.out.println("What's your height? (In meters)");
        double height = dataInput.nextDouble();

        double BMI = Math.round(weight / (height * height));

        System.out.println("Your BMI is " + BMI);

        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI > 25) {
            System.out.println("Overweight");
        } else {
            System.out.println("Normal");
        }
    }

    public static void tipCalculator(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the total bill: ");
        double totalBill = scan.nextDouble();

        System.out.print("Enter the tip percentage: ");
        double tipPercentage = scan.nextDouble() / 100;

        double tip = totalBill * tipPercentage;
        double total = totalBill + tip;

        System.out.println("Your total bill is " + totalBill + ", your tip is " + tip + " and the sum is " + total);
    }

    public static void characterCounter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        int count = input.length();
        System.out.println("Number of characters: " + count);
    }

    public static void magicEightBall(){
        String[] answers = {"It is certain", "It is decidedly so", "Without a doubt",
                "Yes, definitely", "You may rely on it", "As I see it, yes",
                "Most likely", "Outlook good", "Yes", "Signs point to yes",
                "Reply hazy try again", "Ask again later", "Better not tell you now",
                "Cannot predict now", "Concentrate and ask again", "Don't count on it",
                "My reply is no", "My sources say no", "Outlook not so good",
                "Very doubtful"};
        Random rand = new Random();
        int index = rand.nextInt(answers.length);
        System.out.println(answers[index]);
    }

}