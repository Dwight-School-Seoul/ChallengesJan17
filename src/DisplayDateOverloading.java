import java.security.PublicKey;

public class DisplayDateOverloading {

    public static void displayDate(int month){
        System.out.printf("\nMonth: %s\n",month);
    }

    public static void displayDate(int month, int day){
        System.out.printf("\nDay: %s\n",day);
        System.out.printf("Month: %s\n",month);
    }

    public static void displayDate(int month , int day, int year){
        System.out.printf("\nDay: %s\n",day);
        System.out.printf("Month: %s\n",month);
        System.out.printf("Year: %s\n",year);

    }



    private int policyNumber;
    private int numPayments;
    private String residentCity;



}
