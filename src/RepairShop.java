import java.util.ArrayList;
import java.util.List;


public class RepairShop {
    private int maxCapacity;

    private double xCoordination;

    private double yCoordination;

    private double nrOfAvailableLots;

    private String repairShopName;

    private List<Car> repairShop = new ArrayList<Car>();

    //private TransportCar transportCar = new TransportCar()


    public RepairShop(int maxCapacity, double xCoordination, double yCoordination, double nrOfAvailableLots, String repairShopName) {
        this.maxCapacity = maxCapacity;
        this.xCoordination = xCoordination;
        this.yCoordination = yCoordination;
        this.nrOfAvailableLots = nrOfAvailableLots;
        this.repairShopName = repairShopName;
    }

}
