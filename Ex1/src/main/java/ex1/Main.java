package ex1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[]{
          new Employee("John Smith", 5, 10),
          new Employee("Sandra Wang", 4, 5),
          new Employee("Gio Rossi", 7, 12),
        };

        for (Employee employee : employees) {
            employee.computeFinalSalary();
            employee.getInfo();

        }
    }
}
