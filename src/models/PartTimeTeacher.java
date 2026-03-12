package models;

public class PartTimeTeacher extends Teacher {
    private int activeHoursPerWeek;

    public PartTimeTeacher(String name, String baseSalary, int activeHoursPerWeek) {
        super(name, baseSalary);
        this.activeHoursPerWeek = activeHoursPerWeek;
    }

    @Override
    public double calculateSalary() {
        return Double.parseDouble(getBaseSalary()) * activeHoursPerWeek * 52;
    }

    public int getActiveHoursPerWeek() {
        return activeHoursPerWeek;
    }
    public void setActiveHoursPerWeek(int activeHoursPerWeek) {
        this.activeHoursPerWeek = activeHoursPerWeek;
    }
    @Override
    public String toString() {
        return "[Part Time Teacher] " + super.toString() +
                ", Active Hours Per Week: " + activeHoursPerWeek + " hours"
                + ", Calculated Salary: $" + String.format("%.2f", calculateSalary());
    }
}
