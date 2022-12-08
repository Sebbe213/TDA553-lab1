import java.awt.*;

public class Volvo240 extends Car {

    private final static double trimFactor = 1.25;

    public Volvo240(int nrDoors, Color color, double enginePower, String modelName, double currentSpeed, double xVelocity, double yVelocity,double xCoordination, double yCoordination) {
        super(4, Color.black, 100, "Volvo240", 10, xVelocity, yVelocity, false, xCoordination, yCoordination);
    }

    @Override
    protected double speedFactor() {
        if (getCurrentSpeed() > 0 && getCurrentSpeed() < enginePower) {
            return enginePower * 0.01 * trimFactor;
        }
        return -1;
    }
}