
public class Platform implements iPlatformInterface, rear {
    protected double angle;
    rear.Level platform;



    protected Platform(rear.Level platform, double angel) {
        this.platform = platform;
        this.angle = angel;
    }

    public void lower(double amount) {
        if (angle == 0) {
            angle -= 0;
            platform = Level.DOWN;
        }
        else if (angle > 0 && angle < 70) {
            if (angle - amount < 0) {
                angle = 0;
            } else { angle -= amount;}
        } else {
                angle -= amount;
            }
        }

    public void raise(double amount) {
        if (angle == 70) {
            angle += 0;
            platform = Level.UP;
        }
        else if (angle < 70 && angle > 0) {
            if (angle + amount > 70) {
                angle = 70;
            } else { angle += amount;}
        }
        else {angle += amount;
            }
        }

    protected double getAngle() {
        return angle;
    }
}