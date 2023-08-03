package academy.devdojo.firstclasses.introduction;

import java.util.Scanner;

public class Exercises07CheckNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number;

        System.out.println("enter a number for verification: ");
        number = scanner.nextInt();

        if (number > 0){
            System.out.println("the number is positive");
        } else if (number < 0) {
            System.out.println("the number is negative");
        } else {
            System.out.println("the number is zero");
        }

    }
}
