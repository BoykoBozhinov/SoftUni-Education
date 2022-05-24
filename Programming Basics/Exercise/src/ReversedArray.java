public class ReversedArray {
    public static void main(String[] args) {
        int[] myArray = new int[] {5,1,7,4,2,8};
        int length = myArray.length;
        int[] reversed = new int[length];

        for (int i = 0; i<length;i++){
            reversed[length-i-1]=myArray[i];
        }
    }
}
