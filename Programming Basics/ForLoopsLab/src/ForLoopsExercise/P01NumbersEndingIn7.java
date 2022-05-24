package ForLoopsExercise;

public class P01NumbersEndingIn7 {
    public static void main(String[] args) {

        for (int num = 1; num <=1000; num++) {
            if (num % 10 == 7) {
                System.out.println(num);
            }
        }
    }
}
