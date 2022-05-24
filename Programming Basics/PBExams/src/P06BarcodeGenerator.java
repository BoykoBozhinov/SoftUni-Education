import java.util.Scanner;

public class P06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int n = 2; n <= 6; n++) {
            for (int j = 3; j <= 7; j++) {
                for (int k = 4; k <= 8; k++) {
                    for (int i = 5; i <= 9; i++) {
                        if (firstNumber % n != 0 && firstNumber % j != 0 && firstNumber % k !=0 && firstNumber % i !=0){
                            if (secondNumber % n != 0 && firstNumber % j != 0 && firstNumber % k !=0 && firstNumber % i !=0){
                                System.out.print(n+j+k+i);
                            }
                        }
                    }
                }
            }
        }
    }
}
