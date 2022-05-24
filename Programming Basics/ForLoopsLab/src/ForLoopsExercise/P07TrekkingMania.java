package ForLoopsExercise;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupsCount = Integer.parseInt(scanner.nextLine());

        int allPeople = 0;
        int musalaPeople = 0;
        int montBlancPeople = 0;
        int kilimanjaroPeople = 0;
        int k2People = 0;
        int everestPeople = 0;
        for (int i = 1; i <= groupsCount; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());

            allPeople = allPeople + peopleInGroup;
            if (peopleInGroup <= 5) {
                musalaPeople = musalaPeople + peopleInGroup;
            } else if (peopleInGroup <= 12) {
                montBlancPeople = montBlancPeople + peopleInGroup;
            } else if (peopleInGroup <= 25) {
                kilimanjaroPeople = kilimanjaroPeople + peopleInGroup;
            } else if (peopleInGroup <= 40) {
                k2People = k2People + peopleInGroup;
            } else {
                everestPeople = everestPeople + peopleInGroup;
            }
        }
        System.out.printf("%.2f%%", musalaPeople * 1.0 / allPeople * 100);
        System.out.println();
        System.out.printf("%.2f%%", montBlancPeople * 1.0 / allPeople * 100);
        System.out.println();
        System.out.printf("%.2f%%", kilimanjaroPeople * 1.0 / allPeople * 100);
        System.out.println();
        System.out.printf("%.2f%%", k2People * 1.0 / allPeople * 100);
        System.out.println();
        System.out.printf("%.2f%%", everestPeople * 1.0 / allPeople * 100);

    }
}
