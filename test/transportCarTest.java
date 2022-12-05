import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

class transportCarTest {

    @Test
    void shouldLoadOnWhenSpaceAvailable() {
        TransportCar car = new TransportCar(4, Color.WHITE, 90, "charge", 0, 10, 0, 3);
        Saab95 saab = new Saab95(2, Color.WHITE, 125, "Saab95", 0,10, 0);
        car.lowerRamp();
        car.loadOn(saab);
        assertEquals(1,car.loadedCarList.size());
       
    }

    @Test
    void shouldLoadOffWhenSpaceAvailable() {
        TransportCar car = new TransportCar(4, Color.WHITE, 90, "charge", 0, 10, 0, 3);
        Saab95 saab = new Saab95(2, Color.WHITE, 125, "Saab95", 0,10, 0);
        Saab95 saab2 = new Saab95(2, Color.WHITE, 125, "Saab95", 0,10, 0);
        car.lowerRamp();
        car.loadOn(saab);
        car.loadOn(saab2);
        car.loadOff();
        assertEquals(1,car.loadedCarList.size());
    }
    
   

    
}