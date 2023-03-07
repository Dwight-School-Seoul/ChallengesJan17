public class AdultPerson {

    private String name, food, nationality, languages;
    private int age;
    private double weight;
    private boolean isAdult = false;

    public AdultPerson(String name, int age, String nationality){
        this.name = name;
        this.age = age;
        if(age>=18){
            isAdult = true;
        }
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
        if(age>=18){
            isAdult = true;
        }else{
            isAdult = false;
        }
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
