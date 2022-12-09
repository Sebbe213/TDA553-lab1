import java.awt.*;



public class Scania extends Truck {

    public Scania(int nrDoors, Color color, double enginePower, String modelName, double currentSpeed, double xVelocity, double yVelocity, double xCoordination, double  yCoordination) {
        super(2, Color.gray, 90, "Scania Model S", currentSpeed, xVelocity, yVelocity,false,xCoordination ,yCoordination,new Platform(5));

    }



}