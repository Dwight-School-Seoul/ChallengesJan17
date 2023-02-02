import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static javax.swing.JOptionPane.PLAIN_MESSAGE;

public class Functions {

    public static void gradeCalc(){

        Scanner gradeScanner = new Scanner(System.in);

        String gradeLetter;

        while(true){
            System.out.print("\n\n> Enter your grade here.. ");
            double grade = gradeScanner.nextDouble();

            if (grade >= 90 && grade <= 100) {
                gradeLetter = ("A");
                System.out.println("your grade is " + grade + " you get an \""+gradeLetter+"\"");
            } else if (grade >= 80 && grade < 90) {
                gradeLetter = ("B");
                System.out.println("your grade is " + grade + " you get an \""+gradeLetter+"\"");
            } else if (grade >= 70 && grade < 80) {
                gradeLetter = ("C");
                System.out.println("your grade is " + grade + " you get an \""+gradeLetter+"\"");
            } else if (grade >= 60 && grade < 70) {
                gradeLetter = ("D");
                System.out.println("your grade is " + grade + " you get an \""+gradeLetter+"\"");
            } else if (grade >= 0 && grade < 60) {
                gradeLetter = ("F");
                System.out.println("your grade is " + grade + " you get an \""+gradeLetter+"\"");
            } else {
                System.out.println("Invalid input. Please enter a grade between 0 and 100.");
            }

            While.again();

        }
    }

