public class Test {

    public static void main(String[] args) {
        Car myCar = new Car(4, 4, 25000.0);
        Boat myBoat = new Boat(30.5, 5000);

        System.out.println("Car Details:");
        myCar.showVehicleDetails();
        myCar.doVehicleSound();
        System.out.println("\nBoat Details:");
        myBoat.showVehicleDetails();
        myBoat.doVehicleSound();

        System.out.println("\nBoat Weight and Speed:");
        System.out.println(myBoat.getBoatWeightAndSpeed());
    }
}
