import java.util.Scanner;
public class P09FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tankLongCm = Integer.parseInt(scanner.nextLine());
        int tankWidthCm = Integer.parseInt(scanner.nextLine());
        int tankHeightCm = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        int tankVolume = tankLongCm * tankWidthCm * tankHeightCm;
        double waterVolume = tankVolume / 1000.0;
        double waterLiters = waterVolume - (waterVolume * (percentage / 100.0));
        System.out.println(waterLiters);



    }
}
