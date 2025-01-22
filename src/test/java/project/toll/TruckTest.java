package project.toll;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TruckTest {

    @Test
    public void testTruckTollCalculation() {
        Vehicle truck = new Truck("GHI789", 4);
        assertEquals(200, truck.calculateToll());
    }
}
