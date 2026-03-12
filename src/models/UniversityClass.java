package models;
import java.util.ArrayList;

public class UniversityClass {
    private String name;
    private String classroom;
    private Teacher teacher;
    private ArrayList<Student> students;

    public UniversityClass(String name, String classroom, Teacher teacher){
        this(name, classroom, teacher, new ArrayList<>());
    }

    public UniversityClass(String name, String classroom, Teacher teacher, ArrayList<Student> students) {
        this.name = name;
        this.classroom = classroom;
        this.teacher = teacher;
        this.students = new ArrayList<>(students);
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public static hasStudent(int studentId) {
        for (Student s : students) {
            if (s.getId() == studentId) {
                return true;
            }
        }
        return false;
    }


}
