import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LabelTesting {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("shaman_icon.png");

        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel(); // text can be passed as an argument
        label.setText("Bro, do you even code"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of image-icon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP, center, BOTTOm of image-icon
        label.setForeground(new Color(0x99230A)); //set font color of text
        label.setFont(new Font("MV Boli",Font.PLAIN, 40)); //set font of text
        label.setIconTextGap(-25); //set gap of text to image
        label.setBackground(new Color(0xE6CACA)); //set background color
        label.setOpaque(true); //display background color
        label.setBorder(border); //sets border of label (not image+text)
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within the label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within the label
        //label.setBounds(100,20,350,350); //set x,y position within frame as well as dimensions



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); //make sure you use add method before pack

    }
}
