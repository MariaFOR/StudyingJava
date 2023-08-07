package academy.devdojo.firstclasses.introduction;

import java.util.Scanner;

public class Exercises10FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;

        System.out.println("Enter the value of N: ");
        N = scanner.nextInt();

        int firstNumber = 0;
        int secondNumber = 1;

        System.out.println("Fibonacci Sequence (" + N + " numbers): ");

        for (int i = 1; i <= N; i++){
            System.out.println(firstNumber);

            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

    }
}