    public static void BMICalc(){
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

    public static void greetingUser(){

        Scanner newScanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String yourName = newScanner.nextLine();
        System.out.println("Hello "+ yourName+ ", Nice to meed you " + yourName + "!");

    }

    public static void charCount(){

        Scanner anotherScanner = new Scanner(System.in);
        boolean continueLoop = true;
        while (continueLoop) {
            System.out.print("\n > Enter a string: ");
            String inputString = anotherScanner.nextLine();
            if (!inputString.isEmpty()) {
                System.out.println("\n >  Your string is:  "+ inputString +", The number of characters in the string is: " + inputString.length());
                System.out.print("\n > Do you want to enter another string? (yes/no): ");
                String userInput = anotherScanner.nextLine();
                if (userInput.equalsIgnoreCase("no")) {
                    continueLoop = false;
                }
            } else {
                System.out.println(" \n> You must enter something into the program.");
            }
        }
        System.out.println(" \n> Quiting");
    }

    public static void ageCalcTill90Years(){
        Scanner ageScanner = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = ageScanner.nextInt();

        int day,week,month;
        day = (90-age)*365;
        week = (90-age)*52;
        month = (90-age)*12;


        System.out.println("You have "+day+" days, "+week+" weeks and "+month+" months left.");
    }

    public static void tipCalc(){

        Scanner tipScanner = new Scanner(System.in);
        double bill, tip, sum;
        System.out.println("your total bill? ");
        bill = tipScanner.nextInt();
        System.out.println("your Tip percentage");
        tip = tipScanner.nextInt();
        sum = bill + bill*(tip/100);
        System.out.println("Your total bill is "+bill+", your tip is "+ tip +", and the sum is " +sum);
    }

    public static void magic8ball(){
        System.out.println("\n        ----{ Magic8ball }----        ");
        Scanner playScanner = new Scanner(System.in);

        while (true) {

            Random ran = new Random();
            int x = ran.nextInt(20);
            System.out.println("\nType Your Question Here... ");
            playScanner.nextLine();

            if (x==0) {
                System.out.println("Magic8Ball ->  It is certain");
            } else if (x == 1) {
                System.out.println("Magic8Ball -> It is decidedly so");
            } else if (x == 2) {
                System.out.println("Magic8Ball -> Without a doubt");
            } else if (x == 3) {
                System.out.println("Magic8Ball -> Yes definitely");
            } else if (x == 4) {
                System.out.println("Magic8Ball -> You may rely on it");
            } else if (x == 5) {
                System.out.println("Magic8Ball -> As I see it, yes");
            } else if (x == 6) {
                System.out.println("Magic8Ball -> Most likely");
            } else if (x == 7) {
                System.out.println("Magic8Ball -> Outlook good");
            } else if (x == 8) {
                System.out.println("Magic8Ball -> Yes");
            } else if (x == 9) {
                System.out.println("Magic8Ball -> Signs point to yes");
            } else if (x == 10) {
                System.out.println("Magic8Ball -> Reply hazy, try again");
            } else if (x == 11) {
                System.out.println("Magic8Ball -> Ask again later");
            } else if (x == 12) {
                System.out.println("Magic8Ball -> Better not tell you now");
            }  else if (x == 13) {
                System.out.println("Magic8Ball -> Cannot predict now");
            }  else if (x == 14) {
                System.out.println("Magic8Ball -> Concentrate and ask again");
            }  else if (x == 15) {
                System.out.println("Magic8Ball -> Don’t count on it");
            }  else if (x == 16) {
                System.out.println("Magic8Ball -> My reply is no");
            }  else if (x == 17) {
                System.out.println("Magic8Ball -> My sources say no");
            }  else if (x == 18) {
                System.out.println("Magic8Ball -> Outlook not so good");
            }  else {
                System.out.println("Magic8Ball -> Very doubtful");
            }

            while(true){

                System.out.println();
                System.out.println("Magic8Ball -> Do You Want To Ask Another question? <yes / no>");
                String option = playScanner.nextLine().trim().toLowerCase().strip();

                if (option.equals("yes")) {
                    break;
                } else if (option.equals("no")) {
                    System.out.println("Magic8Ball -> OK! Thank You For Playing!");
                    return;
                } else {
                    System.out.println("Magic8Ball -> Error, i don't understand, '"+option+"'");
                }
            }
        }
    }

    public static void magic8ballV2() {
        System.out.println("\n        ----{ Magic8ball }----        ");
        Scanner playScanner = new Scanner(System.in);

        String[] responses = {
                "It is certain",
                "It is decidedly so",
                "Without a doubt",
                "Yes definitely",
                "You may rely on it",
                "As I see it, yes",
                "Most likely",
                "Outlook good",
                "Yes",
                "Signs point to yes",
                "Reply hazy, try again",
                "Ask again later",
                "Better not tell you now",
                "Cannot predict now",
                "Concentrate and ask again",
                "Don’t count on it",
                "My reply is no",
                "My sources say no",
                "Outlook not so good",
                "Very doubtful"
        };

        while (true) {
            System.out.println("\nType Your Question Here... ");
            playScanner.nextLine();

            int x = (int) (Math.random() * 20);
            System.out.println("Magic8Ball -> " + responses[x]);

            while (true) {
                System.out.println("\nMagic8Ball -> Do you want to ask another question? <yes/no>");
                String option = playScanner.nextLine().toLowerCase().trim().strip();

                if (option.equals("yes")) {
                    break;
                } else if (option.equals("no")) {
                    System.out.println("Magic8Ball -> OK! Thank you for playing!");
                    return;
                } else {
                    System.out.println("Magic8Ball -> Error, I don't understand '" + option + "'");
                }
            }
        }
    }

    public static void magic8BallV3(){

        System.out.println("\n        ----{ Magic8ball }----        ");
        Scanner playScanner = new Scanner(System.in);
        Random ran = new Random();

        while (true){
            int x = ran.nextInt(20);
            System.out.println("\nType Your Question Here... ");
            playScanner.nextLine();


            switch (x){
                case 0:
                    System.out.println("Magic8Ball ->  It is certain");
                    break;
                case 1:
                    System.out.println("Magic8Ball -> It is decidedly so");
                    break;
                case 2:
                    System.out.println("Magic8Ball -> Without a doubt");
                    break;
                case 3:
                    System.out.println("Magic8Ball -> Yes definitely");
                    break;
                case 4:
                    System.out.println("Magic8Ball -> You may rely on it");
                    break;
                case 5:
                    System.out.println("Magic8Ball -> As I see it, yes");
                    break;
                case 6:
                    System.out.println("Magic8Ball -> Most likely");
                    break;
                case 7:
                    System.out.println("Magic8Ball -> Outlook good");
                    break;
                case 8:
                    System.out.println("Magic8Ball -> Yes");
                    break;
                case 9:
                    System.out.println("Magic8Ball -> Signs point to yes");
                    break;
                case 10:
                    System.out.println("Magic8Ball -> Reply hazy, try again");
                    break;
                case 11:
                    System.out.println("Magic8Ball -> Ask again later");
                    break;
                case 12:
                    System.out.println("Magic8Ball -> Better not tell you now");
                    break;
                case 13:
                    System.out.println("Magic8Ball -> Cannot predict now");
                    break;
                case 14:
                    System.out.println("Magic8Ball -> Concentrate and ask again");
                    break;
                case 15:
                    System.out.println("Magic8Ball -> Don’t count on it");
                    break;
                case 16:
                    System.out.println("Magic8Ball -> My reply is no");
                    break;
                case 17:
                    System.out.println("Magic8Ball -> My sources say no");
                    break;
                case 18:
                    System.out.println("Magic8Ball -> Outlook not so good");
                    break;
                case 19:
                    System.out.println("Magic8Ball -> Very doubtful");
                    break;
            }
            While.again();
        }
    }

    public static void printingQuotes(){

        Scanner quotScanner = new Scanner(System.in);

        while (true){
            System.out.println(" > What is the quot? ");
            String quot = quotScanner.nextLine().trim().strip();
            System.out.println(" > Who said it? ");
            String author = quotScanner.nextLine().trim().strip();
            System.out.println(author + " says, " + '"'+quot+'"');

            While.again();

        }
    }

    public static void printingQuotesAI(){
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.print("Enter a quote: ");
            String quote = scanner.nextLine();
            if (quote.isEmpty()) {
                System.out.println("Error: Quote cannot be empty. Please enter a quote.");
                continue;
            }
            System.out.print("Enter the author of the quote: ");
            String author = scanner.nextLine();
            if (author.isEmpty()) {
                System.out.println("Error: Author cannot be empty. Please Try Again!");
                continue;
            }
            System.out.println("\"" + quote + "\"" + " -" + author);
            System.out.print("Do you want to quit the program? (y/n) ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("y")) {
                run = false;
            }
        }
        System.out.println("Program terminated.");
    }

