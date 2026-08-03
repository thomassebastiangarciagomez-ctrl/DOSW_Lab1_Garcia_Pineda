package challenge1;

/**
 * This is a student class and it´s part of challenge 1
 * 
 */
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

    /**
     * This method returns the name of the student
     * 
     * @return String that represent the name student
     */
    public String getName(){
        return this.name;
    }

    /**
     * This method returns the semester of the student
     * 
     * @return Integer that represents the semester of student
     */
    public int getSemester(){
        return this.semester;
    }

    /**
     * This method returns the age of the student
     * 
     * @return Integer that represents the age of student
     */
    public int getAge(){
        return this.age;
    }

    /**
     * This method returns the email of the student
     * 
     * @return String that represents the email of student
     */
    public String getEmail(){
        return this.email;
    }
}
