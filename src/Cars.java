import java.awt.*;

public abstract class Cars implements Movable {

    protected int nrDoors;
    protected Color color;
    protected double enginePower;
    protected String modelName;
    private double currentSpeed;
    protected double xVelocity;
    protected double yVelocity;

    protected double xCoordination;

    protected double yCoordination;



    protected Cars(int nrDoors, Color color, double enginePower, String modelName, double currentSpeed, double xVelocity, double yVelocity){
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.currentSpeed = currentSpeed;
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
    }

    public void turnRight(){
        if (yVelocity == 0) {
            if (xVelocity > 0) {
                xVelocity = 0;
                yVelocity = 1 * currentSpeed;
            }
            else if (xVelocity < 0) {
                xVelocity = 0;
                yVelocity = -1 * currentSpeed;
            }
        }
        else if (xVelocity == 0){
            if (yVelocity < 0){
                xVelocity = 1 * currentSpeed;
                yVelocity = 0;
            }
            else if (yVelocity > 0){
                xVelocity = -1 * currentSpeed;
                yVelocity = 0;
            }

        }

    }



    public void turnLeft(){
        if (yVelocity == 0){
            if(xVelocity>0) {
                xVelocity = 0;
                yVelocity = -1 * currentSpeed;
            }
            else if (xVelocity<0){
                xVelocity = 0;
                xVelocity = 1 * currentSpeed;
            }}
        else if (xVelocity == 0){
            if (yVelocity < 0){
                xVelocity = -1 *currentSpeed;
                yVelocity = 0;
            }
            else if (yVelocity > 0){
                xVelocity = 1 * currentSpeed;
                yVelocity = 0;
            }
        }
    }


    public void move(){
        xVelocity = currentSpeed;
        yVelocity = 0;
    }


    protected void setxCoordination() {
        xCoordination += xVelocity;
    }

    protected double getxCoordination() {
        return xCoordination;
    }

    protected void setyCoordination() {
        yCoordination += yVelocity;
    }

    protected double getyCoordination() {
        return yCoordination;
    }
    //______________________________________________________//
    protected double getxVelocity() {
        return xVelocity;
    }
    protected double getyVelocity() {
        return yVelocity;
    }
//______________________________________________________//

    protected int getNrDoors(){
        return nrDoors;
    }
    protected double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    protected Color getColor(){
        return color;
    }

    protected void setColor(Color clr){
        color = clr;
    }

    protected void startEngine(){
        currentSpeed = 0.1;
    }

    protected void stopEngine(){
        currentSpeed = 0;
    }

    protected double speedFactor() {
        if (getCurrentSpeed() == enginePower) {
            return 0;
        }
        else if (getCurrentSpeed() == 0) {
            return 0;
        }
        else if (getCurrentSpeed() < 0) {
            return 0;
        }
        return -1;
    }


    protected void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    protected void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }

    protected void gas(double amount) {
        if (0 <= amount || amount <= 1) {
            incrementSpeed(amount);
        }
    }
    protected void brake(double amount) {
        if (0 <= amount || amount <= 1) {
            decrementSpeed(amount);
        }
    }
}

// comment to test the commit