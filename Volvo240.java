import java.awt.*;

//import Cars;

public class Volvo240 extends Cars{

    public final static double trimFactor = 1.25;
    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name
    
    private Volvo240(int nrDoors, Color color, double enginePower, String modelName, double currentSpeed) {
        super(nrDoors, color, enginePower, modelName, currentSpeed);

        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "Volvo240";
        stopEngine();
        startEngine();
    }
    

    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
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

    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
}
