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

        // Class 1: Java Programming
        ArrayList<Student> class1Students = new ArrayList<>();
        class1Students.add(s1);
        class1Students.add(s2);
        class1Students.add(s3);
        UniversityClass class1 = new UniversityClass("Java Programming", "Room 101", ft1, class1Students);

        // Class 2: Data Structures
        ArrayList<Student> class2Students = new ArrayList<>();
        class2Students.add(s2);
        class2Students.add(s4);
        class2Students.add(s5);
        UniversityClass class2 = new UniversityClass("Data Structures", "Room 202", ft2, class2Students);

        // Class 3: Web Development
        ArrayList<Student> class3Students = new ArrayList<>();
        class3Students.add(s1);
        class3Students.add(s5);
        class3Students.add(s6);
        UniversityClass class3 = new UniversityClass("Web Development", "Room 303", pt1, class3Students);

        // Class 4: Database Systems
        ArrayList<Student> class4Students = new ArrayList<>();
        class4Students.add(s3);
        class4Students.add(s4);
        class4Students.add(s6);
        UniversityClass class4 = new UniversityClass("Database Systems", "Room 404", pt2, class4Students);

        ArrayList<UniversityClass> classes = new ArrayList<>();
        classes.add(class1);
        classes.add(class2);
        classes.add(class3);
        classes.add(class4);

        // ============================
        // Start the University Manager
        // ============================

        System.out.println("=== University Management System ===");
        System.out.println("Loaded: " + Teacher.getTeacherCount() + " teachers, "
                + Student.getStudentCount() + " students, " + classes.size() + " classes.\n");

        UniversityManager manager = new UniversityManager(teachers, students, classes);
        manager.startMenu();

    }
}