
package tutorial3;

class Mobile {
    String brand;
    String model;
    double price;

    void showDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.model = "Galaxy S21";
        m1.price = 70000;

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.model = "iPhone 13";
        m2.price = 85000;

        Mobile m3 = new Mobile();
        m3.brand = "OnePlus";
        m3.model = "Nord 3";
        m3.price = 30000;

        m1.showDetails();
        m2.showDetails();
        m3.showDetails();
    }
}
