package tutorial6;

class Shape {
 public void area() {
     System.out.println("Area depends on shape type.");
 }
}

class Circle extends Shape {
 double radius = 5;

 @Override
 public void area() {
     double result = Math.PI * radius * radius;
     System.out.println("Circle Area: " + result);
 }
}

class Rectangle extends Shape {
 double length = 10, width = 6;

 @Override
 public void area() {
     double result = length * width;
     System.out.println("Rectangle Area: " + result);
 }
}

public class P4_ShapeTest {
 public static void main(String[] args) {
     Shape s1 = new Circle();
     Shape s2 = new Rectangle();

     s1.area();
     s2.area();
 }
}
