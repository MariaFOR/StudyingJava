package academy.devdojo.firstclasses.introduction;

public class Classroom08MultidimensionalArrays01 {
    public static void main(String[] args) {

        int[][] days = new int[3][3];
        days[0][0] = 31;
        days[0][1] = 28;
        days[0][2] = 31;

        days[1][0] = 31;
        days[1][1] = 28;
        days[1][2] = 31;

        days[2][0] = 31;
        days[2][1] = 28;
        days[2][2] = 31;

        for (int i = 0; i < days.length; i++) {

            for (int j = 0; j < days[0].length; j++) {

                System.out.println(days[i][j]);
            }
        }

    }
}
