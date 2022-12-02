import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

class transportCarTest {

    @Test
    void loadOn() {
        transportCar car = new transportCar(4, Color.WHITE, 90, "charge", 0, 10, 0, 3);
        Saab95 saab = new Saab95(2, Color.WHITE, 125, "Saab95", 0,10, 0);
        car.lowerRamp();
        car.loadOn(saab);
        //car.loadedCarList.add(saab);
        car.updateNrOfAvailableSlots();
        assertEquals(2,car.getNrOfAvailableSlots());
       
    }

    @Test
    void loadOff() {
        transportCar car = new transportCar(4, Color.WHITE, 90, "charge", 0, 10, 0, 3);
        Saab95 saab = new Saab95(2, Color.WHITE, 125, "Saab95", 0,10, 0);
        car.loadOff(saab);
        car.loadedCarList.remove(saab);
        car.updateNrOfAvailableSlots();
        assertEquals(3,car.getNrOfAvailableSlots());
    }
    
   

    
}