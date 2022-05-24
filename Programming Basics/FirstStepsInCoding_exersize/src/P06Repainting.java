import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylonCount = Integer.parseInt(scanner.nextLine());
        int paintCount = Integer.parseInt(scanner.nextLine());
        int thinnerCount = Integer.parseInt(scanner.nextLine());
        int hoursCount = Integer.parseInt(scanner.nextLine());

        double nylonMoney = (nylonCount + 2 ) * 1.50;
        double paintMoney = (paintCount * 1.10) * 14.50;
        double thinnerMoney = thinnerCount * 5.00;
        double allMaterials = nylonMoney + paintMoney + thinnerMoney + 0.40;
        double workers = (allMaterials * 0.30) * hoursCount;
        double allSum = allMaterials + workers;
        System.out.println(allSum);




    }
}
