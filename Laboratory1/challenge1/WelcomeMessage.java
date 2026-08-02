package Laboratory1.challenge1;
import java.util.*;
import java.util.stream.Collectors;

public class WelcomeMessage {
    private List<Student> students;
    public WelcomeMessage(){
        students = new ArrayList<>();
        students.add(new Student("Jose Garcia",6,19,"jose.gpineda@mail.escuelaing.edu.co"));
        students.add(new Student("Dos", 8, 21, "s@mail.com"));
    }

    public void printMessage(){
        System.out.println("Hello and welcome!\n");
        String description = students.stream()
            .map(s -> 
                s.getName() + ", a " + s.getSemester() +"th-semester student, "+
                s.getAge() + " years old"
            )
            .collect(Collectors.joining(" and "));
        System.out.println("We are "+ description + ".\n");
    }
}
