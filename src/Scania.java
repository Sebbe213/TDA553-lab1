import java.awt.*;

public class Scania extends Cars {

    public Scania(int nrDoors, Color color, double enginePower, String modelName, double xVelocity, double yVelocity)
    {super(2, Color.green, 125, "Scania",xVelocity,yVelocity);

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
}
