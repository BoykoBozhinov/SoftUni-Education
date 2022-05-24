import java.util.Scanner;

public class P07Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 8; i >= k; i--) {
            for (int j = 9; j >= l; j--) {
                for (int c = 8; c <= m; c++) {
                    for (int b = 9; b >= n; b--) {
                        if (k % 2 == 0 && j % 2 == 0 && m % 2 == 0 && b % 2 == 0){
                                System.out.println(k+l);
                        }
                    }
                }
            }
        }
    }
}
