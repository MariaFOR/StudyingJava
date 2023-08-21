package academy.devdojo.firstclasses.javacore.Gassociation.test;

import academy.devdojo.firstclasses.javacore.Gassociation.domain.Fish;
import academy.devdojo.firstclasses.javacore.Gassociation.domain.Shoal;

public class FishTest01 {
    public static void main(String[] args) {
        Fish fish1 = new Fish("Nemo");
        Fish fish2 = new Fish("Dory");
        Shoal shoal = new Shoal("Clownfish");
        Fish[] pisces = {fish1, fish2};

        fish1.setShoal(shoal);

        shoal.setPisces(pisces);

        System.out.println("----- pisces -----");

        fish1.printer();
        fish2.printer();

        System.out.println("----- shoal -----");

        shoal.printer();
    }
}
