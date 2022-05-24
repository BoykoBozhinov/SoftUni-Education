import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        //    Walls
        double sideWall = x * y;
        double windows = 1.5 * 1.5;
        double allSideWalls = (2 * sideWall) - (2 * windows);
        double backWall = x * x;
        double entryDoor = 1.2 * 2;
        double allWalls = (2 * backWall) - entryDoor;
        double allSquareFeet = allSideWalls + allWalls;
        double greenPaint = allSquareFeet / 3.4;
        System.out.printf("%.2f%n", greenPaint);
         //   Rooftop
        double roofRectangle = 2 * (x * y);
        double roofTriangle = 2 * (x * h )/2;
        double allRoof = roofRectangle + roofTriangle;
        double redPaint = allRoof / 4.3;
        System.out.printf("%.2f%n", redPaint);




    }
}
