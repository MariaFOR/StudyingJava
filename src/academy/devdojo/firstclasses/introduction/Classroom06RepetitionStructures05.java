package academy.devdojo.firstclasses.introduction;

public class Classroom06RepetitionStructures05 {
    public static void main(String[] args) {
        double amount = 30000;

        for (int parcel = (int) amount; parcel >= 1; parcel--) {

            double parcelValue = amount / parcel;

            if (parcelValue < 1000){
                continue;
            }

            System.out.println("parcel " + parcel + " R$ " + parcelValue);
        }

    }
}
