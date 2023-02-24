public class Dog {

    String bread , color;
    int size, age;

    public Dog(String bread, String color, int size, int age){
        this.bread = bread;
        this.color = color;
        this.size = size;
        this.age = age;
        System.out.println("\nDog Create");
    }

    public void sleep(){
        System.out.println("Dog is sleeping");
    }

    public void sit(){
        System.out.println("Dog sat down");

    }
    public void run(){
        System.out.println("Dog is running");
    }

    public void DogWait(){
        System.out.println("Dog is waiting ");
    }


}
