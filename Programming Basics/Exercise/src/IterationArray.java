import java.util.Arrays;

public class IterationArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * array[i];
        }
        System.out.println(Arrays.toString(array));
    }
}
