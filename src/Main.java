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


    }
}