package _6_Butik;

public class OrderLine {
    private Item item;
    private int amount;

    public OrderLine(Item item, int amount){
        this.item = item;
        this.amount = amount;
    }

    public int getTotalPrice(){
        return item.getPrice() * amount;
    }

    public String toString(){
        return item + " Amount: " + amount + " Total price: " + getTotalPrice();
    }

}
