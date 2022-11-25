
public class Platform implements iPlatformInterface, Ramp_level {
    protected double angel;
    Ramp_level.Level platform;


    protected Platform(Ramp_level.Level platform, double angel) {
        this.platform = platform;
        this.angel = angel;
    }

    public void lower(double amount) {
        if (angel == 0) {
            angel -= 0;
        }
        if (angel > 0 && angel < 70) {
            if (angel - amount < 0) {
                angel = 0;
            } else {
                platform = Level.DOWN;
                angel -= amount;
            }
        }
    }

    public void raise(double amount) {
        if (angel == 70) {
            angel += 0;
        }
        if (angel < 70 && angel > 0) {
            if (angel + amount > 70) {
                angel = 70;
            } else {
                platform = Level.UP;
                angel += amount;
            }
        }
        /*public void getRaise() {


        }*/
    }
}
// what is new