package academy.devdojo.firstclasses.javacore.introductionclasses.test;

import academy.devdojo.firstclasses.javacore.introductionclasses.domain.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        teacher.name = "Jiraiya";
        teacher.age = 54;
        teacher.gender = 'M';

        System.out.println("Name: " + teacher.name + "\nage: " + teacher.age + "\ngender: " + teacher.gender);
    }
}
