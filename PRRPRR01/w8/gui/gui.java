
import java.awt.event.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

public class gui {


    public static void main(String[] args) {


        JFrame f = new JFrame("The Number Game by Offlinus");
        JTextArea text = new JTextArea("Tjo");

        JButton b = new JButton("Exit");
        b.setBounds(170, 100, 95, 30);
        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("so it doesnt exit yet hehe");
            }
        });

        JButton c = new JButton("Play");
        c.setBounds(70, 100, 95, 30);
        c.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                doPlay("play.wav");

            }
        });


        f.add(b);f.add(c);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }


    public static void doPlay(String url) {
        Clip clip;

        try {
            AudioInputStream inputStream = AudioSystem
                    .getAudioInputStream(gui.class.getResourceAsStream(url));
            clip = AudioSystem.getClip();
            clip.open(inputStream);
            clip.start();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}