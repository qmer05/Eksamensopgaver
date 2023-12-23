package _6_Butik;

import java.util.ArrayList;

public class Order {
    private ArrayList<OrderLine> orderLines;

    public Order (){
        orderLines = new ArrayList<>();
    }

    public int getTotalPrice(){
        int totalPrice = 0;
        for (OrderLine o : orderLines){
            totalPrice += o.getTotalPrice();
        }
        return totalPrice;
    }

    public void addOrderLine(OrderLine orderLine){
        orderLines.add(orderLine);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (OrderLine o : orderLines){
            sb.append(o + "\n");
        }
        return sb.toString();
    }

}
