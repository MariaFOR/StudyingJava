package academy.devdojo.firstclasses.introduction;

import java.util.Scanner;

public class Exercises09CountEvenAndOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;

        System.out.println("Enter the number of elements in the list: ");
        size = scanner.nextInt();

        int[] list = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element "+ (i + 1) +": ");
            list[i] = scanner.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int number : list){
            if (number % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        System.out.println("Number of even numbers in the list: " + evenCount);
        System.out.println("Number of odd numbers in the list: " + oddCount);

    }
}
