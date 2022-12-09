import java.awt.*;

public class Volvo240 extends Car {

    private final static double trimFactor = 1.25;

    public Volvo240(int nrDoors, Color color, double enginePower, String modelName, double currentSpeed, double xVelocity, double yVelocity,double xCoordination, double yCoordination) {
        super(4, Color.black, 100, "Volvo240", 0, xVelocity, yVelocity, false, xCoordination, yCoordination);
    }

    @Override
    protected double speedFactor() {

        // whenever the currentSpeed is not maxed out or 0

        if (getCurrentSpeed() > 0 && getCurrentSpeed() < enginePower) {
            return enginePower * 0.01 * trimFactor;

            // whenever reaching the upper limits (currentSpeed = enginePower) or the lower limit (currentSpeed = 0)
            // speedFactor will play the main role player when gas and brake, gas will call increment speed and then speedFactor will be added to currentSpeed and break will call on decrement speed which will subtract speedFactor from currentSpeed

        }  else if (getCurrentSpeed() == 0 || getCurrentSpeed() == enginePower) {
            return 0.1;}

        return -1;
    }
}