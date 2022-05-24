import java.util.Scanner;

public class P14EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eggsCountP1 = Integer.parseInt(scanner.nextLine());
        int eggsCountP2 = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("End of battle")) {
            String winner = command;
            switch (winner) {
                case "one":
                    eggsCountP2--;
                    break;
                case "two":
                    eggsCountP1--;
                    break;
            }
            if (eggsCountP1 == 0) {
                break;
            } else if (eggsCountP2 == 0) {
                break;
            }
            command = scanner.nextLine();
        }
        if (eggsCountP1 <= 0) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsCountP2);
        } else if (eggsCountP2 <= 0) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsCountP1);
        } else {
            System.out.printf("Player one has %d eggs left.%n", eggsCountP1);
            System.out.printf("Player two has %d eggs left.", eggsCountP2);
        }
    }
}
