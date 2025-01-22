package project.toll;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MotorcycleTest {

    @Test
    public void testMotorcycleTollCalculation() {
        Vehicle motorcycle = new Motorcycle("DEF456");
        assertEquals(50, motorcycle.calculateToll());
    }
}
