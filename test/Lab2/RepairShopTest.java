import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;

public class RepairShopTest {
    @Test
    public void shouldParkInACarToRepairShop() {

        RepairShop repairshop = new RepairShop(4, 0, 0, "Mekonomen");
        Saab95 saab = new Saab95(2, Color.WHITE, 125, "Saab95", 10, 0.1, 0,0,0);
        Saab95 saab2 = new Saab95(2, Color.WHITE, 125, "Saab95", 10, 0.1, 0,0,0);
        Saab95 saab3 = new Saab95(2, Color.WHITE, 125, "Saab95", 10, 0.1, 0,0,0);

        repairshop.parkIn(saab);
        repairshop.parkIn(saab2);
        repairshop.parkIn(saab3);

        assertEquals(3, repairshop.getNumberOfLoadedCars());
    }

    @Test
    public void shouldParkOutACarFromRepairShop() {
        RepairShop repairshop = new RepairShop(3, 0, 0, "Mekonomen");
        Saab95 saab = new Saab95(2, Color.WHITE, 125, "Saab95", 10, 0.1, 0,0,0);
        Saab95 saab2 = new Saab95(2, Color.WHITE, 125, "Saab95", 10, 0.1, 0,0,0);

        repairshop.parkIn(saab);
        repairshop.parkIn(saab2);
        repairshop.parkOut(saab2);

        assertEquals(1,  repairshop.getNumberOfLoadedCars());

    }

}
