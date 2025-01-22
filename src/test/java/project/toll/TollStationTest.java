package project.toll;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TollStationTest {

    @Test
    public void testRegisterVehicle() {
        TollStation station = new TollStation("Test Station", "Test City");
        Vehicle car = new Car("ABC123");
        station.registerVehicle(car);

       
        assertEquals(100, station.getTotalCollected());

        
        assertEquals(1, station.getVehicles().size());
    }

    @Test
    public void testGenerateReport() {
        TollStation station = new TollStation("Test Station", "Test City");
        Vehicle car = new Car("ABC123");
        Vehicle motorcycle = new Motorcycle("DEF456");
        Vehicle truck = new Truck("GHI789", 3);

        station.registerVehicle(car);
        station.registerVehicle(motorcycle);
        station.registerVehicle(truck);

        assertEquals(350, station.getTotalCollected());
        assertEquals(3, station.getVehicles().size());
    }
}
