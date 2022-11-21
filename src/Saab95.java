import java.awt.*;

//import Cars;

public class Saab95 extends Cars{

    public boolean turboOn;

    public Saab95(int nrDoors, Color color, double enginePower, String modelName, double xVelocity, double yVelocity)
    {super(2, Color.red, 125, "Saab95",xVelocity,yVelocity);
    //stopEngine();
    //startEngine();
    turboOn = true;
    }
    
    
    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }

    @Override
	protected double speedFactor(double amount) {
        if (currentSpeed == enginePower) {
            return 0;
        }
        else if (currentSpeed > 0 || currentSpeed < enginePower) {
            double turbo = 1;
            if (turboOn) turbo = 1.3;
            return enginePower * 0.01 * turbo;
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
        currentSpeed = getCurrentSpeed() + speedFactor(amount) * amount;
    }
    @Override
    public void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor(amount) * amount;
    }
}

// comment to test the commit