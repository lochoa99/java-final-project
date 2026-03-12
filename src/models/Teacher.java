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
    public abstract double calculateSalary();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(String baseSalary) {
        this.baseSalary = baseSalary;
    }

    public static int getTeacherCount() {
        return teacherCount;
    }

    @Override
    public String toString() {
        return "name: " + name + ", Base Salary: $" + String.format("%.2f", baseSalary);
    }
}
