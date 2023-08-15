package academy.devdojo.firstclasses.javacore.Bintroductionmethods.test;

import academy.devdojo.firstclasses.javacore.Bintroductionmethods.domain.Student;
import academy.devdojo.firstclasses.javacore.Bintroductionmethods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        StudentPrinter printer = new StudentPrinter();

        student01.name = "Urio";
        student01.age = 9;
        student01.gender = 'F';

        student02.name = "Anabel";
        student02.age = 10;
        student02.gender = 'F';

        System.out.println(student01.name);
        System.out.println(student01.age);
        System.out.println(student01.gender);

        System.out.println("--------------------");

        System.out.println(student02.name);
        System.out.println(student02.age);
        System.out.println(student02.gender);

        printer.printer(student01);
        printer.printer(student02);

        System.out.println("#######################");

        printer.printer(student01);
        printer.printer(student02);
    }
}
