package academy.devdojo.firstclasses.introduction;

public class Classroom05ConditionalStructures05 {
    public static void main(String[] args) {
        byte day = 2;

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid option");
                break;
        }

        char gender = 'M';
        switch (gender) {
            case 'M':
                System.out.println("masculine");
                break;
            case 'F':
                System.out.println("feminine");
                break;
            default:
                System.out.println("invalid option");
                break;
        }

    }
}
