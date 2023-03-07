package Functions;

public class Dog {

    String bread , color;
    int size, age;

    public Dog(String bread, String color, int size, int age){
        this.bread = bread;
        this.color = color;
        this.size = size;
        this.age = age;
        System.out.println("\nFunctions.Dog Create");
    }

    public void sleep(){
        System.out.println("Functions.Dog is sleeping");
    }

    public void sit(){
        System.out.println("Functions.Dog sat down");

    }
    public void run(){
        System.out.println("Functions.Dog is running");
    }

    public void DogWait(){
        System.out.println("Functions.Dog is waiting ");
    }


}
