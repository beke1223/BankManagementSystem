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
//        String uname = "Admin";
//        String pwd = "1234";
        Login al = new Login();
        try {
            JFrame frame = new JFrame();
            JPanel panel = new JPanel();

            JLabel lbImage = new JLabel(new ImageIcon("C:\\Users\\bekal\\Desktop\\FP\\expense_tracker_app\\images\\R.jpg"));
            Color cl = new Color(0, 0, 0);
            lbImage.setBorder(new LineBorder(cl, 1));

            panel.add(lbImage, BorderLayout.CENTER);

            frame.add(panel);

            frame.setSize(new BankSystemAd().getWidth(), new BankSystemAd().getHeight());
            frame.setLocation(new BankSystemAd().getX(), new BankSystemAd().getY());
            frame.setTitle("Mankira Bank");
            frame.setVisible(true);
            Thread.sleep(2000);
            frame.setVisible(false);

            al.setVisible(true);

//            if (al.getUserName() == null && al.getUserName().equals(uname)) {
//                System.out.println(al.getUserName() + "" + al.getPassword());
//                al.setVisible(false);
//                new BankSystemAd().setVisible(true);
//            } else {
//                JOptionPane.showMessageDialog(null, "Please Enter Correct Information", "Login Error", JOptionPane.ERROR);
//            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String args[]) {

        new Splash();

    }

}
