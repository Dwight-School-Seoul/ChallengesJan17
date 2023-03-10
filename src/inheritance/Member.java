package inheritance;

public class Member {

    String name;
    String gender;
    int age;
    double weight;


    public Member(String name, int age, double weight, String gender){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public void eatLunch(){
        System.out.println("Eating Lunch...");
    }


}
