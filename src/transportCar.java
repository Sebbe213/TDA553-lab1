import java.awt.*;

public class transportCar extends Car {
    private int maxCapcity;
    private int nrOfCarsToLoad;
    private int closnesIntervall;

    private int loadedCars;

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

    protected void load() {
        if (closnesIntervall <= 20 && nrOfCarsToLoad <= maxCapcity - nrOfCarsToLoad) {
            nrOfAvailableSlots -= nrOfCarsToLoad;


        }

    }

    protected int getLoadedCars() {
        return nrOfCarsToLoad;
    }

    protected void setLoadedCars() {

    }

    protected int getNrOfAvailableSlots() {
        return nrOfAvailableSlots;
    }

    protected void setNrOfAvailableSlots() {
        nrOfAvailableSlots -= loadedCars;
    }
}
