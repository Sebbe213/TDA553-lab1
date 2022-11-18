import java.awt.*;

//import Cars;

public class Saab95 extends Cars{

    public boolean turboOn;

    public Saab95(int nrDoors, Color color, double enginePower, String modelName, double currentSpeed, double yVelocity, double xVelocity, double xCoordination, double yCoordination)
    {super(2, Color.red, 125, "Saab95", 0.1, yVelocity, xVelocity, xCoordination,yCoordination);
    
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
    
    // TODO fix this method according to lab pm
   
  
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }

}
