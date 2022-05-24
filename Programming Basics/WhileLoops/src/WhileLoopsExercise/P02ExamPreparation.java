package WhileLoopsExercise;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowGradesCount = Integer.parseInt(scanner.nextLine());

        int lowGrades = 0;
        double allGradesSum = 0;
        int numberOfProblems = 0;
        String lastProblemName = "";
        String command = scanner.nextLine();
        while (!command.equals("Enough")) {
            lastProblemName = command;
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                lowGrades++;
            }
            if (lowGrades >= lowGradesCount) {
                break;
            }
            allGradesSum += grade;
            numberOfProblems++;
            command = scanner.nextLine();
        }
        if (command.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", allGradesSum / numberOfProblems);
            System.out.printf("Number of problems: %d%n", numberOfProblems);
            System.out.printf("Last problem: %s", lastProblemName);
        } else if (lowGrades == lowGradesCount) {
            System.out.printf("You need a break, %d poor grades.", lowGrades);
        }
    }
}
