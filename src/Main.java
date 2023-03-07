import Functions.*;
import java.util.*;

public class Main {
    public static void main(String[] main) {

        AdultPerson person = new AdultPerson("John", 18, "Korea");

        person.setLanguages("Korean, English and Arabic");
        person.weight(100);
        person.age(17);


        person.selfIntroduce();

    } // void main

} // Main