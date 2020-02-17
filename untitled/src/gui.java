import javax.swing.*;
import java.awt.*;

public class gui {
    public JButton button1;
    public JTextArea textArea1;
    private JPanel MainPanel;

    public gui(){
        textArea1.setText("funkaa");
        button1.setSize(1, 1);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CloudRemover by Superfroggman");
        //frame.setContentPane(new gui().MainPanel);
        frame.setContentPane(new gui().textArea1);
        frame.setContentPane(new gui().button1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }

}
