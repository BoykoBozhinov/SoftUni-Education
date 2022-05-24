import java.util.Arrays;

public class ArrayOnTheConsole {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four"};
        for (int i = 0; i < array.length;i++){
            System.out.printf("element [%d] = %s%n", i, array[i]);
        }
        System.out.println(Arrays.toString(array));
    }
}
