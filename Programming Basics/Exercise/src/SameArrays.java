import java.util.Arrays;
import java.util.Scanner;

public class SameArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();

        boolean isEqual = true;
        int[] firstArray = new int[numOne];
        int[] secondArray = new int[numTwo];

        if (firstArray.length == secondArray.length){
            for (int i = 0; i < firstArray.length;i++){
                if (firstArray[i] != secondArray[i])
                    isEqual = false;
            }
        }else {
            isEqual = false;
        }
        if (isEqual){
            System.out.println("Arrays are euqal");
        }else {
            System.out.println("Arrays are not equal");
        }
    }
}
