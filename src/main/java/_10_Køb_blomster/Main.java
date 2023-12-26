package _10_Køb_blomster;

public class Main {
    public static void main(String[] args) {

        FlowerShop flowerShop = new FlowerShop();

        flowerShop.displayFlowers();

        flowerShop.runDialog();

        System.out.println("Total price: " + flowerShop.getTotal());

    }
}