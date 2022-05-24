public class P04NumbersDividedBy3WithoutReminder {
    public static void main(String[] args) {
        int starNum = 1;
        int ednNum = 100;

        for (int i = starNum; starNum <= ednNum; starNum++) {
            boolean num = starNum % 3 ==0;
            if (num) {
                System.out.println(starNum);
            }
        }
    }
}
