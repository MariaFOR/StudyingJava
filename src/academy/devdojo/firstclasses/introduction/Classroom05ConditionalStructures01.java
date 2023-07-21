package academy.devdojo.firstclasses.introduction;

public class Classroom05ConditionalStructures01 {
    public static void main(String[] args) {
        int age = 15;
        boolean isAuthorizedToBuy = age >= 18;

        if (isAuthorizedToBuy) {
            System.out.println("authorized to buy alcoholic beverages");

        } else {
            System.out.println("Not authorized to buy alcoholic beverages");
        }

        if (!isAuthorizedToBuy) {
            System.out.println("Not authorized to buy alcoholic beverages");
        }

        System.out.println("out of if");
    }
}
