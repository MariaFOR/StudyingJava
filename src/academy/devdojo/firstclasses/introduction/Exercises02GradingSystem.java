package academy.devdojo.firstclasses.introduction;

import java.util.Scanner;

public class Exercises02GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float firstNote;
        float secondNote;
        float thirdNote;
        float fourthNote;
        String name;

        System.out.println("enter the student's name: ");
        name = scanner.next();

        System.out.println("enter the first note [0.0 - 10.0]: ");
        firstNote = scanner.nextFloat();

        System.out.println("enter the second note [0.0 - 10.0]: ");
        secondNote = scanner.nextFloat();

        System.out.println("enter the third note [0.0 - 10.0]: ");
        thirdNote = scanner.nextFloat();

        System.out.println("enter the fourth note [0.0 - 10.0]: ");
        fourthNote = scanner.nextFloat();

        float fullGrade = (firstNote + secondNote + thirdNote + fourthNote) / 4;

        String result;

        if( (fullGrade <= 10.0) && (fullGrade >= 0.0) ) {

            if (fullGrade >= 6.0) {
                result = "APPROVED =)";

            } else {

                if (fullGrade <= 3.0) {
                    result = "FAILED =(";

                } else {
                    result = "RECOVERY =/(";
                }
            }

        }else {
            result = "entered invalid note";
        }

        System.out.println(name + " " + result);
    }
}
