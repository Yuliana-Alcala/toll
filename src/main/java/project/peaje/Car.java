package project.peaje;

public class Car extends Vehicle{
    public Car(String plate) {
        super(plate);
    }

    @Override
    public int calculateToll() {
        return 100;
    }

}
