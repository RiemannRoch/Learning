import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameForFrameTesting extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    MyFrameForFrameTesting(){

        ImageIcon icon = new ImageIcon("shaman_small_icon.png");
        ImageIcon icon2 = new ImageIcon("ice-shield-icon.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(200,250,150,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100,100,250,100);
        button.addActionListener(this);
        button.setText("Im a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("JetBrains Mono",Font.BOLD,25));
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setTitle("JFrame title goes here"); //sets the title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        // this.setResizable(false); //prevent frame from being resized
        this.setLayout(null);
        this.setSize(500,500); //sets the x and y dimensions
        this.setVisible(true); //makes the frame visible
        this.add(button);
        this.add(label);

        ImageIcon image = new ImageIcon("horde.jpg"); //create an ImageIcon
        this.setIconImage(image.getImage()); //change icon of frame
        //this.getContentPane().setBackground(new Color(0x99230A)); //change color of background
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            // System.out.println("poo");
            //button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
