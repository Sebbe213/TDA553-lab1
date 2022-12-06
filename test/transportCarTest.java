import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

class transportCarTest {

    @Test
    void shouldLoadOnWhenSpaceAvailable() {

        TransportCar transportCar = new TransportCar(4, Color.WHITE, 90, "charge", 0, 10, 0, 3);
        Saab95 saab = new Saab95(2, Color.WHITE, 125, "Saab95", 0,10, 0);
        transportCar.lowerRamp();
        transportCar.loadOn(saab);
        assertEquals(1, transportCar.getNumberOfLoadedCars() );
       
    }

    @Test
    void shouldLoadOffWhenSpaceAvailable() {

        TransportCar transportCar = new TransportCar(4, Color.WHITE, 90, "charge", 0, 10, 0, 3);
        Saab95 saab = new Saab95(2, Color.WHITE, 125, "Saab95", 0,10, 0);
        Saab95 saab2 = new Saab95(2, Color.WHITE, 125, "Saab95", 0,10, 0);
        transportCar.lowerRamp();
        transportCar.loadOn(saab);
        transportCar.loadOn(saab2);
        transportCar.loadOff();
        assertEquals(1, transportCar.getNumberOfLoadedCars() );
    }
}