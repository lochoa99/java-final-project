package models;

public class PartTimeTeacher extends Teacher {
    private int activeHoursPerWeek;

    public PartTimeTeacher(String name, String baseSalary, int activeHoursPerWeek) {
        super(name, baseSalary);
        this.activeHoursPerWeek = activeHoursPerWeek;
    }
}
