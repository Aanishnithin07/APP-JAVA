class Vehicle {
    String make;
    String model;
    int year;
    int num_wheels;

    Vehicle(String make, String model, int year, int num_wheels) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.num_wheels = num_wheels;
    }

    void displayVehicleInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Wheels: " + num_wheels);
    }
}

interface Engine {
    void displayEngineInfo();
}

class Car extends Vehicle implements Engine {
    String type;
    int horsepower;
    String fuel_type;

    Car(String make, String model, int year, int num_wheels, String type, int horsepower, String fuel_type) {
        super(make, model, year, num_wheels);
        this.type = type;
        this.horsepower = horsepower;
        this.fuel_type = fuel_type;
    }

    public void displayEngineInfo() {
        System.out.println("Engine Type: " + type);
        System.out.println("Horsepower: " + horsepower);
        System.out.println("Fuel Type: " + fuel_type);
    }
}

class Truck extends Vehicle implements Engine {
    String type;
    int horsepower;
    String fuel_type;

    Truck(String make, String model, int year, int num_wheels, String type, int horsepower, String fuel_type) {
        super(make, model, year, num_wheels);
        this.type = type;
        this.horsepower = horsepower;
        this.fuel_type = fuel_type;
    }

    public void displayEngineInfo() {
        System.out.println("Engine Type: " + type);
        System.out.println("Horsepower: " + horsepower);
        System.out.println("Fuel Type: " + fuel_type);
    }
}

class Motorcycle extends Vehicle implements Engine {
    String type;
    int horsepower;
    String fuel_type;

    Motorcycle(String make, String model, int year, int num_wheels, String type, int horsepower, String fuel_type) {
        super(make, model, year, num_wheels);
        this.type = type;
        this.horsepower = horsepower;
        this.fuel_type = fuel_type;
    }

    public void displayEngineInfo() {
        System.out.println("Engine Type: " + type);
        System.out.println("Horsepower: " + horsepower);
        System.out.println("Fuel Type: " + fuel_type);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 4, "V6", 300, "Petrol");
        Truck truck = new Truck("Ford", "F-150", 2021, 4, "V8", 450, "Diesel");
        Motorcycle bike = new Motorcycle("Yamaha", "R3", 2023, 2, "Inline-2", 40, "Petrol");

        System.out.println("Car Info:");
        car.displayVehicleInfo();
        car.displayEngineInfo();

        System.out.println("\nTruck Info:");
        truck.displayVehicleInfo();
        truck.displayEngineInfo();

        System.out.println("\nMotorcycle Info:");
        bike.displayVehicleInfo();
        bike.displayEngineInfo();
    }
}