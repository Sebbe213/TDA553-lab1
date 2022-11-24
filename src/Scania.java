import java.awt.*;

public class Scania extends Cars {

    public Scania(int nrDoors, Color color, double enginePower, String modelName, double xVelocity, double yVelocity)
    {super(2, Color.green, 95, "Scania",xVelocity,yVelocity);

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

    protected void Platform(){

    }
    
    protected void Raise(){
        // max angel of raise 70 degrees (abstract?)

    }

    protected void Lower(){
        //min angel 0 degrees (abstract?) implement delegation

    }
}
