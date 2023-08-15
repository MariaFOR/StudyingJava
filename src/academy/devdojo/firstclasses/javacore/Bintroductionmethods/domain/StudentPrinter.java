package academy.devdojo.firstclasses.javacore.Bintroductionmethods.domain;

public class StudentPrinter {
    public void printer(Student student){

        System.out.println("--------------------");

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);

        student.name = "Vtx";

    }

}
