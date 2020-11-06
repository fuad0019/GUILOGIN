package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JFrame frame;
    JPanel panel;
    JPanel panel2;
    JLabel userLabel;
    JLabel passwordLabel;
    JTextField userText;
    JPasswordField passwordText;
    JLabel loginLabel;
    JButton button;
    public GUI(){

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.black);
        frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20,80,25);
        panel.add(userLabel);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50,80,25);
        panel.add(passwordLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(130,80,80,25);
        button.addActionListener(this);
        panel.add(button);

        loginLabel = new JLabel("");
        loginLabel.setBounds(100,100,300,25);
        panel.add(loginLabel);


        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String correctUser = userText.getText();
        String correctPassword = String.valueOf(passwordText.getPassword());

        if(correctUser.equals("fuad0019") && correctPassword.equals("fuad0019") ){
            loginLabel.setText("U have successfully logged in");
            panel2 = new JPanel();
            panel2.doLayout();
            panel2.setBackground(Color.green);
            frame.add(panel2);
            button.hide();
            userText.hide();
            passwordText.hide();

            JLabel afterLoginlabel = new JLabel("Welcome");
            afterLoginlabel.setBounds(50,50,80,25);
            panel2.add(afterLoginlabel);


        }
        else loginLabel.setText("Incorrect login");

        System.out.println(userText.getText());
        System.out.println(passwordText.getText());


    }
}
