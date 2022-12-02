import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class transportCar extends Car {


    protected List<Car> loadedCarList = new ArrayList<Car>();

    private int maxCapcity;
    private int nrOfCarsToLoad;
    private int closnesIntervall;

    private int nrOfLoadedCars;

    private int nrOfAvailableSlots;


    Ramp transportCarramp = new Ramp(true);

    protected transportCar(int nrDoors, Color color, double enginePower, String modelName, double currentSpeed, double xVelocity, double yVelocity, int maxCapcity) {
        super(nrDoors, color, enginePower, modelName, currentSpeed, xVelocity, yVelocity);
        int maxCapacity = maxCapcity;

    }

    @Override
    protected double speedFactor() {
        return 0;
    }

    @Override
    protected void incrementSpeed(double amount) {
    }

    @Override
    protected void decrementSpeed(double amount) {
    }

    protected void loadOn(Car car) {
        if (xCoordinationChecker(car) && yCoordinationChecker(car)) {
            nrOfAvailableSlots -= nrOfCarsToLoad;
            loadedCarList.add(car);
        } else {
            System.out.println("Du e för långt bort din jävel");
    }
    }

    protected void loadOff(Car car) {
        int lastLoadedCar = loadedCarList.size() -1;
        loadedCarList.remove(lastLoadedCar);
    }

    protected int getLoadedCars() {
        return nrOfCarsToLoad;
    }

    protected boolean xCoordinationChecker(Car car) {
        if (car.getxCoordination() - 20 <= this.getxCoordination() || car.getxCoordination() + 20 >= this.getxCoordination()) {
            return true;
        }
        else {return false;}
    }

    protected boolean yCoordinationChecker(Car car) {
        if (car.getyCoordination() - 20 <= this.getyCoordination() || car.getyCoordination() + 20 >= this.getyCoordination()) {
            return true;
        }
        else {return false;}
    }


    protected int getNrOfAvailableSlots() {
        return nrOfAvailableSlots;
    }

    protected void setNrOfAvailableSlots() {
        nrOfAvailableSlots -= nrOfLoadedCars;
    }
}
