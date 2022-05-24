package WhileLoopsExercise;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int freeSpaceWidth = Integer.parseInt(scanner.nextLine());
        int freeSpaceLength = Integer.parseInt(scanner.nextLine());
        int freeSpaceHeight = Integer.parseInt(scanner.nextLine());

        int freeSpaceSum = freeSpaceWidth * freeSpaceLength * freeSpaceHeight;
        int boxesSum = 0;
        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            int boxesCount = Integer.parseInt(command);
            boxesSum = boxesSum + boxesCount;
            if (freeSpaceSum < boxesSum) {
                break;
            }
            command = scanner.nextLine();
        }
        int diff = Math.abs(boxesSum - freeSpaceSum);
        if (freeSpaceSum < boxesSum) {
            System.out.printf("No more free space! You need %d Cubic meters more.", diff);
        } else {
            System.out.printf("%d Cubic meters left.", diff);
        }
    }
}
