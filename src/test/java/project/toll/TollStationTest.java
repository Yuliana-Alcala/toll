package project.toll;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
        Vehicle truck = new Truck("GHI789", 4
        );

        station.registerVehicle(car);
        station.registerVehicle(motorcycle);
        station.registerVehicle(truck);

        assertEquals(350, station.getTotalCollected());
        assertEquals(3, station.getVehicles().size());
    }
    @Test
    public void testGetReport() {
        
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        
        TollStation station = new TollStation("Test Station", "Test City");
        Vehicle car = new Car("ABC123");
        Vehicle motorcycle = new Motorcycle("DEF456");
        Vehicle truck = new Truck("GHI789", 3);

        station.registerVehicle(car);
        station.registerVehicle(motorcycle);
        station.registerVehicle(truck);

        
        station.getReport();

        
        System.setOut(System.out);

        String expectedOutput = """
                Toll Station: Test Station, City: Test City
                Registered vehicles:
                 - Plate: ABC123, Toll: $100
                 - Plate: DEF456, Toll: $50
                 - Plate: GHI789, Toll: $150
                Total raised: $300
                """;

        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }
}
