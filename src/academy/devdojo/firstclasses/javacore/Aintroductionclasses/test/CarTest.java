package academy.devdojo.firstclasses.javacore.Aintroductionclasses.test;

import academy.devdojo.firstclasses.javacore.Aintroductionclasses.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Fusca Bala";
        car1.model = "Sport";
        car1.year = 1969;

        car2.name = "Mustang";
        car2.model = "GT 500";
        car2.year = 1968;

        car1 = car2;

        System.out.println("Car 1");
        System.out.println(car1.name);
        System.out.println(car1.model);
        System.out.println(car1.year);

        System.out.println("\nCar 2");
        System.out.println(car2.name);
        System.out.println(car2.model);
        System.out.println(car2.year);

    }
}
