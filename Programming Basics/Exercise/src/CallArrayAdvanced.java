import java.util.Arrays;
import java.util.Scanner;

public class CallArrayAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] myArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("numArr[%d] = %d%n", i, myArray[i]);
        }
        System.out.println(Arrays.toString(myArray));
    }
}
