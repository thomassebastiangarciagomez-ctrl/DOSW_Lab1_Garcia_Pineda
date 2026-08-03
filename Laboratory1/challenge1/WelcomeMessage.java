package challenge1;
import java.util.*;
import java.util.stream.Collectors;

/**
 * This is a Wellcome message class and it´s part of challenge 1
 * 
 */
public class WelcomeMessage {
    private List<Student> students;


    public WelcomeMessage(){
        students = new ArrayList<>();
        students.add(new Student("Jose Garcia",6,19,"jose.gpineda@mail.escuelaing.edu.co"));
        students.add(new Student("Thomas Garcia", 6, 19, "thomas.garcia-g@mail.escuelaing.edu.co"));
    }

    /**
     * This method works on create the wellcome message from challenge 1 laboratory 1
     * 
     */
    public void printMessage(){
        System.out.println("Hello and welcome!\n");
        String description = students.stream()
            .map(s -> 
                s.getName() + ", a " + s.getSemester() +"th-semester student, "+
                s.getAge() + " years old"
            )
            .collect(Collectors.joining(",\nand "));
        
        String emailsInfo = students.stream()
            .map(s -> s.getEmail())
            .collect(Collectors.joining("\n"));

        System.out.println("We are "+ description + ".\n\n" + "Our institutional emails are:\n" + emailsInfo);
    }
}
