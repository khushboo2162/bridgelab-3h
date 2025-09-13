public class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelTankSize; // in liters

    public PetrolVehicle(int maxSpeed, String model, double fuelTankSize) {
        super(maxSpeed, model);
        this.fuelTankSize = fuelTankSize;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling. Tank size: " + fuelTankSize + " liters");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Tank Size: " + fuelTankSize + " liters");
    }
}
