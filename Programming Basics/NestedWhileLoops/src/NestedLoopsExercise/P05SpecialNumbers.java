package NestedLoopsExercise;

import java.util.Scanner;

public class P05SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int x1 = 1; x1 <= 9; x1++) {
            for (int x2 = 1; x2 <= 9; x2++) {
                for (int x3 = 1; x3 <= 9; x3++) {
                    for (int x4 = 1; x4 <= 9; x4++) {
                        boolean isSpecial = (n % x1 == 0)
                                && (n % x2 == 0)
                                && (n % x3 == 0)
                                && (n % x4 == 0);

                        if (isSpecial) {
                            System.out.printf("%d%d%d%d ", x1, x2, x3, x4);
                        }
                    }
                }
            }
        }
    }
}
