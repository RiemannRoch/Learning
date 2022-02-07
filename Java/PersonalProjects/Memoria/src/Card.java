import javax.swing.*;

public class Card extends JCheckBox {
    private int imageIndex;


    Card(int imageIndex){
        this.imageIndex = imageIndex;
    }

    public int getImageIndex() {
        return imageIndex;
    }

    public void setImageIndex(int imageIndex) {
        this.imageIndex = imageIndex;
    }

}
