import java.util.Scanner;

public class P03StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char currentLetter = '!';
        String word = "";
        String secretMessage = "";
        boolean firstN = false;
        boolean firstO = false;
        boolean firstC = false;

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            currentLetter = command.charAt(0);
            if (!((currentLetter >= 'A' && currentLetter <= 'Z') || (currentLetter >= 'a' && currentLetter <= 'z'))) {
                command = scanner.nextLine();
                continue;
            }
            switch (currentLetter) {
                case 'n':
                    if (firstN) {
                        word += currentLetter;
                    } else {
                        firstN = true;
                    }
                    break;
                case 'o':
                    if (firstO) {
                        word += currentLetter;
                    } else {
                        firstO = true;
                    }
                    break;
                case 'c':
                    if (firstC) {
                        word += currentLetter;
                    } else {
                        firstC = true;
                    }
                    break;
                default:
                    word += currentLetter;
                    break;
            }
            if (firstC && firstN && firstO) {
                word += " ";
                firstC = false;
                firstN = false;
                firstO = false;
                secretMessage += word;
                word = "";
            }
            command = scanner.nextLine();
        }
        System.out.println(secretMessage);
    }
}
