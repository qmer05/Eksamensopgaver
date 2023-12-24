package _7_Anonymiseret_tekst;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        StringHandler sh = new StringHandler();
        String text = """
                Katrine trak sit spørgsmål kl. 10. Katrine fik karakteren 7.
                Anders trak sit spørgsmål kl. 11. Anders fik karakteren 4.
                Joakim trak sit spørgsmål kl. 12. Joakim fik karakteren 10.
                Stine trak sit spørgsmål kl. 13. Stine fik karakteren 12.
                """;

        System.out.println("\nFør anonymiserede navne:\n" + text);

        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Katrine");
        studentNames.add("Anders");
        studentNames.add("Joakim");
        studentNames.add("Stine");

        String anonymiseredeNavne = sh.replaceText(text, studentNames);

        System.out.println("Efter anonymiserede navne:\n" + anonymiseredeNavne);

    }
}
