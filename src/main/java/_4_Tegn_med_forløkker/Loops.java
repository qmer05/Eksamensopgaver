package _4_Tegn_med_forløkker;

public class Loops {
    public void drawLeftTriangle(int i) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < i; j++) {
            sb.append("*");
            System.out.println(sb);
        }
    }

    public void drawRightTriangle(int i) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < i; j++) {
            sb.append("*");
            String formattedString = String.format("%"+i+"s", sb);
            System.out.println(formattedString);
        }
    }

}

