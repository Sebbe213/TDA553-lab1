public class Ramp implements iPlatformInterface {

    Level ramp;

    public Ramp(){
        ramp =Level.UP;
    }

    @Override
    public void lower() {
        ramp = Level.DOWN;
    }

    @Override
    public void raise() {
        ramp = Level.UP;

    }

    @Override
    public boolean canMove() {
        return ramp == Level.UP;
    }
}
