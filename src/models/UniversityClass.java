package models;
import java.util.ArrayList;

public class UniversityClass {
    private String name;
    private String classroom;
    private Teacher teacher;
    private ArrayList<Student> students;
    /**
    * @param name
    * @param classroom
    * @param teacher
    * @param students
    */
    public UniversityClass(String name, String classroom, Teacher teacher, ArrayList<Student> students) {
        this.name = name;
        this.classroom = classroom;
        this.teacher = teacher;
        this.students = new ArrayList<>(students);
    }
    /**
     * @param student
     */
    public void addStudent(Student student) {
        students.add(student);
    }
    /**
     * @param studentId
     */
    public static hasStudent(int studentId) {
        for (Student s : students) {
            if (s.getId() == studentId) {
                return true;
            }
        }
        return false;
    }


}
