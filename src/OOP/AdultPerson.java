package OOP;

public class AdultPerson {

    private final String name;
    private String food;
    private String nationality;
    private String languages;
    private int age;
    private double weight;
    private boolean isAdult;

    public AdultPerson(String name, int age, String nationality){
        this.name = name;
        this.age = age;
        isAdult = this.age >= 18;
        this.nationality = nationality;
    }

    public void selfIntroduce(){

        System.out.printf("\nHi my name is %s\n",name);
        System.out.printf("I'm from %s\n",nationality);
        System.out.printf("I speak %s\n", languages);
        System.out.printf("I Weight %sKg\n",weight);
        if(isAdult){
            System.out.printf("I am an Adult (%s years old)\n",age);
        }else{
            System.out.printf("I am a %s years old Kid\n",age);
        }

    }
    public void age(int newAge){
        this.age = newAge;
        isAdult = age >= 18;
    }

    public void weight(double newWeight){
        this.weight = newWeight;
    }

    public void setLanguages(String languages){
        this.languages = languages;
    }

    public void setNationality(String newNationality){
        this.nationality = newNationality;
    }

}
