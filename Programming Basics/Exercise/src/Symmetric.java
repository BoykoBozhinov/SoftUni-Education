import java.util.Scanner;

public class Symmetric {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] myArray = new int [n];
        for (int i = 0; i < n; i++){
            myArray[i] = scanner.nextInt();
        }
        boolean symmetric = true;
        for (int i = 0;i< (myArray.length+1)/2;i++){
            if (myArray[i] != myArray[n-i-1])
                symmetric = false;
        }
        System.out.printf("Symmetric? %b%n", symmetric);
    }
}
