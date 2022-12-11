import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * This class represents the full view of the MVC pattern of your car simulator.
 * It initializes with being center on the screen and attaching it's controller in it's state.
 * It communicates with the Controller by calling methods of it when an action fires of in
 * each of it's components.
 * TODO: Write more actionListeners and wire the rest of the buttons
 **/

public class CarView extends JFrame{
    private static final int X = 1300;
    private static final int Y = 600;

    DrawPanel drawPanel = new DrawPanel(X, Y-240); //view

    JPanel controlPanel = new JPanel();

    //__________________________________//
    JPanel gasPanel = new JPanel(); //Controller
    JSpinner gasSpinner = new JSpinner(); //Controller
    int gasAmount = 0;
    JLabel gasLabel = new JLabel("Amount of gas"); //CarView all the labels

    JButton gasButton = new JButton("Gas"); //CarView

    //________________________________________//

    JPanel brakePanel = new JPanel();
    JSpinner brakeSpinner = new JSpinner();
    int brakeAmount = 0;
    JLabel brakeLabel = new JLabel("Amount of brake");
    JButton brakeButton = new JButton("Brake");

    //_________________________________________//
    JButton turboOnButton = new JButton("Saab Turbo on"); //All of these buttons car view
    JButton turboOffButton = new JButton("Saab Turbo off");
    JButton liftBedButton = new JButton("Scania Lift Bed");
    JButton lowerBedButton = new JButton("Lower Lift Bed");

    JButton startButton = new JButton("Start all cars");
    JButton stopButton = new JButton("Stop all cars");



    // Constructor
    public CarView(String frameName){

        initComponents(frameName);
    }

    // Sets everything in place and fits everything
    // TODO: Take a good look and make sure you understand how these methods and components work
    private void initComponents(String title) {

        this.setTitle(title); //These three are car view
        this.setPreferredSize(new Dimension(X,Y));
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        this.add(drawPanel);

        SpinnerModel gasSpinnerModel =
                new SpinnerNumberModel(0, //initial value
                        0, //min               // The spinners should be in  controller
                        100, //max
                        1);//step
        gasSpinner = new JSpinner(gasSpinnerModel);

        SpinnerModel brakeSpinnerModel =
                new SpinnerNumberModel(0, //initial value
                        0, //min
                        100, //max
                        1);//step
        brakeSpinner = new JSpinner(brakeSpinnerModel);



        brakeSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                brakeAmount = (int) ((JSpinner)e.getSource()).getValue();
            }
        });


        gasSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                gasAmount = (int) ((JSpinner)e.getSource()).getValue();
            }
        });



        gasPanel.setLayout(new BorderLayout()); //These are view
        gasPanel.add(gasLabel, BorderLayout.PAGE_START);
        gasPanel.add(gasSpinner, BorderLayout.PAGE_END);

        this.add(gasPanel);

        brakePanel.setLayout(new BorderLayout());
        brakePanel.add(brakeLabel, BorderLayout.PAGE_START);
        brakePanel.add(brakeSpinner, BorderLayout.PAGE_END);

        this.add(brakePanel);



        controlPanel.setLayout(new GridLayout(4,4));

        controlPanel.add(gasButton, 0);
        //controlPanel.add(brakeButton,0);
        controlPanel.add(turboOnButton, 1);
        controlPanel.add(liftBedButton, 2);
        controlPanel.add(brakeButton, 3);
        controlPanel.add(turboOffButton, 4);
        controlPanel.add(lowerBedButton, 5);
        controlPanel.setPreferredSize(new Dimension((X/1)+4, 100));
        this.add(controlPanel);
        controlPanel.setBackground(Color.BLACK);


        startButton.setBackground(Color.blue);
        startButton.setForeground(Color.green);
        startButton.setPreferredSize(new Dimension(X/5-15,200));
        controlPanel.add(startButton);


        stopButton.setBackground(Color.red);
        stopButton.setForeground(Color.black);
        stopButton.setPreferredSize(new Dimension(X/5-15,200));
        controlPanel.add(stopButton);


        //The last ones should be car view
        // Make the frame pack all it's components by respecting the sizes if possible.
        this.pack();

        // Get the computer screen resolution
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        // Center the frame
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);// this makes calculations so model
        // Make the frame visible
        this.setVisible(true);
        // Make sure the frame exits when "x" is pressed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    protected Integer getGasAmount(){
        return gasAmount;
    }

    protected Integer setGasAmount(){
        return gasAmount;
    }

    protected Integer getBrakeAmount(){
        return brakeAmount;
    }

    protected Integer setBrakeAmount(){
        return gasAmount;
    }

    protected Integer getBrakeValue(){
        return (Integer) gasSpinner.getValue();
    }


    protected void initButtons(ActionListener startActionListener, ActionListener gasActionListener, ActionListener brakeActionListener, ActionListener stopActionListener)    {
        this.startButton.addActionListener(startActionListener);
        this.gasButton.addActionListener(gasActionListener);
        this.brakeButton.addActionListener(brakeActionListener);
        this.stopButton.addActionListener(stopActionListener);

    }
    //commit test
}
