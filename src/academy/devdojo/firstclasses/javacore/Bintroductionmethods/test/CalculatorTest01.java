package academy.devdojo.firstclasses.javacore.Bintroductionmethods.test;

import academy.devdojo.firstclasses.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.sumTwoNumbers();

        System.out.println("Finishing CalculatorTest01");

        calculator.subtractTwoNumbers();

    }
}
