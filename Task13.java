package ciicc.com;

class Vehicle{
    String make;
    String model;
    int year;
}

class Car extends Vehicle{
    int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super.make = make;
        super.model = model;
        super.year = year;
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        System.out.println("Car Details: " + "\n" +
                            "Make: " + make + "\n" +
                            "Model: " + model +"\n" +
                            "Year: " + year + "\n" +
                            "Number of Doors: " + numberOfDoors + "\n");
    }
}

public class Task13 {
    public static void main() {
        Car car = new Car("Toyota", "Camry", 2022, 4);
        car.displayDetails();
    }
}
