import models.Teacher;
import models.FullTimeTeacher;
import models.PartTimeTeacher;
import models.Student;
import models.UniversityClass;
import services.UniversityManager;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        FullTimeTeacher ft1 = new FullTimeTeacher("Dr. Carlos Martinez", 2000.00, 10);
        FullTimeTeacher ft2 = new FullTimeTeacher("Dr. Ana Rodriguez", 2500.00, 8);

        // Part-time teachers
        PartTimeTeacher pt1 = new PartTimeTeacher("Prof. Luis Garcia", 50.00, 20);
        PartTimeTeacher pt2 = new PartTimeTeacher("Prof. Maria Lopez", 45.00, 15);

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(ft1);
        teachers.add(ft2);
        teachers.add(pt1);
        teachers.add(pt2);

        Student s1 = new Student("Juan Perez", 101, 20);
        Student s2 = new Student("Laura Sanchez", 102, 21);
        Student s3 = new Student("Pedro Gomez", 103, 19);
        Student s4 = new Student("Sofia Ramirez", 104, 22);
        Student s5 = new Student("Diego Torres", 105, 20);
        Student s6 = new Student("Valentina Cruz", 106, 23);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

    }
}