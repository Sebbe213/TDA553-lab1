import java.awt.*;

public abstract class Car implements Movable {

    protected int nrDoors;
    protected Color color;
    protected double enginePower;
    protected String modelName;
    private double currentSpeed;
    protected double xVelocity;
    protected double yVelocity;
    private double xCoordination;
    protected double yCoordination;
    protected boolean engineIsStarted;


    protected Car(int nrDoors, Color color, double enginePower, String modelName, double currentSpeed, double xVelocity,
            double yVelocity, boolean engineIsStarted, double xCoordination, double yCoordination) {
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.currentSpeed = currentSpeed;
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
        this.engineIsStarted = false;
        this.xCoordination = xCoordination;
        this.yCoordination = yCoordination;
    }

    public void turnRight() {
        if (yVelocity == 0) {
            if (xVelocity > 0) {
                xVelocity = 0;
                yVelocity = 1 * currentSpeed;
            } else if (xVelocity < 0) {
                xVelocity = 0;
                yVelocity = -1 * currentSpeed;
            }
        } else if (xVelocity == 0) {
            if (yVelocity < 0) {
                xVelocity = 1 * currentSpeed;
                yVelocity = 0;
            } else if (yVelocity > 0) {
                xVelocity = -1 * currentSpeed;
                yVelocity = 0;
            }
        }
    }

    public void turnLeft() {
        if (yVelocity == 0) {
            if (xVelocity > 0) {
                xVelocity = 0;
                yVelocity = -1 * currentSpeed;
            } else if (xVelocity < 0) {
                xVelocity = 0;
                xVelocity = 1 * currentSpeed;
            }
        } else if (xVelocity == 0) {
            if (yVelocity < 0) {
                xVelocity = -1 * currentSpeed;
                yVelocity = 0;
            } else if (yVelocity > 0) {
                xVelocity = 1 * currentSpeed;
                yVelocity = 0;
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
        xCoordination += Math.abs(xVelocity);
    }

    protected double getxCoordination() {
        return xCoordination;
    }

    protected void updateyCoordination() {
        yCoordination += Math.abs(yVelocity);
    }

    protected double getyCoordination() {
        return yCoordination;
    }

    // ______________________________________________________//
    protected double getxVelocity() {
        return xVelocity;
    }

    protected double getyVelocity() {
        return yVelocity;
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
        //xVelocity = currentSpeed;
    }

    protected double speedFactor() {
/*
        if (getCurrentSpeed() == enginePower) {
            return 0;
        } /*else if (getCurrentSpeed() == 0) {
            return 0;
        }
        else if (getCurrentSpeed() < 0) {
            return 0;
        } else if (getCurrentSpeed()> 0 && getCurrentSpeed() < enginePower) {
           return enginePower * 0.1;
        }
        */

        return 1; // if -1 increments with negative
    }

    protected void incrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
        if (currentSpeed > enginePower) {
            currentSpeed = enginePower;
        }

        xVelocity = currentSpeed; // this must change, current speed must be sat to that direction the car is moving in
    }

    protected void decrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;

        // checking if the current speed is going above the engine power.
        // Obs! if this if_statement is deleted the currentSpeed might and in most cases will go above enginePower even a little before the next iteration
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
        xVelocity = currentSpeed;
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

