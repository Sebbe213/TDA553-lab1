import org.junit.jupiter.api.Test;


import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ScaniaTest {

    @Test
    void raise() {
        Scania scaniaS = new Scania(2, Color.gray, 90, "Scania Model S",0, 0,0);

        scaniaS.raiseIfStationary();
        assertEquals(46,scaniaS.platta.getAngle());
    }

    @Test
    void lower() {
        Scania scaniaS = new Scania(2, Color.gray, 90, "Scania Model S", 0,0,0);

        scaniaS.lowerIfStationary();
        assertEquals(0,scaniaS.platta.getAngle());
    }
}


