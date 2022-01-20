import javax.swing.*;

public class OptionPaneTesting {
    public static void main(String[] args) {
//
//        JOptionPane.showMessageDialog(null, "This is some useless info",
//        "title", JOptionPane.PLAIN_MESSAGE);
//
//        JOptionPane.showMessageDialog(null, "This is some useless info",
//                "title", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "This is some useless info",
//               "title", JOptionPane.QUESTION_MESSAGE);
//
//        JOptionPane.showMessageDialog(null, "This is some useless info",
//                "title", JOptionPane.WARNING_MESSAGE);
//
//        JOptionPane.showMessageDialog(null, "This is some useless info",
//               "title", JOptionPane.ERROR_MESSAGE);

        // JOptionPane.showConfirmDialog(null, "Bro, do you even code?",
        //        "this is my title",JOptionPane.YES_NO_CANCEL_OPTION);
        //This returns 0 if yes, 1 if no, 2 if 'cancel', -1 if close window

        //JOptionPane.showInputDialog("What is your name? ");
        //This returns the input value in a String
        String[] responses = {"No, you're awesome", "Thank you!", "*blush*"};
        ImageIcon icon = new ImageIcon("shaman_icon.png");

        JOptionPane.showOptionDialog(null,
                "You are awesome!",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                responses,
                0);
    }
}
