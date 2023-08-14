package academy.devdojo.firstclasses.javacore.introductionmethods.domain;

public class Employee {

    public String name;
    public int age;
    public double[] salaries;

    public void printer() {
        System.out.println(this.name);
        System.out.println(this.age);

        if (salaries != null) {
            for (double salary : salaries) {
                System.out.print(salary + " ");
            }
        }
        printAverageSalary();
    }

    public void printAverageSalary() {
        double average = 0;

        if (salaries == null) {
            return;
        }

        for (double salary : salaries) {
            average += salary;
        }

        average /= salaries.length;
        System.out.println("\nAverage Wage: " + average);
    }

}
