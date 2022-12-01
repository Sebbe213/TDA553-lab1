import java.awt.*;

public class transportCar extends Car {
    private int maxCapcity;

    Ramp transportCarramp = new Ramp(true);
    protected transportCar(int nrDoors, Color color, double enginePower, String modelName, double currentSpeed, double xVelocity, double yVelocity,int maxCapcity) {
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
}
