import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        double sumAllGrades = 0.0;
        int countClasses = 0;
        int lowerGrades = 0;

        while (countClasses != 12) {
            double currentGrade = Double.parseDouble(scanner.nextLine());

            if (currentGrade<4) {
                lowerGrades++;
                if (lowerGrades>1) {
                    break;
                }
            }
            sumAllGrades +=currentGrade;
            countClasses++;
        }
        if (countClasses==12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, sumAllGrades / 12);
        }else {
            System.out.printf("%s has been excluded at %d grade", name, countClasses);
        }
    }
}