import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rectangleWidth = Integer.parseInt(scanner.nextLine());
        int getRectangleLength = Integer.parseInt(scanner.nextLine());
        int area = calculateRectangleArea(rectangleWidth,getRectangleLength);

        System.out.println(area);
    }

    public static int calculateRectangleArea(int width,int length) {
        return width * length;
    }
}
