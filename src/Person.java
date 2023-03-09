public class Person {

    private String name;
    private int age;
    private static String nationality;
    private static String languages;


    public Person(String name, int age, String nationality, String languages){
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.languages = languages;

    }

    public void selfIntroduce(){

        System.out.printf("\nHi my name is %s",name);
        System.out.printf("\nI'm from %s\n",nationality);
    }

    public void speak(){
        System.out.printf("\nI speak %s\n", languages);
    }

}
