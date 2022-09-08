package finalExam;

import java.rmi.MarshalledObject;
import java.util.*;

public class P03HeroRecruitment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> heroes = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commandData = input.split(" ");

            String command = commandData[0];
            String heroName = commandData[1];

            List<String> heroSpell = heroes.get(heroName);
            switch (command) {
                case "Enroll":
                    if (heroes.containsKey(heroName)) {
                        System.out.printf("%s is already enrolled.%n", heroName);
                    } else {
                        heroes.put(heroName, new ArrayList<>());
                    }
                    break;
                case "Learn":
                    String spellName = commandData[2];
                    if (!heroes.containsKey(heroName)) {
                        System.out.printf("%s doesn't exist.%n", heroName);
                    } else {

                        if (heroSpell.contains(spellName)) {
                            System.out.printf("%s has already learnt %s.%n", heroName, spellName);
                        } else {
                            heroes.get(heroName).add(spellName);
                        }
                    }
                    break;
                case "Unlearn":
                    String unlearnSpell = commandData[2];
                    if (!heroes.containsKey(heroName)) {
                        System.out.printf("%s doesn't exist.%n", heroName);
                    } else {
                        if (!heroSpell.contains(unlearnSpell)) {
                            System.out.printf("%s doesn't know %s.%n", heroName, unlearnSpell);
                        } else {
                            heroes.get(heroName).remove(unlearnSpell);
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Heroes:");
        heroes.forEach((key, value) -> System.out.printf("== %s: %s%n", key, String.join(", ", value)));
    }
}
