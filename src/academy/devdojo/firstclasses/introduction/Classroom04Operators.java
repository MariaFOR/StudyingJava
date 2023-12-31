package academy.devdojo.firstclasses.introduction;

import java.sql.SQLOutput;

public class Classroom04Operators {
    public static void main(String[] args){
        // + - / *
        int number01 = 10;
        int number02 = 20;

        System.out.println(number01 + number02);
        System.out.println("Value "+ number01 + number02);

        int number03 = 30;
        double number04 = 50;
        double result = number03 / number04;

        System.out.println(result);

        // %
        int rest = 20 % 2;

        System.out.println(rest);

        // < > <= >= == != (boolean value)
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualsTwenty = 10 == 10.0;
        boolean isTenDifferentFromTwenty = 10 != 20;

        System.out.println("isTenGreaterThanTwenty " + isTenGreaterThanTwenty);
        System.out.println("isTenLessThanTwenty " + isTenLessThanTwenty);
        System.out.println("isTenEqualsTwenty " + isTenEqualsTwenty);
        System.out.println("isTenDifferentFromTwenty " + isTenDifferentFromTwenty);

        // && (AND) || (or) !
        int age = 35;
        float salary = 35000F;
        boolean isInTheLawGreaterThanThirty = age >= 30 && salary >= 4612;
        boolean isInTheLawLessThanThirty = age < 30 && salary >= 3381;

        System.out.println("isInTheLawGreaterThanThirty " + isInTheLawGreaterThanThirty);
        System.out.println("isInTheLawLessThanThirty " + isInTheLawLessThanThirty);

        double totalCurrentAccountAmount = 200;
        double totalAmountOfSavingsAccount = 30000;
        float valuePlaystation = 5000;
        boolean isPlaystationBuyable = totalCurrentAccountAmount > valuePlaystation || totalAmountOfSavingsAccount > valuePlaystation;

        System.out.println("isPlaystationBuyable " + isPlaystationBuyable);

        // = += -+ *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        // ++ --
        int counter = 0;
        counter += 1; // counter = counter + 1;
        counter++;
        counter--;
        ++counter;
        --counter;

        System.out.println(counter);

        int counter2 = 0;

        System.out.println(counter2++);
        System.out.println(++counter2);

    }
}
