package project.toll;

public class Motorcycle extends Vehicle{
    public Motorcycle(String plate) {
        super(plate);
    }

    @Override
    public int calculateToll() {
        return 50;
    }

}
