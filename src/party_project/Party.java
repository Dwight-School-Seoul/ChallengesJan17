package party_project;

import java.util.*;
import Main.*;


public class Party {

    private static String name;
    private static int numGuests;

    private static Scanner scan = new Scanner(System.in);

    public Party(String name){
        this.name = name;
    }

    public void partyInfo(){
        System.out.printf("""
                Party name: %s
                Party Guests: %s
                """,name,numGuests);
    }
    public void getGuests(){
        System.out.println(CC.YELLOW_BOLD_BRIGHT+"\nNumber of Guests:" + numGuests);
    }

    public void setGuests(){
        System.out.print(CC.YELLOW_BOLD_BRIGHT+"\nEnter the number of Guests: ");
        numGuests = While.getIntegerScanOnly(scan);
    }

    public void displayInvite(){
        System.out.println(CC.CYAN_BOLD_BRIGHT+"\nPlease come to my party!");
    }


}
