package project.toll;

import java.util.ArrayList;
import java.util.List;

public class TollStation {

    private String name;
    private String city;
    private int totalCollected;
    private List<Vehicle> vehicle;

    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalCollected = 0;
        this.vehicle = new ArrayList<>();
    }

    public void registerVehicle(Vehicle v) {
        int peaje = v.calculateToll();
        totalCollected += peaje;
        vehicle.add(v);
    }

    public void getReport() {
        System.out.println("Estación de Peaje: " + name + ", Ciudad: " + city);
        System.out.println("Vehículos registrados:");
        for (Vehicle v : vehicle) {
            System.out.println(" - Placa: " + v.getPlate() + ", Peaje: $" + v.calculateToll());
        }
        System.out.println("Total recaudado: $" + totalCollected);
    }

}
