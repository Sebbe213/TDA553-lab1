import java.awt.*;


public class Scania extends Car {

    Platform platta = new Platform(rear.Level.DOWN, 0);

    public Scania(int nrDoors, Color color, double enginePower, String modelName, double currentSpeed, double xVelocity,
            double yVelocity) {
        super(2, Color.gray, 90, "Scania Model S", currentSpeed, xVelocity, yVelocity,false);

    }

    @Override
    protected void incrementSpeed(double amount) {
        if (platta.platform == rear.Level.DOWN) {
            super.incrementSpeed(amount);

        }
    }
    @Override
    protected double speedFactor() {
        return enginePower * 0.1;
    }

    public void raisePlatform(double amount) {
        if (this.getCurrentSpeed() == 0) {
            platta.raise(amount); 
        } else {
            platta.raise(0);
        }
    }

    public void lowerPlatform(double amount) {
        if (this.getCurrentSpeed() == 0) {
            platta.lower(amount); 
        } else {
            platta.lower(0);
        }
    }
}

// hej hej hej
