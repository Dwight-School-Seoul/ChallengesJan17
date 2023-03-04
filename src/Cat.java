import java.util.Scanner;

public class Cat {

     private int mood= 5, hungry = 5, energy = 5;

    public void meow(){
        System.out.printf("%s\nCat Stats: %s\t\nmood: %s,\t\nhunger: %s, \t\nenergy: %s\n\n\n"+ConsoleColors.RESET,ConsoleColors.YELLOW_BRIGHT,ConsoleColors.GREEN_BRIGHT, mood, hungry, energy);
    }

    public void sleep(){
        mood++;
        energy ++;
        hungry ++;
        System.out.println(ConsoleColors.CYAN+"\n\nMeow! \n"+ ConsoleColors.RESET);
    }

    public void play(){
        mood ++;
        energy--;
        hungry ++;
        System.out.println(ConsoleColors.CYAN+"\n\nMeow! \n"+ ConsoleColors.RESET);
    }

    public void feed(){
       if(hungry > 0 ){
           hungry--;
       }
        mood++;
        System.out.println(ConsoleColors.CYAN+"\n\nMeow! \n"+ ConsoleColors.RESET);
    }

    public void scratch() {
        mood--;
        energy++;
        System.out.println(ConsoleColors.CYAN+"\n\nMeow! \n"+ ConsoleColors.RESET);
    }

    public void purr() {
        mood++;
        energy++;
        System.out.println(ConsoleColors.CYAN+"\n\nPurr! \n"+ ConsoleColors.RESET);
    }

    public void hunt() {
        hungry--;
        mood++;
        energy++;
        System.out.println(ConsoleColors.CYAN+"\n\nMeow! \n"+ ConsoleColors.RESET);
    }

    public void groom() {
        mood++;
        hungry--;
        System.out.println(ConsoleColors.CYAN+"\n\nMeow! \n"+ ConsoleColors.RESET);
    }

    public void hiss() {
        mood--;
        energy--;
        System.out.println(ConsoleColors.CYAN+"\n\nHiss! \n"+ ConsoleColors.RESET);
    }

    public static void catGame(){
        Scanner scanner = new Scanner(System.in);
        Cat cat = new Cat();
        boolean quit = false;

        System.out.println("Welcome to the cat simulator game!\n");
        while (!quit) {
            System.out.println("What would you like to do with the cat?");
            System.out.println("1. Check cat stats");
            System.out.println("2. Feed the cat");
            System.out.println("3. Play with the cat");
            System.out.println("4. Put the cat to sleep");
            System.out.println("5. Scratch with the cat");
            System.out.println("6. Purr with the cat");
            System.out.println("7. Hunt with the cat");
            System.out.println("8. Groom the cat");
            System.out.println("9. Make the cat hiss");
            System.out.println("10. Quit the game");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cat.meow();
                    break;
                case 2:
                    cat.feed();
                    break;
                case 3:
                    cat.play();
                    break;
                case 4:
                    cat.sleep();
                    break;
                case 5:
                    cat.scratch();
                    break;
                case 6:
                    cat.purr();
                    break;
                case 7:
                    cat.hunt();
                    break;
                case 8:
                    cat.groom();
                    break;
                case 9:
                    cat.hiss();
                    break;
                case 10:
                    quit = true;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
