import java.util.Scanner;

public class P16EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paintedEggsCount = Integer.parseInt(scanner.nextLine());

        int maxEggs = Integer.MIN_VALUE;
        String maxEggsColor = "";
        int redEggs = 0;
        int orangeEggs = 0;
        int blueEggs = 0;
        int greenEggs = 0;
        for (int i = 1; i <= paintedEggsCount; i++) {
            String eggColor = scanner.nextLine();

            switch (eggColor) {
                case "red":
                    redEggs++;
                    if (redEggs > maxEggs) {
                        maxEggs = redEggs;
                        maxEggsColor = eggColor;
                    }
                    break;
                case "orange":
                    orangeEggs++;
                    if (orangeEggs > maxEggs) {
                        maxEggs = orangeEggs;
                        maxEggsColor = eggColor;
                    }
                    break;
                case "blue":
                    blueEggs++;
                    if (blueEggs > maxEggs) {
                        maxEggs = blueEggs;
                        maxEggsColor = eggColor;
                    }
                    break;
                case "green":
                    greenEggs++;
                    if (greenEggs > maxEggs) {
                        maxEggs = greenEggs;
                        maxEggsColor = eggColor;
                    }
                    break;
            }
        }
        System.out.printf("Red eggs: %d%n", redEggs);
        System.out.printf("Orange eggs: %d%n", orangeEggs);
        System.out.printf("Blue eggs: %d%n", blueEggs);
        System.out.printf("Green eggs: %d%n", greenEggs);
        System.out.printf("Max eggs: %d -> %s%n", maxEggs, maxEggsColor);
    }
}
