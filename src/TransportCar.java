import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TransportCar extends Car {

    private int loadingCapacity;

    private SuperTool superTool;

    private Ramp transportCarramp = new Ramp();

    protected TransportCar(int nrDoors, Color color, double enginePower, String modelName, double currentSpeed,
            double xVelocity, double yVelocity, int loadingCapacity) {
        super(nrDoors, color, enginePower, modelName, currentSpeed, xVelocity, yVelocity);
        this.loadingCapacity = loadingCapacity;
       this.superTool = new SuperTool(getxCoordination(),getyCoordination(),loadingCapacity);
    }

    public int getNumberOfLoadedCars() {
        return superTool.getNumberOfLoadedCars();
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
        if (transportCarramp.ramp == rear.Level.DOWN) {
            try {
                superTool.loadOn(car);
            } catch (Exception e) {
                System.out.println("The car can not be loaded, check car position, capacity or ramp level.");
            }
        }
        /*
        if (xCoordinationChecker(car) && yCoordinationChecker(car)
                && loadedCarList.size() <= maxCapacity && transportCarramp.ramp == rear.Level.DOWN) {
            loadedCarList.add(car);
            car.setX(this.getxCoordination());
            car.setY(this.getyCoordination());
        } else {
            System.out.println("The car can not be loaded, check car position, capacity or ramp level.");
        }
    }
    */
    }

    protected void loadOff() {
        /*
        }
        if (
    */
        if (this.getCurrentSpeed() == 0 && transportCarramp.ramp == rear.Level.DOWN) {
            try {
                superTool.loadOff();

            } catch (Exception e) {

                System.out.println("There are no cars to load off");
            }
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

    /*protected boolean xCoordinationChecker(Car car) {
        return car.getxCoordination() - 20 <= this.getxCoordination()
                || car.getxCoordination() + 20 >= this.getxCoordination();
    }

    protected boolean yCoordinationChecker(Car car) {
        return car.getyCoordination() - 20 <= this.getyCoordination()
                || car.getyCoordination() + 20 >= this.getyCoordination();
    }
    */

}

