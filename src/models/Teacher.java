package models;

public abstract class Teacher {
    private static int teacherCount = 0;
    private String name;
    private String baseSalary;

    public Teacher(String name, String baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        teacherCount++;
    }

}
