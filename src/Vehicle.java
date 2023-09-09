public class Vehicle {
    protected String type;
    protected int numberOfWheels;

    public Vehicle(String type, int numberOfWheels) {
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }

    public void showVehicleDetails() {
        System.out.println("Type: " + type);
        System.out.println("Number of Wheels: " + numberOfWheels);
    }

        public abstract void doVehicleSound();
    }


class Car extends Vehicle {
    private int numberOfDoors;
    private double carPrice;

    public Car(int wheels, int doors, double price) {
        super("Car", wheels);
        this.numberOfDoors = doors;
        this.carPrice = price;
    }

    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    public void doVehicleSound() {
        System.out.println("Vroom Vroom! (Car Sound)");
    }
}

class Boat extends Vehicle {
    private double maxKnotsSpeed;
    private int boatKilosWeight;

    public Boat(double maxSpeed, int weight) {
        super("Boat", 0); // Boats typically don't have wheels
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    public void doVehicleSound() {
        System.out.println("Swish Swish! (Boat Sound)");
    }

    public String getBoatWeightAndSpeed() {
        return "Total Kilos Weight: " + boatKilosWeight + " kg\nMaximum Knots Speed: " + maxKnotsSpeed + " knots";
    }
}

