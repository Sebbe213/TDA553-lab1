import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;

import org.junit.jupiter.api.Test;

public class Saab95Test {
    @Test
    public void speedFactorTest() {
        Saab95 saab = new Saab95(2, Color.WHITE, 125, "Saab95", 10,0.1, 10);
        assertEquals(1.625, saab.speedFactor(20));
    }


    @Test
    public void incrementSpeedTest() {
        Saab95 saab = new Saab95(2, Color.WHITE, 125, "Saab95", 10,0.1, 0);
        saab.incrementSpeed(10);
        assertEquals(26.25, saab.getCurrentSpeed());


    }

    @Test
    public void decrementSpeedTest() {
        Saab95 saab = new Saab95(2, Color.WHITE, 125, "Saab95", 10,0.1, 0);
        saab.decrementSpeed(10);
        assertEquals(-6.25, saab.getCurrentSpeed());
    }


    @Test
    public void turnRightTest() {
        Saab95 saab = new Saab95(2, Color.WHITE, 125, "Saab95", 10,10, 0);
        saab.turnRight();
        saab.setxCoordination();
        assertEquals(0, saab.getxCoordination());
    }

    @Test
    public void turnLeftTest() {
        Saab95 saab = new Saab95(4, Color.WHITE, 125, "Saab404", 10,0, 10);
        saab.turnLeft();
        saab.setyCoordination();
        assertEquals(0, saab.getyCoordination());

    }

    @Test
    public void gasTest() {
        Saab95 saab = new Saab95(4, Color.WHITE, 125, "Saab404", 10,0, 10);
        saab.gas(0.5);
        assertEquals(10.8125, saab.getCurrentSpeed());
    }

    @Test
    public void brakeTest() {
        Saab95 saab = new Saab95(4, Color.WHITE, 125, "Saab404", 10,0, 10);
        saab.brake(0.5);
        assertEquals(9.1875, saab.getCurrentSpeed());
    }
}
