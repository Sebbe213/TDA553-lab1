
public class Platform implements iPlatformInterface, Ramp_level {
    protected  double angel;
    Ramp_level.Level platform;
    
    

    protected Platform(Ramp_level.Level platform) {
        this.platform = platform;
        this.angel = angel;
    }
    public void lower(){
        if(angel >= 0 && angel < 70){
        platform=Level.DOWN;
        }
       }
      public void raise() {
    if(angel<= 70 && angel > 0 ){
            platform = Level.UP;
      }
}
      public void getRaise(){


}
}