    public static void storyGen(){
        Scanner storyScanner = new Scanner(System.in);

        System.out.print("noun: ");
        String noun = storyScanner.nextLine();
        System.out.print("verb: ");
        String verb = storyScanner.nextLine();
        System.out.print("adverb: ");
        String adverb = storyScanner.nextLine();
        System.out.print("adjective: ");
        String adjective = storyScanner.nextLine();

        String story = "The " + adjective + " " + noun + " decided to " + verb + " " + adverb + ".";
        System.out.println(story);

    }

    public static void storyGenAI(){
        Scanner sotryScanner = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = sotryScanner.nextLine();
        System.out.print("Enter a verb: ");
        String verb = sotryScanner.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = sotryScanner.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = sotryScanner.nextLine();
        System.out.print("Enter a place: ");
        String place = sotryScanner.nextLine();
        System.out.print("Enter a person: ");
        String person = sotryScanner.nextLine();

        String story = "Once upon a time, there was a " + adjective + " " + noun + " who decided to " + verb + " " + adverb + "."
                + " One day, the " + noun + " met a " + person + " in a " + place + " and fell in love."
                + " They then decided to live happily ever after.";
        System.out.println(story);
    }

    public static void simpleMath(){
        Scanner simpleMathScanner = new Scanner(System.in);
        boolean SimpleTuition = true;
        while (SimpleTuition) {
            System.out.println("\n> Enter The First Number: ");
            double simpleMathNumberOne = simpleMathScanner.nextDouble();
            System.out.println("\n> Enter The Second Number: ");
            double simpleMAthNumberTwo = simpleMathScanner.nextDouble();

            double sum = simpleMathNumberOne + simpleMAthNumberTwo;
            double difference = simpleMathNumberOne - simpleMAthNumberTwo;
            double product = simpleMathNumberOne * simpleMAthNumberTwo;
            double quotient = simpleMathNumberOne / simpleMAthNumberTwo;

            System.out.println("> Sum: " + sum);
            System.out.println("> Difference: " + difference);
            System.out.println("> Product: " + product);
            System.out.println("> Quotient: " + quotient);

            While.again();

        }
    }

    public static void retirementCalc(){
        Scanner retirementScanner = new Scanner(System.in);
        while (true) {
            System.out.print("\n> What is your current age? ");
            int currentAge = retirementScanner.nextInt();
            System.out.print("\n> At what age would you like to retire? ");
            int retirementAge = retirementScanner.nextInt();
            int yearsLeft = retirementAge - currentAge;
            if (yearsLeft > 0) {
                System.out.println("\n> You have " + yearsLeft + " years left until you can retire.");
                System.out.println("> You birth year is "+(2022 - currentAge)+" so you can retire in "+(2022 + yearsLeft));
            } else {
                System.out.println("You can already retire.");
            }
            While.again();

        }
    }

