import java.util.Scanner;

public class P06MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        String value = scanner.nextLine();
        while (!value.equals("Stop")) {
            int numbers = Integer.parseInt(value);
            if (max < numbers){
                max = numbers;
            }
            value = scanner.nextLine();
        }
        System.out.println(max);
    }
}
