package tutorial6;


//Vehicle.java
class Vehicle {
 public void speed() {
     System.out.println("Vehicle speed varies.");
 }
}

class Car extends Vehicle {
 @Override
 public void speed() {
     System.out.println("Car runs at 100 km/h.");
 }
}

class Bike extends Vehicle {
 @Override
 public void speed() {
     System.out.println("Bike runs at 80 km/h.");
 }
}

public class P1_VehicleTest{
 public static void main(String[] args) {
     Vehicle v1 = new Car();
     Vehicle v2 = new Bike();

     v1.speed();
     v2.speed();
 }
}

