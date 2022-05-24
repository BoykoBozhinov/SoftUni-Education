import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bookPages = Integer.parseInt(scanner.nextLine());
        int pages = Integer.parseInt(scanner.nextLine());
        int daysCount = Integer.parseInt(scanner.nextLine());
        int allDays = bookPages / pages;
        int hoursCount = allDays / daysCount;
        System.out.println(hoursCount);
    }
}
