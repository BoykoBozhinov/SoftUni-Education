import java.util.Scanner;
public class P05TrainingLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = Double.parseDouble(sc.nextLine());
        double h = Double.parseDouble(sc.nextLine());
        double hWoCorridor = (h * 100) - 100;
        double hDesksPerLine = Math.floor(hWoCorridor / 70);
        double wDesksPerLine = Math.floor((w * 100) / 120);
        double realDesks = hDesksPerLine * wDesksPerLine - 3;
        System.out.printf("%.0f", realDesks);
    }
}