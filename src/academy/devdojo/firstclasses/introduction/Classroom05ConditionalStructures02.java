package academy.devdojo.firstclasses.introduction;

public class Classroom05ConditionalStructures02 {
    public static void main(String[] args) {
        int age = 45;
        String category;

        if (age < 15) {
            category = "children's category";

        } else if (age >= 15 && age < 18) {
            category = "youth category";

        } else {
            category = "adult category";
        }

        System.out.println(category);

    }
}
