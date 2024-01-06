package _10_Køb_blomster_v2;

public class Flower {

    public String name;
    public int price;

    public Flower(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return String.format("%-18s %-1s", "Name: " + name, "Price: " + price);
    }
}
