import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Scania extends Cars {

    Platform platta = new Platform(rear.Level.DOWN,30);
    //ArrayList<Cars> arrayList = new ArrayList<>(5);

    public Scania(int nrDoors, Color color, double enginePower, String modelName,double currentSpeed, double xVelocity, double yVelocity) {
        super(2, Color.gray, 90, "Scania Model S",currentSpeed, xVelocity, yVelocity);


    }

    @Override
    protected double speedFactor() {
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

    public void raiseIfStationary() {
        if (getCurrentSpeed() == 0) {
            platta.raise(16);
        } else { platta.raise(0);
        }
    }


    public void lowerIfStationary() {
        if (currentSpeed == 0) {
            platta.lower(40);
        } else { platta.lower(0);
            }
        }
    }

