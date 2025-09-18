package tutorial5;

class Vehicle {
    int speed;
    int fuelCapacity;

    Vehicle(int speed, int fuelCapacity) {
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    void start() {
        System.out.println("Vehicle started with speed " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int numberOfDoors;
    Car(int speed, int fuelCapacity, int doors) {
        super(speed, fuelCapacity);
        this.numberOfDoors = doors;
    }
}

class Bike extends Vehicle {
    boolean hasGear;
    Bike(int speed, int fuelCapacity, boolean hasGear) {
        super(speed, fuelCapacity);
        this.hasGear = hasGear;
    }
}

class Truck extends Vehicle {
    int loadCapacity;
    Truck(int speed, int fuelCapacity, int loadCapacity) {
        super(speed, fuelCapacity);
        this.loadCapacity = loadCapacity;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car car = new Car(120, 40, 4);
        car.start();

        Truck truck = new Truck(80, 150, 10000);
        truck.start();
    }
}
