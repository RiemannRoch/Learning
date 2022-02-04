import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game implements ActionListener {
    JFrame frame;
    boolean midTurn = false;
    Card[] cards;
    int cardPicked1, cardPicked2;

    Game(int size){
        int numberOfCards = size*size;
        int numberOfImages = numberOfCards/2;

        ImageIcon[] images = CollectImages(numberOfImages); // criar um vetor com as imagens que serão usadas
        cards = setCards(images); // criar um vetor de cartas baseado no vetor de imagens
        shuffle(cards);
        setFrame(cards);
    }

    ImageIcon[] CollectImages(int numberOfImages){
        ImageIcon[] images = new ImageIcon[numberOfImages+1];
        images[0] = new ImageIcon("icon0.png"); // A imagem na posição 0 é o ícone 'de trás' da carta
        for (int i = 1; i <= numberOfImages; i++){
            images[i] = new ImageIcon("icon" + i + ".png");
        }
        return images;
    }

    Card[] setCards(ImageIcon[] images){ // Recebe um vetor com n + 1 imagens
        int n = images.length - 1;
        Card[] cards = new Card[2*n]; // Cria um vetor com 2*n cartas
        for (int i = 0; i < 2*n; i++){
            cards[i] = new Card(i % n + 1); // O ícone da carta i é a imagem na posição i+1 se i < n, e a imagem na posição i-n+1, se i >= n
            cards[i].setSelectedIcon(images[i % n + 1]);
            cards[i].setIcon(images[0]);
        }
        return cards;
    }

    void shuffle(Card[] cards){
        for (int i = 0; i < cards.length - 1; i++){
            int k = i + (int)((cards.length-i)*Math.random());
            Card temp = cards[k];
            cards[k] = cards[i];
            cards[i] = temp;
        }
    }

    void setFrame(Card[] cards){
        frame = new JFrame("Jogo da Memória em curso");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        for (Card i : cards){
            frame.add(i);
            i.addActionListener(this);
        }
        frame.pack();
        frame.setVisible(true);
    }

    public void Verify(){
        if (cardPicked1 == cardPicked2){
            cards[cardPicked1].setEnabled(false);
        } else if (cards[cardPicked1].getImageIndex() == cards[cardPicked2].getImageIndex()){
            JOptionPane.showMessageDialog(null,"Parabéns! Você acertou!");
            cards[cardPicked1].setEnabled(false);
            cards[cardPicked2].setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null,"Você errou :(");
            cards[cardPicked1].setSelected(false);
            cards[cardPicked2].setSelected(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (midTurn){
            for (int i = 0; i < cards.length; i++){
                if (e.getSource() == cards[i]){
                    cardPicked2 = i;
                }
            }
            Verify();
            midTurn = false;
        } else {
            for (int i = 0; i < cards.length; i++){
                if (e.getSource() == cards[i]){
                    cardPicked1 = i;
                }
            }
            midTurn = true;
        }
    }
}
