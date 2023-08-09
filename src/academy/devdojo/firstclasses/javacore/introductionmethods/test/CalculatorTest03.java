package academy.devdojo.firstclasses.javacore.introductionmethods.test;

import academy.devdojo.firstclasses.javacore.introductionmethods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double result = calculator.dividesTwoNumbers(20,0);
        System.out.println(result);

        System.out.println("-----------------------");

        System.out.println("dividesTwoNumbers02 = " + calculator.dividesTwoNumbers02(20,0));

        System.out.println("-----------------------");

        calculator.printDivisionTwoNumbers(86,0);
    }

}
