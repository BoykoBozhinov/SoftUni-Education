import java.util.Scanner;

public class P05Number100_200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  myNumber = Integer.parseInt(scanner.nextLine());

        if (myNumber < 100) {
            System.out.println("Less than 100");
        }else if (myNumber <= 200) {
            System.out.println("Between 100 and 200");
        }else if (myNumber > 200) {
            System.out.println("Greater than 200");
        }
    }
}
