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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
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
public class AdminLogin extends JFrame implements ActionListener {

     String unames = "Admin";
        String pwds = "1234";
        
    private String userName;
    private String password;

    BankSystem bs = new BankSystem();

    JPanel panel1 = new JPanel();

    JLabel label = new JLabel("Admin Login");

    JLabel unamel = new JLabel("User Name :");
    JLabel pwdl = new JLabel("Password :");

    JTextField uname = new JTextField();
    JPasswordField pwd = new JPasswordField();

    JButton login = new JButton("Login");

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public AdminLogin() {

        label.setBounds(250, 20, 200, 100);
        label.setFont(new Font("Times New Roman", 50, 30));
        unamel.setBounds(180, 150, 100, 50);
        uname.setBounds(260, 160, 160, 30);
        pwdl.setBounds(180, 200, 100, 50);
        pwd.setBounds(260, 210, 160, 30);
        login.setBounds(230, 270, 190, 50);

        login.addActionListener(this);

        setLayout(null);
        setResizable(false);
        add(label);
        add(unamel);
        add(uname);
        add(pwdl);
        add(pwd);
        add(login);

        setTitle("Mankira Bank");
//        setSize(500, 500);
        setSize(new BankSystem().getWidth(),new BankSystem().getHeight());
        setLocation(new BankSystem().getX(),new BankSystem().getY());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
 
               if(!uname.getText().isEmpty() && !pwd.getText().isEmpty()){
                if(uname.getText().equals(unames) && pwd.getText().equals(pwds)){
                    this.setVisible(false);
                    new BankSystem().setVisible(true);
                }
               }
                else{
                    JOptionPane.showMessageDialog(null, "Please Enter Required Information","Input Error",JOptionPane.ERROR_MESSAGE);
                }
    }

}
