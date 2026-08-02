package Laboratory1.challenge1;
import java.util.*;

public class Student {
    private String name;
    private String semester;
    private String years;
    private String email;
    private List<String> information;

    public Student(String name, String semester, String years, String email){
        this.name = name;
        this.semester = semester;
        this.years = years;
        this.email = email;
        information = new ArrayList<>();
    }

    public List<String> getInformation(){
        information.add(name);
        information.add(semester);
        information.add(years);
        information.add(email);
        return information;
    }
}
