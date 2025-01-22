package project.toll;

public class Truck extends Vehicle{
    private int numOfAxles;
    public Truck(String plate, int numOfAxles) {
        super(plate);
        this.numOfAxles = numOfAxles;
    }

    @Override
    public int calculateToll() {
        return numOfAxles * 50;
    }

}
