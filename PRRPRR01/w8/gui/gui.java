package gui;

import java.awt.event.*;
import javax.swing.*;

public class gui {
    public static void main(String[] args) {

        JFrame f = new JFrame("The Number Game by Offlinus");
        JTextArea text = new JTextArea("Tjo");

        JButton b = new JButton("tjo");
        b.setBounds(170, 100, 95, 30);
        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("tjo");
            }
        });

        JButton c = new JButton("idk");
        c.setBounds(70, 100, 95, 30);
        c.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("idk");
            }
        });

        f.add(b);f.add(c);f.add(text);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}