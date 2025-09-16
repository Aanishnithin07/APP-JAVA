package tutorial6;

class Customer {
 public void getDiscount() {
     System.out.println("Discount depends on customer type.");
 }
}

class RegularCustomer extends Customer {
 @Override
 public void getDiscount() {
     System.out.println("Regular Customer gets 5% discount.");
 }
}

class PremiumCustomer extends Customer {
 @Override
 public void getDiscount() {
     System.out.println("Premium Customer gets 10% discount.");
 }
}

public class P2_DiscountTest {
 public static void main(String[] args) {
     Customer c1 = new RegularCustomer();
     Customer c2 = new PremiumCustomer();

     c1.getDiscount();
     c2.getDiscount();
 }
}
