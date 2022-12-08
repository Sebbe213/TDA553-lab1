import java.awt.*;

public class TransportCar extends Car {

    private int loadingCapacity;

    private SuperTool superTool;

    private Ramp transportCarramp = new Ramp();

    protected TransportCar(int nrDoors, Color color, double enginePower, String modelName, double currentSpeed,
            double xVelocity, double yVelocity,double xCoordination, double yCoordination, int loadingCapacity) {
        super(2, Color.WHITE, 90, "teslaTransportModelS", currentSpeed, xVelocity, yVelocity,false,xCoordination, yCoordination);
        this.loadingCapacity = loadingCapacity;
       this.superTool = new SuperTool(getxCoordination(),getyCoordination(),loadingCapacity);
    }

    public int getNumberOfLoadedCars() {
        return superTool.getNumberOfLoadedCars();
    }

    @Override
    protected double speedFactor() {
        return 0;
    }

    @Override
    protected void incrementSpeed(double amount) {

    }

    @Override
    protected void decrementSpeed(double amount) {
    }
    @Override
    public void move() {

    }
    protected void loadOn(Car car) {
        if (transportCarramp.ramp == rear.Level.DOWN) {
            try {
                superTool.loadOn(car);
            } catch (Exception e) {
                System.out.println("The car can not be loaded, check car position, capacity or ramp level.");
            }
        }
    }

    protected void loadOff() {
        if (this.getCurrentSpeed() == 0 && transportCarramp.ramp == rear.Level.DOWN) {
            try {
                superTool.loadOff();

            } catch (Exception e) {

                System.out.println("There are no cars to load off");
            }
        }
    }

    protected void lowerRamp() {
        if (this.getCurrentSpeed() == 0) {
            transportCarramp.setRampDown();
        }
    }

    protected void raiseRamp() {
        if (this.getCurrentSpeed() == 0) {
            transportCarramp.setRampUp();
        }
    }
}

