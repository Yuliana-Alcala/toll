package project.toll;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        TollStation station = new TollStation("Toll Central", "City Valencia");

        Vehicle car = new Car("ABC123");
        Vehicle motorcycle = new Motorcycle("DEF456");
        Vehicle truck = new Truck("GHI789", 4);

        station.registerVehicle(car);
        station.registerVehicle(motorcycle);
        station.registerVehicle(truck);

        station.getReport();
    }
}
