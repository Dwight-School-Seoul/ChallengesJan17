package inheritance;

public class Teacher extends Member{

    String role = "Teacher";

    public Teacher(String name, int age, double weight, String Gender) {
        super(name, age, weight, Gender);
    }


    public void info(){
        System.out.printf("""
                
                info:
                    name: %s
                    age: %s
                    weight: %sKg
                    gender: %s
                    role : %s 
                
                """, name, age, weight, gender, role);
    }
    public void makeExam(){
        System.out.println("Teacher is making the Exam...");
    }

    public void prepareLesson(){
        System.out.println("Teacher is preparing to the Lesson...");
    }


}
