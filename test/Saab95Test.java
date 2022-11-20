

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;

import org.junit.jupiter.api.Test;

public class Saab95Test {
    @Test
    public void speedFactorTest() {
        Saab95 saab = new Saab95(2, Color.WHITE, 125, "Saab95", 0, 10);
        assertEquals(1.625,saab.speedFactor(20));
    }



    @Test
    public void incrementSpeedTest() {
        Saab95 saab = new Saab95(2, Color.WHITE, 125, "Saab95", 0, 10);
        saab.incrementSpeed(10);
        assertEquals(16.35,saab.getCurrentSpeed());


    }

    @Test
    public void decrementSpeedTest() {
        Saab95 saab = new Saab95(2, Color.WHITE, 125, "Saab95", 0, 10);
        saab.decrementSpeed(10);
        assertEquals(-16.15,saab.getCurrentSpeed());

    }

    @Test
    public void gasTest() {
        Saab95 saab = new Saab95(2, Color.WHITE, 125, "Saab95", 0, 10);
    


    }

    @Test
    public void brakeTest() {
    }

    @Test
    public void turnRightTest(){
        Saab95 saab = new Saab95(2, Color.WHITE, 125, "Saab95", 0, 10);
        saab.getxVelocity();
        // saab.setyCoordination();
        assertEquals(-0.1, saab.getxVelocity());
        // assertEquals(0, saab.getyCoordination());



    }

    @Test
    public void turnLeftTest(){
        Saab95 saab = new Saab95(2, Color.WHITE, 125, "Saab95", 0, 10);
        saab.setxCoordination();
        saab.setyCoordination();
        assertEquals(null, saab.getxCoordination());
        assertEquals(null, saab.getyCoordination());
    }

    /*
    @Test
    public void setTurboOn() {
        Saab95 mySebbe = new Saab95(2, Color.WHITE,125,"Volvo240",0.1,10,10,0,0);

        assertTrue(mySebbe.turboOn);
    }


    @Test
    public void setTurboOff() {
        Saab95 mySebbe = new Saab95(2, Color.WHITE,125,"Volvo240",0.1,10,10,0,0);

        assertFalse(mySebbe.turboOn);

     */




}
