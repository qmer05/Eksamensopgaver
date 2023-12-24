package _7_Anonymiseret_tekst;

import java.util.ArrayList;

public class StringHandler {

    public String replaceText(String text, ArrayList<String> names){
        for(String name : names){
            text = text.replace(name, "the student");
        }
        return text;
    }
}
