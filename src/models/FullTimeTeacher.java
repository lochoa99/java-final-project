package models;
import java.text.DecimalFormat;

public class FullTimeTeacher extends Teacher {
    private int experienceYears;

    public FullTimeTeacher(String name, String baseSalary, int experienceYears) {
        super(name, baseSalary);
        this.experienceYears = experienceYears;
    }

    @Override
    public double calculateSalary() {
        return Double.parseDouble(getBaseSalary()) * 1.10 * experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }
    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
    @Override
    public String toString() {
        return "[Full Time Teacher] " + super.toString() + ", Experience Years: " + experienceYears + " years"
                + ", Calculated Salary: $" + String.format("%.2f", calculateSalary());
    }
}
