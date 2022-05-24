package ForLoopsExercise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 10;

        for (int value = 1; value <=10; value++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            System.out.println(value);
        }
    }
}
