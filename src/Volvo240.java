import java.awt.*;

//import Cars;

public class Volvo240 extends Cars{

    private final static double trimFactor = 1.25;
    
    
    public Volvo240(int nrDoors, Color color, double enginePower, String modelName, double yVelocity, double xVelocity,double xCoordination,double yCoordination) {
        super(4, Color.black, 100, "Volvo240",yVelocity,xVelocity);

        stopEngine();
        startEngine();
    }
    

    @Override
    protected double speedFactor(double amount) {
        return enginePower * 0.01 * trimFactor;
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
