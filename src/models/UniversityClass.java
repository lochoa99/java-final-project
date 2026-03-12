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

    public boolean hasStudent(int studentId) {
        for (Student s : students) {
            if (s.getId() == studentId) {
                return true;
            }
        }
        return false;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClassroom() {
        return classroom;
    }
    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Class ").append(name)
                .append("\n | Classroom: ").append(classroom)
                .append("\n | Teacher: ").append(teacher)
                .append("\n | Students: ").append(students.size()).append("):");
        for (Student s : students) {
            sb.append("\n   - ").append(s.toString());
        }
        return sb.toString();
    }

}
