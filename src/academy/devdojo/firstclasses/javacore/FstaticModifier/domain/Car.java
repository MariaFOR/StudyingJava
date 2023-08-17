package academy.devdojo.firstclasses.javacore.FstaticModifier.domain;

public class Car {
    private String name;
    private double maximumSpeed;
    private static double limitSpeed = 250;

    public Car(String name, double maximumSpeed) {
        this.name = name;
        this.maximumSpeed = maximumSpeed;
    }

    public void printer(){
        System.out.println("-----------------");
        System.out.println("Name " + this.name);
        System.out.println("Maximum Speed " + this.maximumSpeed);
        System.out.println("Limit Speed " + Car.limitSpeed);
    }

    public static void setLimitSpeed(double limitSpeed){
        Car.limitSpeed = limitSpeed;
    }

    public static double getLimitSpeed(){
        return limitSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

}
