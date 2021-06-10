package Jtable;

import javax.swing.*;

public class RunTable {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                UnsupportedLookAndFeelException ignored) {
        }
        //set image icon
        ImageIcon imageIcon = new ImageIcon("res/logo.png");
        JFrame jFrame = new JFrame("Form Sorting");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new contohJtable().getPanel1());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(390, 300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
