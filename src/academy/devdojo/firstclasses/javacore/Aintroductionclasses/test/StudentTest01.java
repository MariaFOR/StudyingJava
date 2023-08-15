package academy.devdojo.firstclasses.javacore.Aintroductionclasses.test;

import academy.devdojo.firstclasses.javacore.Aintroductionclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Vito";
        student.age = 26;
        student.gender = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
        System.out.println(student);
    }
}
