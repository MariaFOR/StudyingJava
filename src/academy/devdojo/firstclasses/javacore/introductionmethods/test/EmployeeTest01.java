package academy.devdojo.firstclasses.javacore.introductionmethods.test;

import academy.devdojo.firstclasses.javacore.introductionmethods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "Fortnelson";
        employee.age = 34;
        employee.salaries = new double[]{1200, 937.32, 2000};

        employee.printer();

    }
}
