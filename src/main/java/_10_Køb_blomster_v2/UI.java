package _10_Køb_blomster_v2;

import java.util.Scanner;

public class UI {
    Scanner scanner = new Scanner(System.in);

    public void displayMessage(String msg) {
        System.out.println(msg);
    }

    public String getInput() {
        return scanner.nextLine();
    }

}
