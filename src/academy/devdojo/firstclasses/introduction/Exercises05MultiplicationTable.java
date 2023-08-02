package academy.devdojo.firstclasses.introduction;

import java.util.Scanner;

public class Exercises05MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("enter a number: ");
        number = scanner.nextInt();

        System.out.println("\nTABLE OF " + number + "\n");

        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }

    }
}
