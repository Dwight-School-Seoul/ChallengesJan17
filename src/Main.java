import inheritance.*;

public class Main {
    public static void main(String[] main) {


        Student john = new Student("john", 17, 70,"Male");


        john.info();
        john.eatLunch();
        john.doHomeWork();
        john.takeExam();

        Teacher teacher = new Teacher("teacher", 32, 93.7,"Male");

        teacher.info();
        teacher.eatLunch();
        teacher.prepareLesson();
        teacher.makeExam();


    } // void main


} // Main