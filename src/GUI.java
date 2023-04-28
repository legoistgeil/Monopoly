import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class GUI {

    public GUI(){
        JFrame frame = new JFrame();
        Dimension frameSize = new Dimension (frame.getWidth(),frame.getHeight());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Monopoly");
        frame.pack();
        frame.setSize(2560,1600);

        JLabel label = new JLabel(MOnopolyImage());

        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        JButton button = new JButton("Hit me");
        button.setBounds(frame.getSize().width / 2,frame.getSize().height / 2, 100,100);
        panel.add(button);

        frame.setVisible(true);

        frame.getBaselineResizeBehavior();

    }

    private ImageIcon MOnopolyImage(){
        try {
            File file = new File("C:\\Users\\plida\\Desktop\\images.png\\");
            BufferedImage bufferedImage = ImageIO.read(file);
        } catch (IOException e){
            e.printStackTrace();
        }
        return new ImageIcon(file);
    }

}
