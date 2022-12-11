import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;

/*
 * This class represents the Controller part in the MVC pattern.
 * It's responsibilities is to listen to the View and responds in a appropriate manner by
 * modifying the model state and the updating the view.
 */
public class CarController  {
    private CarView frame;
    private final int delay = 50;
    private ArrayList<Car> cars;
    private Timer timer = new Timer(delay, new TimerListener());

    CarController( ArrayList<Car> cars){
        this.cars = cars;
        this.frame = new CarView("CarSim 1.0");
        frame.initButtons(startActionListener, gasActionListener, brakeActionListener, stopActionListener);
    }

    // Calls the gas method for each car once
    void gas(Car car, int amount) {                     //All methods below Controller
        double gas = ((double) amount) / 100;
        //for (Car car: cars)
        car.gas(gas);
    }

    void brake(Car car, int amount) {
        double brake = ((double) amount) / 100;
        car.brake(brake);
    }

    void startEngine(Car car) {
        startEngine(car);
    }

    void stopEngine(Car car) {
        stopEngine(car);
    }

    protected void startTimer() {
        this.timer.start();
    }

    ActionListener startActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            for(int i = 0; i < cars.size(); i++) {
                cars.get(i).isEngineIsStarted();

            }

            for(int i = 0; i < cars.size(); i++) {
                cars.get(i).setEngineIsStarted(true);
            }

            for(int i = 0; i < cars.size(); i++) {
                cars.get(i).isEngineIsStarted();
            }
        }
    };


    ActionListener gasActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            for(int i = 0; i < cars.size(); i++) {
                gas(cars.get(i), frame.getGasAmount());
            }
        }
    };

    ActionListener brakeActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            for(int i = 0; i < cars.size(); i++) {
                brake(cars.get(i), frame.getBrakeAmount());
            }
        }
    };


    ActionListener stopActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            for(int i = 0; i < cars.size(); i++) {
                cars.get(i).isEngineIsStarted();
            }

            for(int i = 0; i < cars.size(); i++) {
                cars.get(i).setEngineIsStarted(false);
            }

            for(int i = 0; i < cars.size(); i++) {
                cars.get(i).isEngineIsStarted();
            }
        }
    };


    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Car car : cars) {

                if (car.isEngineIsStarted()) {
                    car.move();
                    car.brake(frame.getBrakeValue());
                    car.gas(frame.getGasAmount());
                    int x = (int) Math.round(car.getxCoordination());
                    int y = (int) Math.round(car.getyCoordination());
                    car.updatexCoordination();
                    car.updateyCoordination();
                    frame.drawPanel.moveit(x, y);
                    // repaint() calls the paintComponent method of the panel
                    frame.drawPanel.repaint();
                }
            }
        }
    }
//Commit test
}


