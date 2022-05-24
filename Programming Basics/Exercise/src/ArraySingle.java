import java.util.Arrays;
import java.util.Scanner;

public class ArraySingle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        String[] valuesArr = inputLine.split(" ");
        int[] numArr = new int[valuesArr.length];
        for (int i = 0; i <numArr.length; i++) {
            numArr[i] = Integer.parseInt(valuesArr[i]);
        }
        System.out.println(Arrays.toString(numArr));
    }
}
