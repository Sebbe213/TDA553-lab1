import java.awt.*;

//import Cars;

public class Volvo240 extends Cars{

    private final static double trimFactor = 1.25;
    
    
    public Volvo240(int nrDoors, Color color, double enginePower, String modelName, double xVelocity, double yVelocity) {
        super(4, Color.black, 100, "Volvo240",xVelocity,yVelocity);
        //stopEngine();
        //startEngine();
    }
    

    @Override
    protected double speedFactor(double amount) {
        if (currentSpeed == enginePower) {
            return 0;
        }
        else if (currentSpeed > 0 || currentSpeed < enginePower) {
            return enginePower * 0.01 * trimFactor;
        }

        else if (currentSpeed == 0) {
                return 0;
        }
            else if (currentSpeed < 0) {
                currentSpeed = 0;
                return 0;
            }
            return -1;
        }

    @Override
    public void incrementSpeed(double amount){
	    currentSpeed = Math.min(getCurrentSpeed() + speedFactor(amount) * amount,enginePower);
    }

    @Override
    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor(amount) * amount,0);
    }
}

// comment to test the commit
