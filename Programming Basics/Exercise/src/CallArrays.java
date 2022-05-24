import java.util.Arrays;
import java.util.Scanner;

public class CallArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }
        for (int thisArray : array){
            System.out.print(thisArray + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.stream(array).sum());
        /*int[] num = {1,2,3,4,5,6};
        num[1] = 7;
        System.out.println(num[1]);
        */
    }
}
