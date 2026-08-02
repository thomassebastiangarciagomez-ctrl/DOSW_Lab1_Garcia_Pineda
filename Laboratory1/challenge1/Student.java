package Laboratory1.challenge1;

public class Student {
    private String name;
    private int semester;
    private int age;
    private String email;

    public Student(String name, int semester, int age, String email){
        this.name = name;
        this.semester = semester;
        this.age = age;
        this.email = email;
    }
    public String getName(){
        return this.name;
    }
    public int getSemester(){
        return this.semester;
    }
    public int getAge(){
        return this.age;
    }
    public String getEmail(){
        return this.email;
    }
}
