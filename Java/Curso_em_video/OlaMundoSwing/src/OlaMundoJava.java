import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaMundoJava extends JFrame{
    private JButton btnClick;
    private JLabel lblMensagem;
    private JPanel mainPanel;

    public OlaMundoJava(){
        setContentPane(mainPanel);
        setTitle("Olá, Mundo!");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMensagem.setText("Olá, Mundo!");
            }
        });
    }

    public static void main(String[] args) {
        OlaMundoJava panel = new OlaMundoJava();
    }
}
