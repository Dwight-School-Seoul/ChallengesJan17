import javax.swing.*;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;

public class Main {
    public static void main(String[] args) {

        while(true) {
            String name = JOptionPane.showInputDialog(null, "what is your name?", "NAME", PLAIN_MESSAGE);
            String ageStr = JOptionPane.showInputDialog(null, "How old are you?", "AGE", PLAIN_MESSAGE);
//            int age = Integer.parseInt(ageStr);
            JOptionPane.showMessageDialog(null, "Hello " + name + ",\nYou are " + ageStr + " years old.", "Intro", PLAIN_MESSAGE);

            int Option = JOptionPane.showConfirmDialog(null,"Try Again?","Again?",JOptionPane.YES_NO_CANCEL_OPTION,PLAIN_MESSAGE);

            if(Option == 0){
                continue;
            }else{
                return;
            }
        }




    } //void main
} // main Class