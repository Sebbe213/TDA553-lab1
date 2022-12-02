import java.util.ArrayList;
import java.util.List;


public class RepairShop {
    private int repairShopMaxCapacity;

    private double repairShopXCoordination;

    private double repairShopYCoordination;

    private int nrOfAvailableLots;

    private String repairShopName;

    private List<Car> repairShop = new ArrayList<Car>();

    //private TransportCar transportCar = new TransportCar()


    public RepairShop(int repairShopMaxCapacity, double repairShopXCoordination, double repairShopYCoordination, int nrOfAvailableLots, String repairShopName) {
        this.repairShopMaxCapacity = repairShopMaxCapacity;
        this.repairShopXCoordination = repairShopXCoordination;
        this.repairShopYCoordination = repairShopYCoordination;
        this.nrOfAvailableLots = nrOfAvailableLots;
        this.repairShopName = repairShopName;
    }

    protected void parkIn(Car car) {
        if (repairShopXCoordinationChecker(car) && repairShopYCoordinationChecker(car) && repairShop.size() <= getNrOfAvailableLots() ) {
            repairShop.add(car);
        } else{ 
            System.out.println("The car is to far away from the repair shop, get closer!");
        }
    }

    protected void parkOut(Car car) {
        if (repairShop.size() > 0) {
            int lastParkedCar = repairShop.size() - 1;
            repairShop.remove(lastParkedCar);
        } else {
            System.out.println("There are no cars in the repair shop");
        }
        updateNrOfAvailableLots();
        car.setX(car.getxCoordination() + 20);
        car.setY(car.getyCoordination() + 20);
    }


    protected boolean repairShopXCoordinationChecker(Car car) {
        return car.getxCoordination() - 20 <= this.getRepairShopXCoordination() || car.getxCoordination() + 20 >= this.getRepairShopXCoordination();
    }

    protected boolean repairShopYCoordinationChecker(Car car) {
        return car.getyCoordination() - 20 <= this.getRepairShopYCoordination() || car.getyCoordination() + 20 >= this.getRepairShopYCoordination();
    }

    private double getRepairShopXCoordination() {
        return repairShopXCoordination;
    }
    private void setRepairShopXCoordination(double x) {
        this.repairShopXCoordination = x;
    }

    private double getRepairShopYCoordination() {
        return repairShopYCoordination;
    }
    private void setRepairShopYCoordination(double y) {
        this.repairShopYCoordination = y;
    }



    protected void updateNrOfAvailableLots() {
        nrOfAvailableLots = repairShopMaxCapacity - repairShop.size();
    }

    protected int getNrOfAvailableLots () {
            return nrOfAvailableLots;
        }
    }

