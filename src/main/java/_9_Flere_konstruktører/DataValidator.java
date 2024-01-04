package _9_Flere_konstruktører;

public class DataValidator {

    public boolean isUppercase(String text) {
        return Character.isUpperCase(text.charAt(0));
    }

    public boolean isMinMaxLength(String text) {
        return text.length() > 8 && text.length() < 20;
    }

    public boolean hasAtSign(String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '@') {
                return true;
            }
        }
        return false;
    }

    public boolean isPhoneNumber(int number){
        String s = String.valueOf(number);
        return s.length() == 8;
    }
}
