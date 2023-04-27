import javax.swing.*;
import java.awt.*;

public class GUI {

    public GUI() {
        JFrame frame = new JFrame();
        Dimension frameSize = new Dimension (frame.getWidth(),frame.getHeight());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Monopoly");
        frame.pack();
        frame.setSize(1000,1000);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        JButton button = new JButton("Hit me");
        button.setBounds(frame.getSize().width / 2,frame.getSize().height / 2, 100,100);
        panel.add(button);

        frame.setVisible(true);

    }

}
