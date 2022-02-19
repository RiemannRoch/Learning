package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage extends JFrame implements ActionListener {
    public JButton newCharButton, enterButton;

    public WelcomePage(){
        newCharButton = new JButton("New character");
        newCharButton.setBounds(400,10,200,50);
        newCharButton.setFocusable(false);
        newCharButton.addActionListener(this);

        enterButton = new JButton("Enter");
        enterButton.setBounds(10,200,200,50);
        enterButton.setFocusable(false);


        this.setTitle("Wow Setup");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(620,360);
        this.setLayout(null);

        this.add(newCharButton);
        this.add(enterButton);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
