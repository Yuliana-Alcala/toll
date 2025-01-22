package project.toll;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testCarTollCalculation() {
        Vehicle car = new Car("ABC123");
        assertEquals(100, car.calculateToll());
    }
}