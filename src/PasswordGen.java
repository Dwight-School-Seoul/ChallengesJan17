import java.util.*;

public class PasswordGen {
    public static void main(){
        Scanner scan = new Scanner(System.in);

        char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R', 'S','T', 'U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','m','o','p','q','r', 's','t', 'u','v','w','x','y','z'};
        char[] specialCharacters = {'!','@','#','$','%','^','&','*','(',')','-','+','='};
        int[] numbers = {1,2,3,4,5,6,7,8,9,0};

        while (true) {

            System.out.print(ConsoleColors.YELLOW_BRIGHT+"\n 🔐 Enter the length of the password? ");
            int passwordLength = getScan(scan);

            System.out.print(ConsoleColors.YELLOW_BRIGHT+"\n ⚒️ How many special characters? ");
            int specialCharCount = getScan(scan);

            System.out.print(ConsoleColors.YELLOW_BRIGHT+"\n ⚙️ How many numbers? ");
            int numCount = getScan(scan);

            int total = passwordLength - specialCharCount - numCount;

            if (total < 0) {
                System.out.println(ConsoleColors.RED_BOLD_BRIGHT+"\n ⛔️ ERROR - The length of the password should be higher than 0.");
                if(specialCharCount > passwordLength){
                    System.out.println(ConsoleColors.RED_BOLD_BRIGHT+" ⛔️ ERROR - The length of the " + ConsoleColors.YELLOW_BRIGHT +"special characters" + ConsoleColors.RED_BOLD_BRIGHT+ " should be less that The Password Length.");
                }
                if (numCount > passwordLength){
                    System.out.println(ConsoleColors.RED_BOLD_BRIGHT+" ⛔️ ERROR - The length of the " + ConsoleColors.YELLOW_BRIGHT +"Numbers" + ConsoleColors.RED_BOLD_BRIGHT+ " should be less that The Password Length.");
                }
                return;
            }

            String rawPassword="";

            for (int i = 0; i < total; i++) {
                rawPassword += get(letters);
            }
            for (int i = 0; i < specialCharCount; i++) {
                rawPassword += get(specialCharacters);
            }
            for (int i = 0; i < numCount; i++) {
                rawPassword += getInt(numbers);
            }

            char[] shufflePassword = rawPassword.toCharArray();
            randomizeString(shufflePassword);
            String finalPassword =  new String(shufflePassword);

            System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT+"\n 🔑 Your Generated password is: " +ConsoleColors.RESET+ finalPassword);

            While.again();
        }
    }
    private static int getScan(Scanner scan){
        while (!scan.hasNextInt()){
            System.out.print(ConsoleColors.RED_BOLD_BRIGHT+"\n ⛔️ Invalid Input, Must Be Numbers,"+ConsoleColors.YELLOW_BRIGHT+" Try Again!: ");
            scan.next();
        }
        return scan.nextInt();
    }
    private static void randomizeString(char[] password) {
        Random random = new Random();

        for (int i = password.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            char temp = password[index];
            password[index] = password[i];
            password[i] = temp;
        }
    }
    private static char get(char[] letters) {
        Random rand = new Random();
        return letters[rand.nextInt(letters.length)];
    }
    private static int getInt(int[] numbers) {
        Random rand = new Random();
        return numbers[rand.nextInt(numbers.length)];
    }
} // MAIN