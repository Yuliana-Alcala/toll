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

    public int getTotalCollected() {
        return totalCollected;
    }
    public List<Vehicle> getVehicles() { 
        return vehicle;
    }

    public void getReport() {
        System.out.println("Toll Station: " + name + ", City: " + city);
        System.out.println("Registered vehicles:");
        for (Vehicle v : vehicle) {
            System.out.println(" - Plate: " + v.getPlate() + ", Toll: $" + v.calculateToll());
        }
        System.out.println("Total raised: $" + totalCollected);
    }

}
