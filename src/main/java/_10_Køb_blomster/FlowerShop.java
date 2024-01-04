package _10_Køb_blomster;

import java.util.ArrayList;
import java.util.Scanner;

public class FlowerShop {
    private ArrayList<String> flowers;
    private int total;

    public FlowerShop() {
        flowers = new ArrayList<>();
        flowers.add("Lily");
        flowers.add("Tulip");
        flowers.add("Rose");
        flowers.add("Daisy");
        flowers.add("Iris");
        flowers.add("Sunflower");
        flowers.add("Orchid");
        flowers.add("Carnation");
        flowers.add("Daffodil");
        flowers.add("Peony");
    }

    public int getTotal() {
        return total;
    }

    public void displayFlowers() {
        System.out.println("Flowers:");
        int i = 1;
        for (String s : flowers) {
            System.out.println(i + ") " + s);
            i++;
        }
    }

    public void runDialog() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> chosenFlowers = new ArrayList<>();
        System.out.println("Select three flowers from the list.\nEnter after each selection.");

        while (chosenFlowers.size() < 3) {
            int input = 0;
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException n) {
                System.out.println("invalid input. Please enter a valid number.");
                input = Integer.parseInt(scanner.nextLine());
            }

            chosenFlowers.add(flowers.get(input - 1));
        }

        System.out.println("Chosen flowers: " + chosenFlowers);

        for (String s : chosenFlowers) {
            int index = flowers.indexOf(s);
            if (index < 4) {
                total += 20;
            } else if (index < 7) {
                total += 40;
            } else if (index < 10) {
                total += 80;
            }
        }

        System.out.println("Would you like the flowers gathered into a bouquet? [Y/N]");
        String bouquet = scanner.nextLine();

        if (bouquet.equalsIgnoreCase("y")) {
            total += 50;
        }
    }
}