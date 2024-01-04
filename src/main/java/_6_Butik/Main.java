package _6_Butik;

public class Main {
    public static void main(String[] args) {

        Item pineapple = new Item("Pineapple", 28);
        Item shampoo = new Item("Shampoo", 26);
        Item cake = new Item("Cake", 18);
        Item toothpaste = new Item("Toothpaste", 12);

        OrderLine orderLinePineapple = new OrderLine(pineapple, 20);
        OrderLine orderLineShampoo = new OrderLine(shampoo, 40);
        OrderLine orderLineCake = new OrderLine(cake, 30);
        OrderLine orderLineToothpaste = new OrderLine(toothpaste, 75);

        Order order = new Order();
        order.addOrderLine(orderLinePineapple);
        order.addOrderLine(orderLineShampoo);
        order.addOrderLine(orderLineCake);
        order.addOrderLine(orderLineToothpaste);

        // komprimeret version af ovenstående til en enkel linje
        order.addOrderLine(new OrderLine(new Item("Cucumber", 8), 50));

        System.out.println(order);
        System.out.println("Total price for the order: " + order.getTotalPrice());
        System.out.println("Total amount for the order: " + order.getTotalAmount());
    }
}
