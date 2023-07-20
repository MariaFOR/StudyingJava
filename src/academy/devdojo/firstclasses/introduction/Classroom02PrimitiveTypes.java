package academy.devdojo.firstclasses.introduction;

public class Classroom02PrimitiveTypes {
    public static void main(String[] args){

    //int, double, float, char, byte, short, long, boolean

    int age = 10;
    int ageInt = (int) 1000000000L;
    long bigNumber = 100000;
    double salaryDouble = 2000.0;
    float salaryFloat = 2500.0F;
    byte ageByte = 127;
    short ageShort = 10;
    boolean falseBoolean = false;
    char characterAscii = 77;
    char characterUnicode = '\u0046';

    // reference variable
    String name = "Nana";

    System.out.println("Age is " + age + " years");
    System.out.println(falseBoolean);
    System.out.println(characterAscii);
    System.out.println(characterUnicode);
    System.out.println("Hi! My name is " + name);

    }
}
