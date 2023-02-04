package banksystem;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Splash extends JWindow {

    private Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

    public Splash() {

        try {
            JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            JPanel panel1 = new JPanel();
            JLabel lbImage = new JLabel(new ImageIcon("C:\\Users\\bekal\\Desktop\\FP\\expense_tracker_app\\images\\R.jpg"));
            Color cl = new Color(0, 0, 0);
            lbImage.setBorder(new LineBorder(cl, 1));

            JLabel label = new JLabel("Admin Login");
            JTextArea uname = new JTextArea();
            JTextArea pwd = new JTextArea();
            JButton login = new JButton("Login");

            panel1.add(label);
            panel1.add(uname);
            panel1.add(pwd);
            panel1.add(login);

            panel.add(lbImage, BorderLayout.CENTER);

            frame.add(panel);

            frame.setSize(new BankSystem().getWidth(), new BankSystem().getHeight());
            frame.setLocation(new BankSystem().getX(), new BankSystem().getY());
            frame.setTitle("Mankira Bank");
            frame.setVisible(true);
            Thread.sleep(2000);
            frame.setVisible(false);

            new BankSystem().setVisible(true);
        } catch (InterruptedException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String args[]) {

        new Splash();

    }

}
