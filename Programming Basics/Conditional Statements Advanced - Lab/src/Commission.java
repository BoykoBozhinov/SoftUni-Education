import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double saleVolume = Double.parseDouble(scanner.nextLine());

        double commission = 0.0;

        if (town.equals("Sofia")) {
            if (saleVolume >= 0 && saleVolume <= 500) {
                commission = saleVolume * 0.05;
                System.out.printf("%.2f", commission);
            } else if (saleVolume > 500 && saleVolume <= 1000) {
                commission = saleVolume * 0.7;
                System.out.printf("%.2f", commission);
            } else if (saleVolume > 1000 && saleVolume <= 10000) {
                commission = saleVolume * 0.08;
                System.out.printf("%.2f", commission);
            } else if (saleVolume > 10000) {
                commission = saleVolume * 0.12;
                System.out.printf("%.2f", commission);
            } else {
                System.out.println("error");
            }
        }

        else if (town.equals("Varna")) {
            if (saleVolume >= 0 && saleVolume <= 500) {
                commission = saleVolume * 0.045;
                System.out.printf("%.2f", commission);
            } else if (saleVolume > 500 && saleVolume <= 1000) {
                commission = saleVolume * 0.075;
                System.out.printf("%.2f", commission);
            } else if (saleVolume > 1000 && saleVolume <= 10000) {
                commission = saleVolume * 0.10;
                System.out.printf("%.2f", commission);
            } else if (saleVolume > 10000) {
                commission = saleVolume * 0.13;
                System.out.printf("%.2f", commission);
            } else {
                System.out.println("error");
            }
        }


        else if (town.equals("Plovdiv")) {
            if (saleVolume >= 0 && saleVolume <= 500) {
                commission = saleVolume * 0.055;
                System.out.printf("%.2f", commission);
            } else if (saleVolume > 500 && saleVolume <= 1000) {
                commission = saleVolume * 0.8;
                System.out.printf("%.2f", commission);
            } else if (saleVolume > 1000 && saleVolume <= 10000) {
                commission = saleVolume * 0.12;
                System.out.printf("%.2f", commission);
            } else if (saleVolume > 10000) {
                commission = saleVolume * 0.145;
                System.out.printf("%.2f", commission);
            } else {
                System.out.println("error");
            }
        }
        else {
            System.out.println("error");
        }
    }
}