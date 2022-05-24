import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

       /* int[] number = new int[6];
        number[0] = 5;
        number[1] = 7;
        number[2] = 6;
        number[3] = 4;
        number[4] = 1;
        number[5] = 2;
        System.out.println(number[2]);
        */
        int[] num = {1, 2, 3, 4, 7, 6};
        int length = num.length;
        int[] reversed = new int[length];
        for (int i = 0; i < length; i++) {
            reversed[length - i - 1] = num[i];
        }
        System.out.println(Arrays.toString(reversed));
    }
}
