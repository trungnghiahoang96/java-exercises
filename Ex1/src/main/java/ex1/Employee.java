package ex1;

public class Employee {

    private String name;
    private int workingHoursPerDay;
    private double salaryPerDay;
    private double baseSalary = 0.0;
    private double finalSalary = 0.0;

    public static final int MONTHLY_WORKING_DAY = 20;

    public Employee(String name, int workingHoursPerDay, double salaryPerDay) {
        this.name = name;
        this.workingHoursPerDay = workingHoursPerDay;
        this.salaryPerDay = salaryPerDay;
    }

    public String getName() {
        return name;
    }

    public int getWorkingHoursPerDay() {
        return workingHoursPerDay;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getFinalSalary() {
        return finalSalary;
    }

    public void getInfo() {
        System.out.println("Name: " + getName() + " has Final Salary: " + getFinalSalary());
    }

    public void computeBaseSalary() {
        baseSalary = salaryPerDay * MONTHLY_WORKING_DAY;
    }

    public void addSal() {
        if (baseSalary < 500.0) {
            baseSalary += 10;
        }
    }

    public void addWork() {
        if (workingHoursPerDay > 6) {
            salaryPerDay += 5;
        }

    }

    public void computeFinalSalary() {
        addWork();
        computeBaseSalary();
        addSal();
        finalSalary = baseSalary;
    }
}
