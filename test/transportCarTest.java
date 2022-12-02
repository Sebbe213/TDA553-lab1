import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class transportCarTest {

    @Test
    void loadOn() {
        transportCar car = new transportCar(0, null, 0, null, 0, 0, 0, 0);
        Saab95 saab = new Saab95(0, null, 0, null, 0, 0, 0)
        car.loadOn(saab); 
        assertEquals((1,loadedCarList.size()));
       
    }

    @Test
    void loadOff() {
        transportCar car = new transportCar(0, null, 0, null, 0, 0, 0, 0);
        car.loadOff(); 
        assertEquals(null, null);
    }
    @Test
    boolean xCoordinationChecker(){
        transportCar car = new transportCar(0, null, 0, null, 0, 0, 0, 0);
        
        assertEquals(null, null);

        // Hej

    }
}