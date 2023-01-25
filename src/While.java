import java.util.Scanner;

public class While {

    public static void again(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("\n > Try Again? <y/n> ");
            String Option = scanner.next();
            if (Option.equals("y")){
                break;
            }else if (Option.equals("n")){
                System.out.println("> Quitting");
                return;
            }else{
                System.out.println("> Error - \""+Option+"\" Not Fount! ");
            }
        }
    }
}
