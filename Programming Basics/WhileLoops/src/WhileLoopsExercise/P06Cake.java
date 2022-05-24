package WhileLoopsExercise;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cakeWide = Integer.parseInt(scanner.nextLine());
        int cakeHeight = Integer.parseInt(scanner.nextLine());

        int wholeCakePieces = cakeWide * cakeHeight;
        String command = scanner.nextLine();
        while (!command.equals("STOP")) {
            int cakePiecesCount = Integer.parseInt(command);
            wholeCakePieces = wholeCakePieces - cakePiecesCount;
            if (wholeCakePieces < 0) {
                break;
            }
            command = scanner.nextLine();
        }
        if (wholeCakePieces < 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(wholeCakePieces));
        } else {
            System.out.printf("%d pieces are left.", wholeCakePieces);
        }
    }
}
