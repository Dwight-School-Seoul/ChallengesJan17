package OOPJune2;
import Main.*;
import java.util.*;

public class Rectangle {

    private static final Scanner scan = new Scanner(System.in);
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }


    public static void main(String[] args){

       while (true){
           System.out.printf("\n\t > %sEnter the length: %s ",CC.YELLOW_BRIGHT, CC.RESET);
           double length = While.getDoubleScanOnly(scan);

           System.out.printf("\t > %sEnter the width: %s ", CC.YELLOW_BRIGHT, CC.RESET);
           double width = While.getDoubleScanOnly(scan);


           Rectangle rectangle = new Rectangle(length, width);
           double area = rectangle.calculateArea();
           double perimeter = rectangle.calculatePerimeter();

           System.out.printf(" \n\t > Area: %s%s%s ", CC.GREEN_BRIGHT, area, CC.RESET);
           System.out.printf(" \n\t > Perimeter: %s%s%S",CC.GREEN_BRIGHT, perimeter, CC.RESET);
           While.again();
       }

    }



}
