import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int maxNum = Integer.MIN_VALUE;

        while (!command.equals("End")){
            int numbers = Integer.parseInt(command);

            if (maxNum<numbers){
                maxNum=numbers;
            }
            command = scanner.nextLine();
        }
        System.out.println(maxNum);
    }
}
