
public class Platform implements iPlatformInterface, rear {
    protected double angel;
    rear.Level platform;



    protected Platform(rear.Level platform, double angel) {
        this.platform = platform;
        this.angel = angel;
    }

    public void lower(double amount) {
        if (angel == 0) {
            angel -= 0;
            platform = Level.DOWN;
        }
        if (angel > 0 && angel < 70) {
            if (angel - amount < 0) {
                angel = 0;
            } else {
                angel -= amount;
            }
        }
    }

    public void raise(double amount) {
        if (angel == 70) {
            angel += 0;
            platform = Level.UP;
        }
        if (angel < 70 && angel > 0) {
            if (angel + amount > 70) {
                angel = 70;
            } else {
                angel += amount;
            }
        }
    }

    protected double getAngle() {
        return angel;
    }
}