    public static void fizzBuss(){

        for(int i=1; i<=100; i++){
            if (i % 3 == 0){
                System.out.println("Fizz");
            }else if (i % 5 == 0 ){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }

    public static void areaRectangularRoom(){

        DecimalFormat df = new DecimalFormat("#.###");
        Scanner areaScanner = new Scanner(System.in);
        System.out.println("\n   ---> The Area of the Rectangular <---    ");

        while(true) {
            System.out.print("\n > What is the length of the room in feet? ");
            double areaLength = areaScanner.nextDouble();
            System.out.print("\n > What is the width of the room in feet? ");
            double areaWidth = areaScanner.nextDouble();

            System.out.println("\n    > You entered dimensions of " + areaLength + " feet by " + areaWidth + " feet.");

            double areaFeetSq = areaLength * areaWidth;
            double areaMeterSq = areaFeetSq / 10.764;

            System.out.println("\n > The Area of the Rectangular:");
            System.out.println("    > " + df.format(areaFeetSq) + " Square Feet");
            System.out.println("    > " + df.format(areaMeterSq) + " Square Meters");

            While.again();

        }
    }

    public static void areaRectangularRoomAI(){
        double length, width, areaInFeet, areaInMeters;
        final double feetSqToMeterSq = 0.09290304;
        Scanner input = new Scanner(System.in);
        String unit;

        System.out.print("Enter the length of the room: ");
        length = input.nextDouble();
        System.out.print("Enter the unit of measurement (ft or m): ");
        unit = input.next();

        if(unit.equals("ft")) {
            areaInFeet = length;
            areaInMeters = areaInFeet * feetSqToMeterSq;
        }
        else if(unit.equals("m")) {
            areaInMeters = length;
            areaInFeet = areaInMeters / feetSqToMeterSq;
        }
        else {
            System.out.println("Invalid unit of measurement entered.");
            return;
        }

        System.out.print("Enter the width of the room: ");
        width = input.nextDouble();
        System.out.print("Enter the unit of measurement (ft or m): ");
        unit = input.next();

        if(unit.equals("ft")) {
            areaInFeet = areaInFeet * width;
            areaInMeters = areaInFeet * feetSqToMeterSq;
        }
        else if(unit.equals("m")) {
            areaInMeters = areaInMeters * width;
            areaInFeet = areaInMeters / feetSqToMeterSq;
        }
        else {
            System.out.println("Invalid unit of measurement entered.");
            return;
        }
        System.out.printf("The area of the room is %.2f square feet and %.2f square meters.", areaInFeet, areaInMeters);
    }

    public static void pizzaParty(){

        Scanner pizzaScanner = new Scanner(System.in);

        while(true) {
            System.out.print("\n> How may people? ");
            int numberPeople = pizzaScanner.nextInt();

            System.out.print("\n> How many Pizza do you have? ");
            int numberPizza = pizzaScanner.nextInt();

            System.out.print("\n> How many slices per pizza: ");
            int numberSlices = pizzaScanner.nextInt();

            System.out.println("\n> " + numberPeople + " people with " + numberPizza + " pizzas ");

            int totalSlices = numberPizza * numberSlices;
            int slicesPerPerson = totalSlices / numberPeople;
            double pizzaLeft = totalSlices % numberPeople;

            System.out.println("\nEach person gets " + slicesPerPerson + " pieces of pizza.");
            System.out.println("There are " + pizzaLeft + " leftover pieces");

            While.again();

        }
    }

    public static void paintCalc(){

        DecimalFormat df = new DecimalFormat("#.###");
        Scanner paintScanner = new Scanner(System.in);
        System.out.println("\n   ---> The Area of the Rectangular <---    ");
        double areaLength, areaWidth,exactNumberGallon;

        while(true) {
            while(true){
                System.out.print("\n > What is the length of the room in feet? ");
                if (paintScanner.hasNextDouble()) {
                    areaLength = paintScanner.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a numeric value.");
                }
            }
            while(true){
                System.out.print("\n > What is the width of the room in feet? ");
                if (paintScanner.hasNextDouble()) {
                    areaWidth = paintScanner.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a numeric value.");

                }
            }

            System.out.println("\n    > You entered dimensions of " + areaLength + " feet by " + areaWidth + " feet.");

            double areaFeetSq = areaLength * areaWidth;

            System.out.println("\n    > The area of the room is " + areaFeetSq + " feet square.");

            exactNumberGallon = areaFeetSq / 350.0;
            int numberGallonNeeded = (int) Math.ceil(exactNumberGallon);

            System.out.println("\n> You will need to purchase " + df.format(numberGallonNeeded) + " paint to cover " + df.format(areaFeetSq) + " feet square.");

            While.again();

        }
    }

    public static void countStringLength(){

        Scanner lengthScanner = new Scanner(System.in);

        while(true){
            System.out.print("\n > Enter a String: ");
            String myString = lengthScanner.next();
            int stringLength = myString.length();
            System.out.println("\n > The length of \""+myString+"\" is " + stringLength+ " characters long ");
            System.out.println("\n> The String in Upper Case \""+myString.toUpperCase()+"\"");
            System.out.println("> The String in Lower Case \""+myString.toLowerCase()+"\"");

            While.again();

        }
    }

    public static void popOutWindow(){

        while(true) {
            String name = JOptionPane.showInputDialog(null, "what is your name?", "NAME", PLAIN_MESSAGE);
            String ageStr = JOptionPane.showInputDialog(null, "How old are you?", "AGE", PLAIN_MESSAGE);

//            int age = Integer.parseInt(ageStr);

            JOptionPane.showMessageDialog(null, "Hello " + name + ",\nYou are " + ageStr + " years old.", "Intro", PLAIN_MESSAGE);

            int Option = JOptionPane.showConfirmDialog(null,"Try Again?","Again?",JOptionPane.YES_NO_CANCEL_OPTION,PLAIN_MESSAGE);
            System.out.println(Option);

            if (Option != 0) {
                return;
            }
        }
    }

    public static void thePrime(){

        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> primes = new ArrayList<>();

        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        System.out.println("The prime numbers in the array are: " + primes);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void DNA(){
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

    public static void birthMonth(){
        Scanner birthMon = new Scanner(System.in);

        while(true){
            System.out.print("\nEnter your Birth Month. >  ");
            int birthMonth = birthMon.nextInt();

            if (birthMonth < 1 || birthMonth > 12) {
                System.out.println("Invalid input. Please enter a valid birth month.");
            } else if (birthMonth <= 6) {
                System.out.println("You were born in the first half of the year.");
            } else if (birthMonth == 6 || birthMonth == 7) {
                System.out.println("You were born in the middle of the year.");
            } else {
                System.out.println("You were born in the second half of the year.");
            }

            While.again();

        }
    }

    public static void numberToName(){

        Scanner numberToNameScanner = new Scanner(System.in);

        while (true){
            System.out.print("Please enter the number of the month: ");
            int monthNumber = numberToNameScanner.nextInt();

            if (monthNumber < 1 || monthNumber > 12) {
                System.out.println("Invalid month number. Please enter a value between 1 and 12.");
            } else {
                String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
                System.out.println("The name of the month is " + months[monthNumber - 1] + ".");
            }
            While.again();
        }
    }

    public static void temperatureConverter(){
        Scanner temperatureConvScanner = new Scanner(System.in);

        while(true){
            System.out.print("\nPress C to convert from Fahrenheit to Celsius. Press F to convert from Celsius to Fahrenheit. \nYour choice: ");
            char convertType = temperatureConvScanner.next().toLowerCase().strip().trim().charAt(0);
            System.out.print("Please enter the temperature: ");
            double temperature = temperatureConvScanner.nextDouble();

            if (convertType == 'c') {
                double celsius = (temperature - 32) * 5 / 9;
                System.out.println("The temperature in Celsius is " + celsius + ".");
            } else if (convertType == 'f') {
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.println("The temperature in Fahrenheit is " + fahrenheit + ".");
            } else {
                System.out.println("Invalid input.");
            }
            While.again();
        }
    }

    public static void comparingNumbers(){
        Scanner sc = new Scanner(System.in);
        while(true) {
            int num1, num2, num3;
            System.out.print("Enter the first number: ");
            num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            num2 = sc.nextInt();
            System.out.print("Enter the third number: ");
            num3 = sc.nextInt();

            if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("numbers should be different");
                return;
            }
            int largest = num1;
            if (num2 > largest) {
                largest = num2;
            }
            if (num3 > largest) {
                largest = num3;
            }
            System.out.println("The largest number is " + largest);

            While.again();
        }
    }

    public static void minConvertor(){

        DecimalFormat df = new DecimalFormat("#.###");
        Scanner conScanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter Number of Min.. ");
            Double numMin = conScanner.nextDouble();

            double numHours = numMin / 60;
            double numDay = numMin / 1440;

            System.out.printf("%s minutes equals %s hours and equals %s days.", df.format(numMin), df.format(numHours), df.format(numDay));

            While.again();
        }

    }

    public static void breakDownDollars(){

        Scanner scan = new Scanner(System.in);

        while(true) {

            System.out.print("\nEnter amount in dollars: ");
            int amount = scan.nextInt();

            int twenties = amount / 20;
            amount = amount % 20;
            int tens = amount / 10;
            amount = amount % 10;
            int fives = amount / 5;
            amount = amount % 5;
            int ones = amount;

            System.out.printf("\n Twenties: %d \n Tens: %d \n Fives: %d \n Ones: %d\n",twenties,tens,fives,ones);

            While.again();

        }
    }

    public static void sumEvenodd(){


        int[] aArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int evenSum = 0;
        int oddSum = 0;

        for (int number : aArray) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

    }


} // main class