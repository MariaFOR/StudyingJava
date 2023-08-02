package academy.devdojo.firstclasses.introduction;

public class Exercises06PopulationOfCountries {
    public static void main(String[] args) {
        /*
        Assume that the population of a country A is of the order of 80000 inhabitants with
        an annual growth rate of 3% and that the population of B is 200000 inhabitants with a growth
        rate of 1.5%. Write a program that calculates and writes the number of years required for
        the population of country A to exceed or equal the population of country B, maintaining growth rates.
         */

        double popA = 80000;
        double popB = 200000;
        double rateA = 0.03;
        double rateB = 0.015;

        double year = 0;

        do {
            popA = popA + (popA * rateA);
            popB = popB + (popB * rateB);
            year++;

        } while (popA < popB);

        System.out.println("A exceeds or equals B in how many years:\n" + year + " years");
        System.out.println("Country A: " + popA);
        System.out.println("Country B: " + popB);
    }
}

