package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeFlower = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budged = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.0;

        switch (typeFlower){
            case "Roses":
                totalPrice = flowersCount * 5.0;
                if (flowersCount >80){
                    totalPrice = totalPrice *0.90;
                }
                break;
            case "Dahlias":
                totalPrice = flowersCount * 3.80;
                if (flowersCount>90){
                    totalPrice = totalPrice *0.85;
                }
                break;
            case "Tulips":
                totalPrice = flowersCount * 2.80;
                if (flowersCount>80){
                    totalPrice = totalPrice*0.85;
                }
                break;
            case "Narcissus":
                totalPrice = flowersCount * 3.0;
                if (flowersCount<120){
                    totalPrice = totalPrice *1.15;
                }
                break;
            case "Gladiolus":
                totalPrice = flowersCount *2.50;
                if (flowersCount<80){
                    totalPrice = totalPrice + (totalPrice*0.20);
                }
                break;
        } double diff = Math.abs(budged - totalPrice);
        if (budged >=totalPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount,typeFlower,diff);
        }else{
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }


    }
}
