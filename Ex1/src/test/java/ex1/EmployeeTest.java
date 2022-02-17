package ex1;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


class EmployeeTest {

    private Employee employeeTest;

    @BeforeEach
    void setUp() {
        System.out.println("Start testcase ...");
        employeeTest = new Employee("Nghia", 8, 15);
    }

    @org.junit.jupiter.api.Test
    void computeBaseSalary() {
        employeeTest.computeBaseSalary();
        assertEquals(300.0, employeeTest.getBaseSalary());
    }

    @org.junit.jupiter.api.Test
    void addSal() {
        employeeTest.computeBaseSalary();
        employeeTest.addSal();
        assertEquals(310.0, employeeTest.getBaseSalary());
    }

    @org.junit.jupiter.api.Test
    void addWork() {
        employeeTest.addWork();
        assertEquals(20.0, employeeTest.getSalaryPerDay());
    }

    @org.junit.jupiter.api.Test
    void computeFinalSalary() {
        employeeTest.computeFinalSalary();
        assertEquals(410.0, employeeTest.getFinalSalary());
    }
}