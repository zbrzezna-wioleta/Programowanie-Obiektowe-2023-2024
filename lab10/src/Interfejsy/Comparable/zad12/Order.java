package Interfejsy.Comparable.zad12;

public class Order implements Comparable<Order>{
    private String productName;
    private int quantity;
    private double unitPrice;

    public Order(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public int compareTo(Order o) {
        int result = Double.compare(o.unitPrice,this.unitPrice);
        if (result != 0) {
            return result;
        }
        return Integer.compare(this.quantity, o.quantity);
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
