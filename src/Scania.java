import java.awt.*;

public class Scania extends Cars {

    Platform platta;

    public Scania(int nrDoors, Color color, double enginePower, String modelName, double xVelocity, double yVelocity) {
        super(2, Color.gray, 90, "Scania Model S", xVelocity, yVelocity);

    }

    @Override
    protected double speedFactor(double amount) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    protected void incrementSpeed(double amount) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void decrementSpeed(double amount) {
        // TODO Auto-generated method stub


    }

    protected void PlatformOrRamp() {

    }

    public void raise() {
        if (currentSpeed == 0) {
            platta.raise(0);
        }
    }


    public void lower() {
        if (currentSpeed == 0) {
            platta.lower(0);
        }
    }
}
