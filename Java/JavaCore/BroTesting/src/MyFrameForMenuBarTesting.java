import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrameForMenuBarTesting extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;


    MyFrameForMenuBarTesting(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadIcon = new ImageIcon("bear.png");
        saveIcon = new ImageIcon("mush.png");
        exitIcon = new ImageIcon("bread.png");

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_F); // alt + f for file
        editMenu.setMnemonic(KeyEvent.VK_E); // alt + e for edit
        helpMenu.setMnemonic(KeyEvent.VK_H); // alt + h for help

        loadItem.setMnemonic(KeyEvent.VK_L); //l for load
        saveItem.setMnemonic(KeyEvent.VK_S); //s for save
        exitItem.setMnemonic(KeyEvent.VK_E); //e for exit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loadItem){
            System.out.println("*beep boop* You loaded a file");
        }
        else if(e.getSource()==saveItem){
            System.out.println("*beep boop* You saved a file");
        }
        else if (e.getSource()==exitItem){
            System.out.println("Good bye!");
            System.exit(0);
        }
    }
}
