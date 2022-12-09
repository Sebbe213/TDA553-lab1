
public class Platform implements iPlatformInterface {
    private double angle;


    private double raiseamount;

    protected Platform(double raiseamount) {
        this.angle = 0;
        this.raiseamount = raiseamount;
    }

    public void lower() {
        if (angle > 0 && angle <= 70) {
            if (angle - raiseamount < 0) {
                angle = 0;
            } else {
                angle -= raiseamount;
            }
        }

    }

    public void raise() {
        if (angle < 70 && angle >= 0) {
            if (angle + raiseamount > 70) {
                angle = 70;
            } else {
                angle += raiseamount;
            }

        }
    }

   public boolean canMove(){
        return angle == 0;
   }
}