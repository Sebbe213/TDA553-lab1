import java.awt.*;

//import Cars;

public class Saab95 extends Cars{

    public boolean turboOn;

    public Saab95(int nrDoors, Color color, double enginePower, String modelName, double yVelocity, double xVelocity)
    {super(2, Color.red, 125, "Saab95", yVelocity, xVelocity);
    
    stopEngine();
    startEngine();
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
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
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
