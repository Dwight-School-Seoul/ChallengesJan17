package inheritance;

public class Student extends Member{

    String role = "Student";
    public Student(String name, int age, double weight, String Gender) {
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

    public void takeExam(){
        System.out.println("Student is taking the Exam...");
    }

    public void doHomeWork(){
        System.out.println("Student is doing his HomeWork");
    }

}
