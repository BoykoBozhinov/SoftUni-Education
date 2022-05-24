import java.util.Scanner;

public class P04InchesToCm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());
        double cm = inches * 2.54;
        System.out.println(cm);

    }
}
