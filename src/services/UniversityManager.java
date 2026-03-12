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
    public void startMenu() {
        String option;
        do {
            printMainMenu();
            option = scanner.nextLine().trim().toLowerCase();

            switch (option) {
                case "a":
                    printAllTeachers();
                    break;
                case "b":
                    printAllClassesMenu();
                    break;
                case "c":
                    createAndAddStudent();
                    break;
                case "d":
                    createNewClass();
                    break;
                case "e":
                    findClassesByStudentId();
                    break;
                case "f":
                    System.out.println("\n=== Thank you for using the University Management System. Goodbye! ===");
                    break;
                default:
                    System.out.println("\n[!] Invalid option. Please try again.");
            }
        } while (!option.equals("f"));
    }

    /**
     * Prints the main menu.
     */
    private void printMainMenu() {
        System.out.println("\n========================================");
        System.out.println("   UNIVERSITY MANAGEMENT SYSTEM");
        System.out.println("========================================");
        System.out.println("  a) Print all professors");
        System.out.println("  b) Print all classes (with submenu)");
        System.out.println("  c) Create a new student and add to a class");
        System.out.println("  d) Create a new class");
        System.out.println("  e) Find classes by student ID");
        System.out.println("  f) Exit");
        System.out.println("========================================");
        System.out.print("Select an option: ");
    }

    // ==================== OPTION A ====================

    /**
     * Option a: Prints all professors with their data.
     */
    private void printAllTeachers() {
        System.out.println("\n--- All Professors ---");
        System.out.println("Total teachers registered: " + Teacher.getTeacherCount());
        System.out.println();
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + teachers.get(i).toString());
        }
    }

    // ==================== OPTION B ====================

    /**
     * Option b: Prints all classes and offers a submenu to see details.
     */
    private void printAllClassesMenu() {
        System.out.println("\n--- All Classes ---");
        for (int i = 0; i < classes.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + classes.get(i).getName()
                    + " (Classroom: " + classes.get(i).getClassroom() + ")");
        }
        System.out.println("  0. Back to main menu");
        System.out.print("\nSelect a class number to see details (or 0 to go back): ");

        String input = scanner.nextLine().trim();
        try {
            int choice = Integer.parseInt(input);
            if (choice == 0) {
                return;
            }
            if (choice >= 1 && choice <= classes.size()) {
                System.out.println("\n" + classes.get(choice - 1).toString());
            } else {
                System.out.println("[!] Invalid class number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("[!] Please enter a valid number.");
        }
    }

    // ==================== OPTION C ====================

    /**
     * Option c: Creates a new student and adds them to an existing class.
     */
    private void createAndAddStudent() {
        System.out.println("\n--- Create New Student ---");

        System.out.print("Enter student name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Enter student ID: ");
        int id;
        try {
            id = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("[!] Invalid ID. Operation cancelled.");
            return;
        }

        // Check if ID already exists
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("[!] A student with ID " + id + " already exists. Operation cancelled.");
                return;
            }
        }

        System.out.print("Enter student age: ");
        int age;
        try {
            age = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("[!] Invalid age. Operation cancelled.");
            return;
        }

        Student newStudent = new Student(name, id, age);
        students.add(newStudent);

        // Select class to add student to
        System.out.println("\nAvailable classes:");
        for (int i = 0; i < classes.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + classes.get(i).getName());
        }
        System.out.print("Select class number to add the student: ");

        try {
            int classChoice = Integer.parseInt(scanner.nextLine().trim());
            if (classChoice >= 1 && classChoice <= classes.size()) {
                classes.get(classChoice - 1).addStudent(newStudent);
                System.out.println("\n[OK] Student '" + name + "' created and added to class '"
                        + classes.get(classChoice - 1).getName() + "'.");
            } else {
                System.out.println("[!] Invalid class number. Student was created but not added to any class.");
            }
        } catch (NumberFormatException e) {
            System.out.println("[!] Invalid input. Student was created but not added to any class.");
        }
    }

    // ==================== OPTION D ====================

    /**
     * Option d: Creates a new class with an existing teacher and existing students.
     */
    private void createNewClass() {
        System.out.println("\n--- Create New Class ---");

        System.out.print("Enter class name: ");
        String className = scanner.nextLine().trim();

        System.out.print("Enter classroom (e.g., Room 101): ");
        String classroom = scanner.nextLine().trim();

        // Select teacher
        System.out.println("\nAvailable teachers:");
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + teachers.get(i).getName());
        }
        System.out.print("Select a teacher by number: ");

        Teacher selectedTeacher;
        try {
            int teacherChoice = Integer.parseInt(scanner.nextLine().trim());
            if (teacherChoice >= 1 && teacherChoice <= teachers.size()) {
                selectedTeacher = teachers.get(teacherChoice - 1);
            } else {
                System.out.println("[!] Invalid teacher number. Operation cancelled.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("[!] Invalid input. Operation cancelled.");
            return;
        }

        // Select students
        UniversityClass newClass = new UniversityClass(className, classroom, selectedTeacher);

        System.out.println("\nAvailable students:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + students.get(i).toString());
        }
        System.out.println("\nEnter student numbers separated by commas (e.g., 1,3,5) or 'none' to skip:");
        String studentsInput = scanner.nextLine().trim();

        if (!studentsInput.equalsIgnoreCase("none") && !studentsInput.isEmpty()) {
            String[] parts = studentsInput.split(",");
            for (String part : parts) {
                try {
                    int sIndex = Integer.parseInt(part.trim());
                    if (sIndex >= 1 && sIndex <= students.size()) {
                        newClass.addStudent(students.get(sIndex - 1));
                    } else {
                        System.out.println("  [!] Skipping invalid student number: " + sIndex);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("  [!] Skipping invalid input: " + part.trim());
                }
            }
        }

        classes.add(newClass);
        System.out.println("\n[OK] Class '" + className + "' created successfully with "
                + newClass.getStudents().size() + " student(s).");
    }

    // ==================== OPTION E ====================

    /**
     * Option e: Lists all classes in which a given student (by ID) is enrolled.
     */
    private void findClassesByStudentId() {
        System.out.println("\n--- Find Classes by Student ID ---");
        System.out.print("Enter student ID: ");

        int searchId;
        try {
            searchId = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("[!] Invalid ID.");
            return;
        }

        // Find the student name for display
        String studentName = null;
        for (Student s : students) {
            if (s.getId() == searchId) {
                studentName = s.getName();
                break;
            }
        }

        if (studentName == null) {
            System.out.println("[!] No student found with ID " + searchId + ".");
            return;
        }

        System.out.println("\nClasses for student '" + studentName + "' (ID: " + searchId + "):");
        boolean found = false;
        for (UniversityClass uc : classes) {
            if (uc.hasStudent(searchId)) {
                System.out.println("  - " + uc.getName() + " (Classroom: " + uc.getClassroom() + ")");
                found = true;
            }
        }

        if (!found) {
            System.out.println("  This student is not enrolled in any class.");
        }
    }
}
}
