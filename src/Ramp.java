public class Ramp implements rear {
    Level ramp;
    boolean rampen;

    protected Ramp(boolean rampen) {
        this.rampen = true;
    }
    protected void setRampUp() {
            ramp = Level.UP;

    }
    protected void setRampDown() {
            ramp = Level.DOWN;
    }
    protected void getRampTrue() {
        setRampUp();
    }
    protected void getRampFalse() {
        setRampDown();
    }


}
