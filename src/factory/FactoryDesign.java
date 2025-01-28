package factory;


// Factory Design Pattern Example
public class FactoryDesign {

    public static void main(String[] args) {
        // Use the VehicleFactory to create different types of vehicles
        Vehicle car = VehicleFactory.getVehicle("Car");
        car.start();

        Vehicle bike = VehicleFactory.getVehicle("Bike");
        bike.start();

        Vehicle truck = VehicleFactory.getVehicle("Truck");
        truck.start();
    }
}

// Step 1: Create a common interface for vehicles
interface Vehicle {
    void start();
}

// Step 2: Create concrete classes that implement the Vehicle interface

// Car class
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting with a key.");
    }
}

// Bike class
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting with a kick.");
    }
}

// Truck class
class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck is starting with a heavy engine.");
    }
}

// Step 3: Create a Factory class to handle object creation
class VehicleFactory {

    // Factory method to create and return a Vehicle based on the type
    public static Vehicle getVehicle(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }

        switch (type) {
            case "Car":
                return new Car(); // Create a Car object
            case "Bike":
                return new Bike(); // Create a Bike object
            case "Truck":
                return new Truck(); // Create a Truck object
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}

