import java.awt.*;

public class TransportCar extends Truck {

    private int loadingCapacity;

    private SuperTool superTool;

    private Ramp transportCarramp = new Ramp();

    protected TransportCar(int nrDoors, Color color, double enginePower, String modelName, double currentSpeed,
            double xVelocity, double yVelocity,double xCoordination, double yCoordination, int loadingCapacity) {
        super(2, Color.WHITE, 90, "teslaTransportModelS", currentSpeed, xVelocity, yVelocity,false,xCoordination, yCoordination, new Ramp());
        this.loadingCapacity = loadingCapacity;
       this.superTool = new SuperTool(getxCoordination(),getyCoordination(),loadingCapacity);
    }

    public int getNumberOfLoadedCars() {
        return superTool.getNumberOfLoadedCars();
    }

    @Override
    protected double speedFactor() {   // Due to the lack of speed boost such as trim factor/ turbo this method is overriden to increment the speed of transport car objects differently
        return enginePower * 0.01;

    }

    protected void loadOn(Car car) {
        if (this.getCurrentSpeed() == 0 && !canMove()) {
            try {
                superTool.loadOn(car);
            } catch (Exception e) {
                System.out.println("The car can not be loaded, check car position, capacity or ramp level.");
            }
        }
    }

    protected void loadOff() {
        if (this.getCurrentSpeed() == 0 && !canMove()) {
            try {
                superTool.loadOff();

            } catch (Exception e) {

                System.out.println("There are no cars to load off");
            }
        }
    }



}


