package ConditionalStatementsMore;

import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poolVolumeL = Integer.parseInt(scanner.nextLine());
        int pipe1DebitHour = Integer.parseInt(scanner.nextLine());
        int pipe2DebitHour = Integer.parseInt(scanner.nextLine());
        double workerHoursAbsent = Double.parseDouble(scanner.nextLine());

        double pipe1FullDebit =  workerHoursAbsent * pipe1DebitHour;
        double pipe2FullDebit = workerHoursAbsent * pipe2DebitHour;
        double pipesFullDebit = pipe1FullDebit + pipe2FullDebit;

        if (poolVolumeL >= pipesFullDebit) {
            double pipeOnePercent = (pipe1FullDebit*100)/pipesFullDebit;
            double pipeTwoPercent = (pipe2FullDebit*100)/pipesFullDebit;
            double percentPoolVolume = (pipesFullDebit*100)/poolVolumeL;
            System.out.printf("The pool is %.2f %% full. Pipe 1: %.2f %% Pipe 2: %.2f %%.", percentPoolVolume,pipeOnePercent,pipeTwoPercent);
        }else {
            double litersOverflow = pipesFullDebit - poolVolumeL;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", workerHoursAbsent,litersOverflow);
        }
    }
}
