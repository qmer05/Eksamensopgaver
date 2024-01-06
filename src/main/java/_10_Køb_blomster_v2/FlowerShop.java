package _10_Køb_blomster_v2;

import java.util.ArrayList;

public class FlowerShop {
    private UI ui = new UI();
    private ArrayList<Flower> flowers;
    private int total;

    public FlowerShop() {
        flowers = new ArrayList<>();
        flowers.add(new Flower("Lily",20));
        flowers.add(new Flower("Tulip",20));
        flowers.add(new Flower("Rose",20));
        flowers.add(new Flower("Daisy",20));
        flowers.add(new Flower("Iris",40));
        flowers.add(new Flower("Sunflower",40));
        flowers.add(new Flower("Orchid",40));
        flowers.add(new Flower("Carnation",80));
        flowers.add(new Flower("Daffodil",80));
        flowers.add(new Flower("Peony",80));
    }

    public int getTotal() {
        return total;
    }

    public void displayFlowers() {
        ui.displayMessage("Flowers: ");
        int i = 1;
        for (Flower f : flowers) {
            ui.displayMessage(i + ") " + f);
            i++;
        }
    }

    public void runDialog() {
        ArrayList<Flower> chosenFlowers = new ArrayList<>();
        ui.displayMessage("Select three flowers from the list.\nEnter after each selection.");

        while (chosenFlowers.size() < 3) {
            int input = 0;
            try {
                input = Integer.parseInt(ui.getInput());
            } catch (NumberFormatException n) {
                System.out.println("invalid input. Please enter a valid number.");
                input = Integer.parseInt(ui.getInput());
            }

            chosenFlowers.add(flowers.get(input - 1));
        }

        ui.displayMessage("Chosen flowers: " + chosenFlowers);

        // prissammensætning for blomster
        for (Flower f : chosenFlowers) {
           total += f.getPrice();
        }

        ui.displayMessage("Would you like the flowers gathered into a bouquet? [Y/N]");
        if (ui.getInput().equalsIgnoreCase("y")) {
            total += 50;
        }
    }
}