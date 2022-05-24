import java.util.Scanner;

public class P05SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int boardCleaner = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double packetPens = pens * 5.80;
        double packetMarkers = markers * 7.20;
        double cleaner = boardCleaner * 1.20;
        double allMaterials = packetPens + packetMarkers + cleaner;
        double allMoney = allMaterials - (allMaterials* (discount / 100.0));
        System.out.println(allMoney);

    }
}
