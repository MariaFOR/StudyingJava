package academy.devdojo.firstclasses.javacore.Bintroductionmethods.test;

import academy.devdojo.firstclasses.javacore.Bintroductionmethods.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();

        //person.name = "Naruto";
        person.setName("Naruto");

        //person.age = 20;
        person.setAge(20);

        //person.printer();
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
