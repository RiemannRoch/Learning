import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home implements ActionListener {

    JLabel presentationLabel, chooseLabel;
    JRadioButton easyButton, mediumButton, hardButton;
    JButton playButton = new JButton("JOGAR");
    // int level = 0;
    ButtonGroup group;
    JFrame frame = new JFrame();
    Home(){
        ImageIcon brain = new ImageIcon("brain.jpg");
        Border border = BorderFactory.createLineBorder(Color.black,3);

        presentationLabel = new JLabel("Bem vindo ao jogo da memória!");
        presentationLabel.setFont(new Font("MV Boli", Font.PLAIN,25));
        presentationLabel.setIcon(brain);
        presentationLabel.setHorizontalTextPosition(JLabel.CENTER);
        presentationLabel.setVerticalTextPosition(JLabel.TOP);
        presentationLabel.setBounds(0,0,500,500);
        presentationLabel.setHorizontalAlignment(JLabel.CENTER);
        presentationLabel.setBorder(border);

        chooseLabel = new JLabel("Escolha a dificuldade:");
        chooseLabel.setFont( new Font("MV Boli",Font.PLAIN,20));
        chooseLabel.setVerticalAlignment(JLabel.TOP);
        chooseLabel.setHorizontalAlignment(JLabel.CENTER);
        chooseLabel.setBounds(0,500,500,200);
        chooseLabel.setBorder(border);

        easyButton = new JRadioButton("Fácil");
        mediumButton = new JRadioButton("Médio");
        hardButton = new JRadioButton("Difícil");

        easyButton.setBounds(120,550,80,30);
        mediumButton.setBounds(210,550,80,30);
        hardButton.setBounds(300,550,80,30);

        group = new ButtonGroup();
        group.add(easyButton);
        group.add(mediumButton);
        group.add(hardButton);

        playButton.setBounds(200,600,100,50);
        playButton.addActionListener(this);

        frame.setTitle("Jogo da Memória");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(brain.getImage());
        frame.setLayout(null);
        frame.setSize(new Dimension(516,739));

        frame.add(presentationLabel);
        frame.add(chooseLabel);
        frame.add(easyButton);
        frame.add(mediumButton);
        frame.add(hardButton);
        frame.add(playButton);

        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==playButton){
            frame.dispose();
            new Game(4);
        }
    }
}
