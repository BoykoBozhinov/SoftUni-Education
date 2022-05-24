import java.util.Arrays;

public class JavaJava {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
             numbers[i] = i*5;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
