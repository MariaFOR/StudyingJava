package academy.devdojo.firstclasses.javacore.introductionmethods.test;

import academy.devdojo.firstclasses.javacore.introductionmethods.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.sumTwoNumbers();

        System.out.println("Finishing CalculatorTest01");

        calculator.subtractTwoNumbers();

    }
}
