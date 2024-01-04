package _6_Butik;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Name: " + name + " Price: " + price;
    }

    public int getPrice() {
        return price;
    }

}
