package Functions;

import java.util.Scanner;

public class StoryGenerator {

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

    public static void storyGenV2(){
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
}
