package academy.devdojo.firstclasses.javacore.Bintroductionmethods.test;

import academy.devdojo.firstclasses.javacore.Bintroductionmethods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("Fortnelson");
        employee.setAge(34);
        employee.setSalaries (new double[]{1200, 937.32, 2000});

        employee.printer();

        System.out.println("Average " + employee.getAverage());
    }
}
