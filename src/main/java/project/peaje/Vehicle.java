package project.peaje;

public abstract class Vehicle {
    protected String plate;

    public Vehicle(String plate) {
        this.plate = plate;
    }

    public abstract int calculateToll();

    public String getPlate() {
        return plate;
    }

}
