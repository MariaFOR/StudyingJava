package academy.devdojo.firstclasses.javacore.Bintroductionmethods.test;

import academy.devdojo.firstclasses.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 1;
        int b = 2;

        calculator.changeTwoNumbers(a, b);

        System.out.println("inside of CalculatorTest04");
        System.out.println("Num1 " + a);
        System.out.println("Num2 " + b);

    }
}
