import java.util.Scanner;

public class While {

    public static void again(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print(ConsoleColors.WHITE_BOLD_BRIGHT+"\n ⚪️ Try Again? < Yes / No > ");
            String Option = scanner.next().toLowerCase().trim().strip();
            if (Option.equals("yes")){
                break;
            }else if (Option.equals("no")){
                System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+"\n 🎣 Quitting");
                System.exit(0);
            }else{
                System.out.println(ConsoleColors.RED_BOLD_BRIGHT+" ⛔️ Error - \""+Option+"\" Not Fount! ");
            }
        }
    }
}
