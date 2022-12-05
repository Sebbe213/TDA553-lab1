import java.util.ArrayList;
import java.util.List;

public class RepairShop {
    private int repairShopMaxCapacity;

    private double repairShopXCoordination;

    private double repairShopYCoordination;

    private String repairShopName;

    protected List<Car> repairShop = new ArrayList<Car>();

    // private TransportCar transportCar = new TransportCar()

    public RepairShop(int repairShopMaxCapacity, double repairShopXCoordination, double repairShopYCoordination,
             String repairShopName) {
        this.repairShopMaxCapacity = repairShopMaxCapacity;
        this.repairShopXCoordination = repairShopXCoordination;
        this.repairShopYCoordination = repairShopYCoordination;
    }

    protected void parkIn(Car car) {
        if (repairShopXCoordinationChecker(car) && repairShopYCoordinationChecker(car)
                && repairShop.size() <= repairShopMaxCapacity) {
            repairShop.add(car);
            car.setX(this.repairShopXCoordination);
            car.setY(this.repairShopYCoordination);
        } else {
            System.out.println("The car is to far away from the repair shop, get closer!");
        }
    }

    protected void parkOut(Car car) {
        if (repairShop.size() > 0) {
            int lastParkedCar = repairShop.size() - 1;
            repairShop.remove(lastParkedCar);
            car.setX(this.repairShopXCoordination);
            car.setY(this.repairShopYCoordination);
        } else {
            System.out.println("There are no cars in the repair shop");
        }

    }

    protected boolean repairShopXCoordinationChecker(Car car) {
        return car.getxCoordination() - 20 <= this.getRepairShopXCoordination()
                || car.getxCoordination() + 20 >= this.getRepairShopXCoordination();
    }

    protected boolean repairShopYCoordinationChecker(Car car) {
        return car.getyCoordination() - 20 <= this.getRepairShopYCoordination()
                || car.getyCoordination() + 20 >= this.getRepairShopYCoordination();
    }

    public double getRepairShopXCoordination() {
        return repairShopXCoordination;
    }

    public void setRepairShopXCoordination(double x) {
        this.repairShopXCoordination = x;
    }

    public double getRepairShopYCoordination() {
        return repairShopYCoordination;
    }

    public void setRepairShopYCoordination(double y) {
        this.repairShopYCoordination = y;
    }

}
