package Party;

import Main.*;
import java.util.*;

public class DinnerParty extends Party{

    private String Menu;
    private static final Scanner scan = new Scanner(System.in);
    private int DinnerChoice;
    public DinnerParty(String name) {
        super(name);
    }

    public void getDinnerChoice(){
        System.out.println(CC.GREEN_BOLD_BRIGHT+"\nYour Dinner Choice: " + DinnerChoice);
        System.out.printf(CC.YELLOW_BOLD_BRIGHT+"Menu Option %s%s%s will be served",CC.GREEN_BOLD_BRIGHT, DinnerChoice, CC.YELLOW_BOLD_BRIGHT );
    }

    public int getDinnerChoiceV2(){
        return DinnerChoice;
    }

    public void setDinnerChoice(){
        System.out.print(CC.YELLOW_BOLD_BRIGHT+"\nEnter your Dinner Choice: ");
        DinnerChoice  = While.getIntegerScanOnly(scan);
    }

    public void getMenu(){
        System.out.println(CC.CYAN_BOLD_BRIGHT+"""
                
                1. Chicken
                2. Beef
                3. Fish""");
    }
}
