package academy.devdojo.firstclasses.javacore.Gassociation.test;

import academy.devdojo.firstclasses.javacore.Gassociation.domain.School;
import academy.devdojo.firstclasses.javacore.Gassociation.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Jiraya Sensei");
        Teacher teacher2 = new Teacher("Kakashi Sensei");
        Teacher[] teachers = {teacher1, teacher2};

        School school = new School("Konoha", teachers);

        school.printer();
    }
}
