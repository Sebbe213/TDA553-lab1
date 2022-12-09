import java.awt.*;

public abstract class Car implements Movable {

    protected int nrDoors;
    protected Color color;
    protected double enginePower;
    protected String modelName;
    private double currentSpeed;
    protected double xMultiplier;
    protected double yMultiplier;
    private double xCoordination;
    protected double yCoordination;
    protected boolean engineIsStarted;


    protected Car(int nrDoors, Color color, double enginePower, String modelName, double currentSpeed, double xMultiplier,
            double yMultiplier, boolean engineIsStarted, double xCoordination, double yCoordination) {
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.currentSpeed = currentSpeed;
        this.xMultiplier = xMultiplier;
        this.yMultiplier = yMultiplier;
        this.engineIsStarted = false;
        this.xCoordination = xCoordination;
        this.yCoordination = yCoordination;
    }

    public void turnRight() {
        if (yMultiplier == 0) {
            if (xMultiplier > 0) {
                xMultiplier = 0;
                yMultiplier = 1;
            } else if (xMultiplier < 0) {
                xMultiplier = 0;
                yMultiplier = -1;
            }
        } else if (xMultiplier == 0) {
            if (yMultiplier < 0) {
                xMultiplier = 1;
                yMultiplier = 0;
            } else if (yMultiplier > 0) {
                xMultiplier = -1;
                yMultiplier = 0;
            }
        }
    }

    public void turnLeft() {
        if (yMultiplier == 0) {
            if (xMultiplier > 0) {
                xMultiplier = 0;
                yMultiplier = -1;
            } else if (xMultiplier < 0) {
                xMultiplier = 0;
                xMultiplier = 1;
            }
        } else if (xMultiplier == 0) {
            if (yMultiplier < 0) {
                xMultiplier = -1;
                yMultiplier = 0;
            } else if (yMultiplier > 0) {
                xMultiplier = 1;
                yMultiplier = 0;
            }
        }
    }

    public void move() {
            updatexCoordination();
            updateyCoordination();
    }

    public void setX(double x) {
        this.xCoordination = x;
    }

    public void setY(double y) {
        this.yCoordination = y;
    }

    protected void updatexCoordination() {
        xCoordination += xMultiplier * currentSpeed;
    }

    protected double getxCoordination() {
        return xCoordination;
    }

    protected void updateyCoordination() {
        yCoordination += yMultiplier *  currentSpeed;
    }

    protected double getyCoordination() {
        return yCoordination;
    }

    // ______________________________________________________//
    protected double getxMultiplier() {
        return xMultiplier;
    }

    protected double getyMultiplier() {
        return yMultiplier;
    }
    // ______________________________________________________//

    public int getNrDoors() {
        return nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    protected void startEngine() {
        engineIsStarted = true;
        currentSpeed = 0;
    }
    protected void stopEngine() {

        engineIsStarted = false;
        currentSpeed = 0;
    }

    protected double speedFactor() {
        return 1;
    }

    protected void incrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;

        if (currentSpeed > enginePower) {
            currentSpeed = enginePower;
        }
    }

    protected void decrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;

        // checking if the current speed is going above the engine power.
        // Obs! if this if_statement is deleted the currentSpeed might and in most cases will go above enginePower even a little before the next iteration
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
    }

    protected void gas(double amount) {
        if (0 <= amount && amount <= 1 && engineIsStarted) {
            incrementSpeed(amount);
        }
    }

    protected void brake(double amount) {
        if (0 <= amount && amount <= 1 && engineIsStarted) {
            decrementSpeed(amount);
        }
    }
}