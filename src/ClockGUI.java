import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClockGUI {

    //JLabel Initialization
    private static final JLabel timeLabel = new JLabel();
    private static final JLabel dayLabel = new JLabel();
    private static final JLabel dateLabel = new JLabel();

    //JButton Initialization
    private static final JButton timerButton = new JButton("Timer");
    private static final JButton stopwatchButton = new JButton("Stopwatch");

    public void setGUI() {

        //JFrame Initialization and Specifications
        JFrame jFrame = new JFrame("Digital Clock Ver. Alpha");
        jFrame.setLayout(new GridLayout());
        jFrame.setBounds(10, 10, 800, 400);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(false);

        //JPanel Initialization and Specifications
        JPanel jPanel = new JPanel();
        jPanel.setBounds(10, 10, 800, 400);
        jPanel.setBackground(Color.BLACK);
        jPanel.setLayout(null);
        jPanel.setVisible(true);


        //Time Label Specifications
        timeLabel.setBounds(50,50, 700,140);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 120));
        timeLabel.setBackground(Color.WHITE);
        timeLabel.setOpaque(true);

        //Day Label Specifications
        dayLabel.setBounds(50,200, 300,100);
        dayLabel.setFont(new Font("Arial", Font.BOLD, 50));
        dayLabel.setForeground(Color.WHITE);
        dayLabel.setOpaque(false);

        //Date Label Specifications
        dateLabel.setBounds(450,200, 300,100);
        dateLabel.setFont(new Font("Arial", Font.BOLD, 50));
        dateLabel.setForeground(Color.WHITE);
        dateLabel.setOpaque(false);

        //Timer Button Specifications
        timerButton.setBounds(50,300,150,50);
        timerButton.setFont(new Font("Arial", Font.BOLD, 20));

        //Timer Button Event Handler
        timerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timerButton.setText("SOON");
            }
        });

        //Stopwatch Button Specifications
        stopwatchButton.setBounds(600,300,150,50);
        stopwatchButton.setFont(new Font("Arial", Font.BOLD, 20));

        //Timer Button Event Handler
        stopwatchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopwatchButton.setText("SOON");
            }
        });


        //ADDING ELEMENTS TO PANEL AND FRAME
        jPanel.add(timeLabel);
        jPanel.add(dayLabel);
        jPanel.add(dateLabel);
        jPanel.add(timerButton);
        jPanel.add(stopwatchButton);
        jFrame.add(jPanel);
        jFrame.setVisible(true);

    }

    //SETTERS
    public void setTime(String time) {
        timeLabel.setText(time);
    }

    public void setDay(String day) {
        dayLabel.setText(day);
    }

    public void setDate(String date) {
        dateLabel.setText(date);
    }

}
