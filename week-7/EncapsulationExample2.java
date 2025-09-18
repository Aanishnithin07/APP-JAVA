class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length > 0)
            this.length = length;
        else
            System.out.println("Invalid length");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0)
            this.width = width;
        else
            System.out.println("Invalid width");
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class EncapsulationExample2 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(5);
        rect.setWidth(3);

        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}