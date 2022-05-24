package WhileLoopsExercise;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();

        int booksCount = 0;
        String currentBook = scanner.nextLine();
        while (!currentBook.equals(book)) {
            currentBook = scanner.nextLine();
            booksCount++;
            if (currentBook.equals(book)) {
                break;
            }
            if (currentBook.equals("No More Books")) {
                break;
            }
        }
        if (currentBook.equals(book)) {
            System.out.printf("You checked %d books and found it.", booksCount);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", booksCount);
        }
    }
}
