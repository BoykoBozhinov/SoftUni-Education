public class MethodsPart2 {
    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 75;
        printMax(num1,num2);
    }
    public static void printMax(double number1,double number2){
        double maxNum = number1;
        if (number2>number1){
            maxNum = number2;
        }
        System.out.println("Maximal number is:" + maxNum);
    }
}
