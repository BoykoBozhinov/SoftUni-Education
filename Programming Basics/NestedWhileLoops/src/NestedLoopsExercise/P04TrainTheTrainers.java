package NestedLoopsExercise;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int judges = Integer.parseInt(scanner.nextLine());

        int gradesCount = 0;
        double allGradesSum = 0;
        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            String presentationName = command;

            double sumGrades = 0;
            for (int i = 1; i <= judges; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                gradesCount++;
                sumGrades = sumGrades + currentGrade;
            }
            allGradesSum = allGradesSum + sumGrades;
            double averageGrade = sumGrades / judges;
            System.out.printf("%s - %.2f.%n", presentationName, averageGrade);

            command = scanner.nextLine();
        }
        double finalGrade = allGradesSum / gradesCount;
        System.out.printf("Student's final assessment is %.2f.", finalGrade);
    }
}
