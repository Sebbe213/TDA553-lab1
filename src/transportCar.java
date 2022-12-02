import java.awt.*;
import java.util.ArrayList;
import java.util.List;
// hej
public class transportCar extends Car {


    protected List<Car> loadedCarList = new ArrayList<Car>();

    private int maxCapcity;
    private int nrOfAvailableSlots;


    Ramp transportCarramp = new Ramp(true);

    protected transportCar(int nrDoors, Color color, double enginePower, String modelName, double currentSpeed, double xVelocity, double yVelocity, int maxCapcity) {
        super(nrDoors, color, enginePower, modelName, currentSpeed, xVelocity, yVelocity);
        this.maxCapcity = maxCapcity;

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
        if (xCoordinationChecker(car) && yCoordinationChecker(car)
                && loadedCarList.size() <= getNrOfAvailableSlots() && transportCarramp.ramp == rear.Level.DOWN) {
            loadedCarList.add(car);
        } else {
            System.out.println("The car chosen to be loaded is too far away from the transport car, get a bit closer");
        }
        updateNrOfAvailableSlots();
    }

    protected void loadOff(Car car) {
        if (loadedCarList.size() > 0) {
            if (this.getCurrentSpeed() == 0 && transportCarramp.ramp == rear.Level.DOWN) {
                int lastLoadedCar = loadedCarList.size() - 1;
                loadedCarList.remove(lastLoadedCar);
            } else {
                System.out.println("There are no cars to load off");
        }
        updateNrOfAvailableSlots();
        car.setX(car.getxCoordination() + 10);
        car.setY(car.getxCoordination() + 10);
        }
    }



    protected void lowerRamp() {
        if (this.getCurrentSpeed() == 0) {
            transportCarramp.setRampDown();
        }
    }

    protected void raiseRamp() {
        if (this.getCurrentSpeed() == 0) {
            transportCarramp.setRampUp();
        }
    }

    protected boolean xCoordinationChecker(Car car) {
        if (car.getxCoordination() - 20 <= this.getxCoordination() || car.getxCoordination() + 20 >= this.getxCoordination()) {
            return true;
        }
        else {return false;}
        // return car.getxCoordination() - 20 <= this.getxCoordination() || car.getxCoordination() + 20 >= this.getxCoordination();
    }

    protected boolean yCoordinationChecker(Car car) {
        if (car.getyCoordination() - 20 <= this.getyCoordination() || car.getyCoordination() + 20 >= this.getyCoordination()) {
            return true;
        }
        else {return false;}
        // return car.getyCoordination() - 20 <= this.getyCoordination() || car.getyCoordination() + 20 >= this.getyCoordination();
    }
    protected void updateNrOfAvailableSlots() {
        nrOfAvailableSlots = maxCapcity - loadedCarList.size();
    }

    protected int getNrOfAvailableSlots() {
        return nrOfAvailableSlots;
    }

}
