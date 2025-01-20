package project.peaje;

public class Truck extends Vehicle{
    private int numOfAxles;
    public Truck(String plate) {
        super(plate);
    }

    @Override
    public int calculateToll() {
        return numOfAxles * 50;
    }

}
