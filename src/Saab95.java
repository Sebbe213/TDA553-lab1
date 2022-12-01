import java.awt.*;

//import Cars;

public class Saab95 extends Car{

    public boolean turboOn;


    public Saab95(int nrDoors, Color color, double enginePower, String modelName,double currentSpeed, double xVelocity, double yVelocity)
    {super(2, Color.red, 125, "Saab95",10,xVelocity,yVelocity);
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
    protected double speedFactor() {
        if (getCurrentSpeed() > 0 || getCurrentSpeed() < enginePower) {
            double turbo = 1;
            if (turboOn) turbo = 1.3;
            return enginePower * 0.01 * turbo;

        }
        return -1;
    }
}
//speed is strong