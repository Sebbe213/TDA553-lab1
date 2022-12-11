import java.awt.*;
import java.util.ArrayList;

public class MVCDemo {
    // The timer is started with an listener (see below) that executes the statements
    // each step between delays.
    static ArrayList<Car> cars;

    private static Car volvo;
    private static Car saab;

    public static void main(String[] args) {
        volvo = new Volvo240(4, Color.black, 100, "Volvo240", 0, 2, 0,0,0);
        saab = new Saab95(3, Color.white, 99, "Saab95", 0, 3, 0,0,0);
        // Instance of this class
        cars = new ArrayList<>();
        cars.add(volvo);
        cars.add(saab);

        CarController cc = new CarController(cars);
        cc.startTimer();
    }

}


