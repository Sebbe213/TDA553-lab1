import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;

public class RepairShopTest {
    @Test
    public void shouldParkInACarToRepairShop() {
        RepairShop repairshop = new RepairShop(3, 0, 0, "Mekonomen");
        Saab95 saab = new Saab95(2, Color.WHITE, 125, "Saab95", 0, 10, 0);
        Saab95 saab2 = new Saab95(2, Color.WHITE, 125, "Saab95", 0, 10, 0);
        repairshop.parkIn(saab);
        repairshop.parkIn(saab2);
        assertEquals(2, repairshop.repairShop.size());
    }

    @Test
    public void shouldParkOutACarFromRepairShop() {
        RepairShop repairshop = new RepairShop(3, 0, 0, "Mekonomen");
        Saab95 saab = new Saab95(2, Color.WHITE, 125, "Saab95", 0, 10, 0);
        Saab95 saab2 = new Saab95(2, Color.WHITE, 125, "Saab95", 0, 10, 0);
        repairshop.parkIn(saab);
        repairshop.parkIn(saab2);
        repairshop.parkOut(saab2);
        assertEquals(1, repairshop.repairShop.size());

    }

}
