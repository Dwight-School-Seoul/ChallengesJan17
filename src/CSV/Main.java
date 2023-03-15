package CSV;

import Main.*;
import java.util.*;
import java.io.*;
public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        try {

            FileReader fr = new FileReader("src/CSV/ComputerScience.csv");
            BufferedReader br = new BufferedReader(fr);

            System.out.println("|Name                    |Last Name               |Grade                   |Role");

            while(br.ready()){
                String[] line = br.readLine().split(",");
                for(String index: line){
                    System.out.printf("%-25s",index);
                }
                System.out.println();

            }
            br.close();

        }catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println(CC.BLUE+"\nThanks! ");
        }

    }

}
