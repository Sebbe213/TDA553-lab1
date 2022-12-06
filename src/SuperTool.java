import java.util.ArrayList;
import java.util.List;

public class SuperTool {
    double xCoordination;
    double yCoordination;
    int maxCapacity;


    private final List<Car> loadedCarList = new ArrayList<Car>();

    public SuperTool(double xCoordination, double yCoordination,int maxCapacity) {
        this.xCoordination = xCoordination;
        this.yCoordination = yCoordination;
        this.maxCapacity = maxCapacity;
    }

    public int getNumberOfLoadedCars() {
        return loadedCarList.size();
    }
    protected void loadOn(Car car) {
        if (xCoordinationChecker(car) && yCoordinationChecker(car)
                && loadedCarList.size() <= maxCapacity) {
            loadedCarList.add(car);
            car.setX(this.getxCoordination());
            car.setY(this.getyCoordination());
        }
    }

    protected void loadOff() {
        if (loadedCarList.size() > 0) {
                int lastLoadedCar = loadedCarList.size() - 1;
                Car car = loadedCarList.remove(lastLoadedCar);
                car.setX(car.getxCoordination() + 10);
                car.setY(car.getxCoordination() + 10);
            }
        }



    protected boolean xCoordinationChecker(Car car) {
        return car.getxCoordination() - 20 <= this.getxCoordination()
                || car.getxCoordination() + 20 >= this.getxCoordination();
    }

    protected boolean yCoordinationChecker(Car car) {
        return car.getyCoordination() - 20 <= this.getyCoordination()
                || car.getyCoordination() + 20 >= this.getyCoordination();
    }

    protected double getyCoordination() {
        return yCoordination;
    }

    protected double getxCoordination() {
        return xCoordination;
    }


}
