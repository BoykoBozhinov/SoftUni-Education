package NestedLoopsExercise;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        boolean flag = false;
        int currentNum = 0;
        for (int rows = 1; rows <= n; rows++) {
            for (int colons = 1; colons <= rows; colons++) {
                currentNum++;
                if (currentNum > n) {
                    flag = true;
                    break;
                }
                System.out.print(currentNum + " ");
            }
            if (flag) {
                break;
            }
            System.out.println();
        }
    }
}
