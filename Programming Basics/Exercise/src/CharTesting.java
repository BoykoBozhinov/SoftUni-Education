import java.util.Arrays;
import java.util.Scanner;

public class CharTesting {
    public static void main(String[] args) {
     String name = "Boyko";
        char myChar = name.charAt(name.length()-1);
        System.out.println(myChar);

        String [] names = new String[]{"Boyko","Kami","Wedding"};
        for (int i = 0; i < names.length; i++){
            System.out.println(Arrays.toString(names));
        }
    }
}
