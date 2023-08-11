package academy.devdojo.firstclasses.javacore.introductionmethods.test;

import academy.devdojo.firstclasses.javacore.introductionmethods.domain.Student;
import academy.devdojo.firstclasses.javacore.introductionmethods.domain.StudentPrinter;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Urio";
        student01.age = 9;
        student01.gender = 'F';

        student02.name = "Anabel";
        student02.age = 10;
        student02.gender = 'F';

        student01.printer();
        student02.printer();
    }
}
