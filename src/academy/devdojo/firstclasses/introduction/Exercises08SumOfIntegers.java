package academy.devdojo.firstclasses.introduction;

import java.util.Scanner;

public class Exercises08SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.println("enter a number for the sum of integers: ");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("the sum of integers from 1 to " + number + " is " + sum);

    }
}
