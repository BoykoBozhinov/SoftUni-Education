import java.util.Scanner;

public class P07WorkingHoursOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();
        if (hour >=10 && hour <=18 && !dayOfWeek.equals("Sunday")){
            System.out.println("open");
        }
        else {
            System.out.println("closed");
        }
    }
}
