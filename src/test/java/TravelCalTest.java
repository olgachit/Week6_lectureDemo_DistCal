import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TravelCalTest {

    @Test
    void calculateTime() {
        assertEquals(1.5, TravelCal.calculateTime(150, 100), 0.01);
    }
}