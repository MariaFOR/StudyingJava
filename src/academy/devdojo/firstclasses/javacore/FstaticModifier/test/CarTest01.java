package academy.devdojo.firstclasses.javacore.FstaticModifier.test;

import academy.devdojo.firstclasses.javacore.FstaticModifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car.setLimitSpeed(180);

        Car c1 = new Car("BMW", 280);
        Car c2 = new Car("Mercedes", 275);
        Car c3 = new Car("Audi", 290);

        c1.printer();
        c2.printer();
        c3.printer();
    }
}
