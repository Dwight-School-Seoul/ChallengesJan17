package Challenges;

import java.util.Scanner;

public class GradeCalc {

    public static void main(){

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

}
