package services;
import models.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UniversityManager {

    private ArrayList<UniversityClass> classes;
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private Scanner scanner;

    public UniversityManager(ArrayList<UniversityClass> classes,
                             ArrayList<Teacher> teachers,
                             ArrayList<Student> students) {
        this.classes = classes;
        this.teachers = teachers;
        this.students = students;
        this.scanner = new Scanner(System.in);
    }
}
