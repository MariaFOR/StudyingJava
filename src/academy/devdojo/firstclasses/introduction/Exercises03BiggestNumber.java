package academy.devdojo.firstclasses.introduction;

import java.util.Scanner;

public class Exercises03BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num01;
        int num02;
        int num03;
        int biggestNum;
        int smallerNum;

        System.out.println("enter the first value: ");
        num01 = scanner.nextInt();

        System.out.println("enter the second value: ");
        num02 = scanner.nextInt();

        System.out.println("enter the third value: ");
        num03 = scanner.nextInt();

        if (num01 > num02 && num01 > num03) {
            biggestNum = num01;
            System.out.println("the biggest number is: " + biggestNum);

            if (num02 > num03) {
                smallerNum = num03;
                System.out.println("the smallest number is: " + smallerNum);

            } else {
                smallerNum = num02;
                System.out.println("the smallest number is: " + smallerNum);
            }
        }

        if (num02 > num01 && num02 > num03) {
            biggestNum = num02;
            System.out.println("the biggest number is: " + biggestNum);

            if (num01 > num03) {
                smallerNum = num03;
                System.out.println("the smallest number is: " + smallerNum);

            } else {
                smallerNum = num01;
                System.out.println("the smallest number is: " + smallerNum);
            }
        }

        if (num03 > num01 && num03 > num02) {
            biggestNum = num03;
            System.out.println("the biggest number is: " + biggestNum);

            if (num01 > num02) {
                smallerNum = num02;
                System.out.println("the smallest number is: " + smallerNum);
            }else {
                smallerNum = num01;
                System.out.println("the smallest number is: " + smallerNum);
            }
        }

    }
}

