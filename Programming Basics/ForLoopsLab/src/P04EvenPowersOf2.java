import java.util.Scanner;

public class P04EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 0; number <= n; number++) {
            if (number % 2 == 0){
                System.out.printf("%.0f%n", Math.pow(2, number));
            }
        }
    }
}
