import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String calculation = scanner.nextLine();
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());

        switch (calculation) {
            case "add":
                add(numOne,numTwo);
                break;
            case "multiply":
                multiply(numOne,numTwo);
                break;
            case "subtract":
                subtract(numOne,numTwo);
                break;
            case "divide":
                divide(numOne,numTwo);
                break;
        }
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }
    public static void subtract (int a, int b) {
        System.out.println(a - b);
    }
    public static void divide (int a, int b) {
        System.out.println(a / b);
    }
}
