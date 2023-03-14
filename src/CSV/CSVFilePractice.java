package CSV;

import java.io.*;
import java.util.Scanner;

import Main.*;
public class CSVFilePractice {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(){


        try{
            FileReader fr = new FileReader("src/CSV/ComputerScience.csv");
            BufferedReader br = new BufferedReader(fr);

            while(br.ready()){

                String[] data = br.readLine().split(",");

                System.out.printf("""
                        Name: %s
                        Grade: %s
                        Role: %s
                        
                        """, data[0], data[2], data[3]);
            }
            br.close();

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

    public static void main2(){

        try {

            FileReader fr = new FileReader("src/CSV/ComputerScience.csv");
            BufferedReader br = new BufferedReader(fr);

            System.out.println("|Name         |Last Name   |Grade       |Role");

            while(br.ready()){
                String[] line = br.readLine().split(",");
                for(String index: line){
                    System.out.printf("%-13s",index);
                }
                System.out.println();

            }
            br.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
