public class  Ramp implements Ramp_level {
    Level ramp;
    boolean rampen;

    protected Ramp(boolean rampen) {
        this.rampen = true;
    }
    protected void setRampUp() {
        if (rampen) {
            ramp = Level.UP;
        }
    }
    protected void setRampDown() {
        if (!rampen) {
            ramp = Level.DOWN;
        }
    }
    protected void getRampTrue() {
        setRampUp();
    }
    protected void getRampFalse() {
        setRampDown();
    }


}
