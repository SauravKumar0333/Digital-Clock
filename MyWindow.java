import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyWindow extends JFrame {
    private JLabel heading;
    private JLabel clockLabel;
    private JLabel developerLabel;
    private Font font = new Font("Arial", Font.BOLD, 35);

    MyWindow() {
        super.setTitle("My Clock");
        super.setSize(800, 500);
        super.setLocation(400, 100);
        this.createGUI();
        this.startClock();
        super.setVisible(true);
    }

    public void createGUI() {
        // Set the background color
        this.getContentPane().setBackground(new Color(85, 22, 56));

        heading = new JLabel("My Clock");
        clockLabel = new JLabel("Clock");
        developerLabel = new JLabel("Developed by Saurav Kumar");

        // Set the font color to white
        heading.setForeground(Color.WHITE);
        clockLabel.setForeground(Color.WHITE);
        developerLabel.setForeground(Color.WHITE);

        heading.setFont(font);
        clockLabel.setFont(font);
        developerLabel.setFont(new Font("Arial", Font.PLAIN, 20));

        // Center the heading, clock label, and developer label
        heading.setHorizontalAlignment(JLabel.CENTER);
        clockLabel.setHorizontalAlignment(JLabel.CENTER);
        developerLabel.setHorizontalAlignment(JLabel.CENTER);

        this.setLayout(new GridLayout(3, 1));
        this.add(heading);
        this.add(clockLabel);
        this.add(developerLabel);
    }

    public void startClock() {
        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
                String dateTime = sdf.format(d);
                clockLabel.setText(dateTime);
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        MyWindow w = new MyWindow(); // Added a semicolon here
    }
}
