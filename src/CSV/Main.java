package CSV;

import java.io.*;
import java.util.Scanner;

import Main.*;
public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        String line;
        try{
            FileReader fRead = new FileReader("src/CSV/ComputerScience.csv");
            BufferedReader reader = new BufferedReader(fRead);

            while(((line = reader.readLine()) != null)){

                String[] data = line.split(",");
                System.out.printf("""
                        Name: %s
                        Grade: %s
                        Role: %s
                        
                        """, data[0], data[2], data[3]);
            }
            reader.close();

            FileWriter csvWriter = new FileWriter("src/CSV/ComputerScience.csv", true);
            csvWriter.append("\n");

            System.out.print("\n Enter your first name: ");
            String name = While.getStringScanOnly(scan);
            System.out.print("\n Enter your last name: ");
            String lastName = While.getStringScanOnly(scan);
            System.out.print("\n Enter your grade: ");
            int grade = While.getIntegerScanOnly(scan);
            System.out.print("Enter your role: ");
            String role = While.getStringScanOnly(scan);

            csvWriter.write(String.format("\"%s\",\"%s\",%s,\"%s\"",name, lastName, grade, role));
            csvWriter.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
