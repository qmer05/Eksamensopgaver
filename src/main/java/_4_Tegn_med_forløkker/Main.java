package _4_Tegn_med_forløkker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Loops loop = new Loops();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a triangle size number: ");

        int sizeInput = Integer.parseInt(scanner.nextLine());

        System.out.println("Type R to make a right triangle and L to create a left triangle");

        String sideInput = scanner.nextLine().trim();

        if (sideInput.equalsIgnoreCase("r")) {
            loop.drawRightTriangle(sizeInput);
        } else if (sideInput.equalsIgnoreCase("l")) {
            loop.drawLeftTriangle(sizeInput);
        }
    }
}
