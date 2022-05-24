import java.util.Scanner;

public class P07MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        String value = scanner.nextLine();

        while (!value.equals("Stop")) {
            int currentNum = Integer.parseInt(value);
            if (currentNum < min) {
                min = currentNum;
            }
            value = scanner.nextLine();
        }
        System.out.println(min);
    }
}
