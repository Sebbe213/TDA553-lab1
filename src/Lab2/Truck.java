import java.awt.*;

public abstract class Truck extends Car{

    private iPlatformInterface platform;

    protected Truck(int nrDoors, Color color, double enginePower, String modelName, double currentSpeed, double xMultiplier, double yMultiplier, boolean engineIsStarted, double xCoordination, double yCoordination,iPlatformInterface platform) {
        super(nrDoors, color, enginePower, modelName, currentSpeed, xMultiplier, yMultiplier, engineIsStarted, xCoordination, yCoordination);

        this.platform=platform;
    }
    @Override
    protected void incrementSpeed(double amount) {
        if (platform.canMove()) {
            super.incrementSpeed(amount);

        } else {
            super.incrementSpeed(0);
        }
    }
    @Override
    protected double speedFactor() {
        return enginePower * 0.01;
    } //overide i volvo och car.

    public void raisePlatform() {
        if (getCurrentSpeed() == 0) {
            platform.raise();
        }
    }

    public  void lowerPlatform(){
        if(getCurrentSpeed() == 0) {
            platform.lower();
        }
    }
    public boolean canMove(){
        return platform.canMove();
    }
}
