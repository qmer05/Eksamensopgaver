package _7_Anonymiseret_tekst;

import java.util.ArrayList;

public class StringHandler {
    public String replaceText(String text, ArrayList<String> names){
        for(String name : names){
            text = text.replaceAll(name, "the student");
        }
        return text;
    }

    public String replaceTextGender(String text, ArrayList<String> genders){
        for (String gender : genders){
            text = text.replaceAll("(?i)" + gender, "vedkommende"); // det første for ignoreCase
        }
        return text;
    }

}
