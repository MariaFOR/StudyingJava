package academy.devdojo.firstclasses.introduction;

public class Classroom07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float and double 0
        // char '\u0000' ' '
        // boolean false
        // String null

        String [] names = new String[3];
        names[0] = "Vito";
        names[1] = "Nana";
        names[2] = "Lia";

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

    }
}
