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
        TollStation station = new TollStation("Peaje Central", "Ciudad X");

        Vehicle coche = new Car("ABC123");
        Vehicle moto = new Motorcycle("DEF456");
        Vehicle camion = new Truck("GHI789", 3);

        station.registerVehicle(coche);
        station.registerVehicle(moto);
        station.registerVehicle(camion);

        station.getReport();
    }
}
