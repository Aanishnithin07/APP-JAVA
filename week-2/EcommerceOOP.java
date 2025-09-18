package tutorial2;

class Order {
    private double price;

    public Order(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

public class EcommerceOOP {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(299.99),
            new Order(149.50),
            new Order(450.75),
            new Order(89.99)
        };

        double totalPrice = 0;
        for (Order order : orders) {
            totalPrice += order.getPrice();
        }

        System.out.println("Total Price of All Orders: " + totalPrice);
    }
}
