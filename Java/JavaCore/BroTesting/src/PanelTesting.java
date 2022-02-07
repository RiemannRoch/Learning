import javax.swing.*;
import java.awt.*;

public class PanelTesting {
    public static void main(String[] args) {

        ImageIcon icon =new ImageIcon("totem.jpeg");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        //label.setVerticalAlignment(JLabel.BOTTOM);
        //label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0,0,450,450);


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,500,500);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(500,0,500,500);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,500,1000,500);
        greenPanel.setLayout(null);



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1500,1500);
        frame.setVisible(true);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }
}
