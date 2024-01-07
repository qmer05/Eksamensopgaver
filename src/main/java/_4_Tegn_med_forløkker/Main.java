package _4_Tegn_med_forløkker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Loops loop = new Loops();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Chose what you want to draw:\n1) Triangle\n2) Rectangle");

        int input = Integer.parseInt(scanner.nextLine());

        switch (input) {
            case 1:
                System.out.println("Enter a triangle size number:");

                int sizeInput = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter R to make a right triangle or L to create a left triangle");

                String sideInput = scanner.nextLine().trim();

                if (sideInput.equalsIgnoreCase("r")) {
                    loop.drawRightTriangle(sizeInput);
                } else if (sideInput.equalsIgnoreCase("l")) {
                    loop.drawLeftTriangle(sizeInput);
                }
                break;

            case 2:
                System.out.println("Enter a rectangle size number:");
                loop.drawRectangle(Integer.parseInt(scanner.nextLine()));
                break;
        }
    }
}
