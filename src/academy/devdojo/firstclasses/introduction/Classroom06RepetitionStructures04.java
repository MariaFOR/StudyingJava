package academy.devdojo.firstclasses.introduction;

public class Classroom06RepetitionStructures04 {
    public static void main(String[] args) {
        double amount = 30000;

        for (int parcel = 1; parcel <= amount; parcel++) {
            double parcelValue = amount / parcel;

            if(parcelValue < 1000){
                break;
            }
            System.out.println("parcel " + parcel + " R$ " + parcelValue);
        }

    }
}
