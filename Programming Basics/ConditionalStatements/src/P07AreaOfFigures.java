import java.util.Scanner;

public class P07AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        if (figure.equals("square")){
            double sideSquare = Double.parseDouble(scanner.nextLine());
            double squareArea = sideSquare * sideSquare;
            System.out.printf("%.3f", squareArea);
        }else if (figure.equals("rectangle")) {
            double lengthRectangle = Double.parseDouble(scanner.nextLine());
           double sideRectangle = Double.parseDouble(scanner.nextLine());
           double rectangleArea = lengthRectangle * sideRectangle;
            System.out.printf("%.3f", rectangleArea);
        }else if (figure.equals("circle")){
            double radiusCircle = Double.parseDouble(scanner.nextLine());
            double circleArea = Math.PI * radiusCircle * radiusCircle;
            System.out.printf("%.3f", circleArea);
        }else if (figure.equals("triangle")){
            double lengthSide = Double.parseDouble(scanner.nextLine());
            double lengthHeight = Double.parseDouble(scanner.nextLine());
            double triangleArea = (lengthSide * lengthHeight)/2;
            System.out.printf("%.3f", triangleArea);
        }
    }
}
