import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floorsCount = Integer.parseInt(scanner.nextLine());
        int roomsCount = Integer.parseInt(scanner.nextLine());

        int apartmentCount = 0;
        int officeCount = 0;
        for (int floor = floorsCount; floor > 0; floor--) {
            for (int room = 0; room < roomsCount; room++) {

                if (floor == floorsCount) {
                    System.out.print("L" + floor + room + " ");
                } else if (floor % 2 == 0) {
                    System.out.print("O" + floor + room + " ");
                } else {
                    System.out.print("A" + floor + room + " ");
                }
            }
            System.out.println();
        }
    }
}
