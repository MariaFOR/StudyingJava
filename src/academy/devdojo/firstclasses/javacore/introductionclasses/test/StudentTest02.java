package academy.devdojo.firstclasses.javacore.introductionclasses.test;

import academy.devdojo.firstclasses.javacore.introductionclasses.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student = new Student();
        Student studant2 = new Student();

        student.name = "Nana";
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);

        System.out.println("--------------");

        System.out.println(studant2.name);
        System.out.println(studant2.age);
        System.out.println(studant2.gender);
    }
}
