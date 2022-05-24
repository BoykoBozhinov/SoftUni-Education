import java.util.Scanner;
public class PrimitiveType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int start = input.nextInt();
       int end = input.nextInt();
       printNumber(start,end);
    }

    static void printNumber(int start, int end) {
        for (int i = start; i < end;i++){
            System.out.println(i);
        }
    }
}
