import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ScaniaTest {

    @Test
    void raise() {
        Scania scaniaS = new Scania(2, Color.gray, 90, "Scania Model S", 0,0);
        scaniaS.platta.raise(10);
        assertEquals(10,scaniaS.platta.angel);
    }

    @Test
    void lower() {

    }
}