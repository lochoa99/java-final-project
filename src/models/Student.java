package models;

public class Student {
    private static int studentCount = 0;
    private String name;
    private int id;
    private int age;

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        studentCount++;
    }
}
