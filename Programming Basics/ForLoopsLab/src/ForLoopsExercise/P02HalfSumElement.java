package ForLoopsExercise;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int num = 1; num <= numbersCount; num++) {
            int value = Integer.parseInt(scanner.nextLine());
            sum = sum+value;
            if (value > max){
                max = value;
            }
        }
        int sumWithoutMaxNumber = sum - max;
        if (max == sumWithoutMaxNumber) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumWithoutMaxNumber);
        }else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(max - sumWithoutMaxNumber));
        }
    }
}
