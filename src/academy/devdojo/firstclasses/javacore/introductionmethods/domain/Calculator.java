package academy.devdojo.firstclasses.javacore.introductionmethods.domain;

public class Calculator {

    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(21 - 2);
    }

    public void multiplyTwoNumbers(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double dividesTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double dividesTwoNumbers02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return 0;
        }
    }

    public void printDivisionTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("there is no division by zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void changeTwoNumbers (int number1, int number2){
        number1 = 99;
        number2 = 33;
        System.out.println("inside of changeTwoNumbers");
        System.out.println("Num1 " + number1);
        System.out.println("Num2 " + number2);
    }

}


