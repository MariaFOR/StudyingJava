package academy.devdojo.firstclasses.introduction;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercises01Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstValue;
        double secondValue;
        String operation;
        boolean keep;

        try {

            do {
                System.out.println("enter the first value: ");
                firstValue = scanner.nextDouble();

                System.out.println("enter the operation (+, -, /, *): ");
                operation = scanner.next();

                System.out.println("enter the second value: ");
                secondValue = scanner.nextDouble();

                System.out.println("Result: " + calculationResult(firstValue, secondValue, operation));

                keep = checkNewOperation();
            } while (keep);

        }catch (InputMismatchException ex){
            System.out.println("the values for calculation must be numeric =)");
        }

    }

    public static boolean checkNewOperation() {
        Scanner sc = new Scanner(System.in);

        System.out.println("want to perform a new operation? (YES or NO): ");
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("NO");
    }

    public static double calculationResult(double firstValue, double secondValue, String operation) {
        double calculationResult = 0.0;

        switch (operation) {
            case "+":
                calculationResult = firstValue + secondValue;
                break;
            case "-":
                calculationResult = firstValue - secondValue;
                break;
            case "/":
                calculationResult = firstValue / secondValue;
                break;
            case "*":
                calculationResult = firstValue * secondValue;
                break;
            default:
                System.out.println("operation is invalid =(");
        }

        return calculationResult;
    }
}
