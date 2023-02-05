/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JWindow;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;

/**
 *
 * @author bekal
 */
public class Login extends JFrame implements ActionListener {

    String adminUNames = "Admin";
    String adminPwds = "1234";
    
    String customerUNames = "Customer";
    String customerPwds = "12345";

    BankSystemAd bs = new BankSystemAd();

    JPanel panel1 = new JPanel();

    JLabel label = new JLabel("Login");
    JLabel accountType = new JLabel("Choose Account Type");

    JComboBox<String> menu = new JComboBox<>();

     
 

    JLabel unamel = new JLabel("User Name :");
    JLabel pwdl = new JLabel("Password :");

    JTextField uname = new JTextField();
    JPasswordField pwd = new JPasswordField();

    JButton login = new JButton("Login");

    /**
     * @return the userName
     */
    public Login() {

        menu.addItem("Admin");
        menu.addItem("Customer");
        
        label.setBounds(250, 20, 200, 100);
        label.setFont(new Font("Times New Roman", 50, 50));

        accountType.setBounds(180, 150, 150, 30);
        menu.setBounds(320, 150, 100, 30);

        unamel.setBounds(180, 200, 100, 50);
        uname.setBounds(260, 210, 160, 30);
        pwdl.setBounds(180, 250, 100, 50);
        pwd.setBounds(260, 260, 160, 30);
        login.setBounds(230, 320, 190, 50);

        login.addActionListener(this);
        menu.addActionListener(this);

        setLayout(null);
        setResizable(false);

        
        add(label);
        
        add(accountType);
        add(menu);
         
        add(unamel);
        add(uname);
        add(pwdl);
        add(pwd);
        add(login);

        setTitle("Mankira Bank");
//        setSize(500, 500);
        setSize(new BankSystemAd().getWidth(), new BankSystemAd().getHeight());
        setLocation(new BankSystemAd().getX(), new BankSystemAd().getY());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        System.out.println(menu.getSelectedItem().toString());
      if(ae.getActionCommand()=="Login"){
        if (!uname.getText().isEmpty() && !pwd.getText().isEmpty()) {
            switch(menu.getSelectedItem().toString()){
          case "Admin":
             if( Authenticate(uname.getText(), pwd.getText(), adminUNames, adminPwds)) new BankSystemAd().setVisible(true);
      break;
          case "Customer":
                if(Authenticate(uname.getText(), pwd.getText(), customerUNames, customerPwds)) new BankSystemCustomer().setVisible(true);
          break;
    }
        
        } else {
            JOptionPane.showMessageDialog(null, "Please Enter Required Information", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
      }
}
    
    public boolean Authenticate(String inUName, String inUPwd, String uName, String uPassword) {

        boolean authenticated = false;

        if (inUName.equals(uName) && inUPwd.equals(uPassword)) {
            this.setVisible(false);
           

            authenticated = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Incorrect Input", "Input Error", JOptionPane.ERROR_MESSAGE);
        }

        return authenticated;
    }
}
