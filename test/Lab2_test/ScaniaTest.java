import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ScaniaTest {

    @Test
    void shouldRaisePlatformIfCurrentSpeedEqualsToZero() {
        double raiseAngle = 16;
        Scania scaniaS = new Scania(2, Color.gray, 90, "Scania Model S", 0, 0, 0,0,0);
        scaniaS.raisePlatform(raiseAngle);
        assertEquals(raiseAngle, scaniaS.platta.getAngle());
    }

    @Test
    void shouldLowerlatformIfCurrentSpeedEqualsToZero() {
        Scania scaniaS = new Scania(2, Color.gray, 90, "Scania Model S", 0, 0, 0,0,0);
        scaniaS.raisePlatform(30);
        scaniaS.lowerPlatform(40);
        assertEquals(0, scaniaS.platta.getAngle());
    }

    @Test
    void shouldNotLowerPlatformIfCurrentSpeedGreaterThanZero() {
        Scania scaniaS = new Scania(2, Color.gray, 90, "Scania Model S", 0, 0, 0,0,0);
        scaniaS.incrementSpeed(1);
        scaniaS.lowerPlatform(20);
        assertEquals(0, scaniaS.platta.getAngle());
    }

    @Test
    void shouldNotRaisePlatformIfCurrentSpeedGreaterThanZero() {
        Scania scaniaS = new Scania(2, Color.gray, 90, "Scania Model S", 10, 0, 0,0,0);
        scaniaS.raisePlatform(20);
        assertEquals(0, scaniaS.platta.getAngle());

    }

    @Test
    void shouldIncrementSpeedOnlyIfPlatforIsUp() {
        Scania scaniaS = new Scania(2, Color.gray, 90, "Scania Model S", 10, 0, 0,0,0);
        scaniaS.startEngine();
        scaniaS.incrementSpeed(10);
        assertEquals(10.1, scaniaS.getCurrentSpeed());



    }
    @Test
    void shouldNotIncrementSpeedIfPlatforIsDown(){
        Scania scaniaS = new Scania(2, Color.gray, 90, "Scania Model S", 0, 0, 0,0,0);
        scaniaS.startEngine();
        scaniaS.raisePlatform(20);
        scaniaS.incrementSpeed(2);
        assertEquals(0.1, scaniaS.getCurrentSpeed());
    }
}
