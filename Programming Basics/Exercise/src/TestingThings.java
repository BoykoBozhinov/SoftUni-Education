import java.util.ArrayList;

public class TestingThings {
    public static void main(String[] args) {
        int[][] array = new int[3][3];

        array[0][0] = 1;
        array[0][1] = 5;
        array[0][2] = 7;
        array[1][0] = 9;
        array[1][1] = 3;
        array[1][2] = 11;
        array[2][0] = 15;
        array[2][1] = 17;
        array[2][2] = 20;

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
