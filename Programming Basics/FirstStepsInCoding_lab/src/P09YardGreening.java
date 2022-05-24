import java.util.Scanner;
public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m2Grassing = Double.parseDouble(scanner.nextLine());
        double allPrice = m2Grassing * 7.61;
        double discount = allPrice * 0.18;
        double finalPrice = allPrice - discount;
        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: "+ discount + " lv.");



    }
}
