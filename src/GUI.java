import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class GUI {
    boolean test = false;
    public GUI(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Monopoly");
        frame.pack();
        frame.setSize(2560,1600);

        JLabel pic = new JLabel(MonopolyImage());
        frame.add(pic);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        JButton sell = new JButton(ArrowImage());
        sell.setBounds(10,500,100,90);
        panel.add(sell);

        frame.setVisible(true);
    }

    private ImageIcon MonopolyImage(){
        try {
            BufferedImage bufferedImage = ImageIO.read(new File("C:\\Users\\plida\\Desktop\\61af122e29f75f25d62199d6_hasbro-diadora-monopoly.jpg"));
            Image newImage = bufferedImage.getScaledInstance(750,750, Image.SCALE_DEFAULT);
            return new ImageIcon(newImage);
        } catch (IOException e){
            throw new Error(e);
        }

    }

    private ImageIcon ArrowImage(){
        try {
            BufferedImage bufferedImage = ImageIO.read(new File("C:\\Users\\plida\\Desktop\\arrow-sign.png"));
            Image newImage = bufferedImage.getScaledInstance(100,90, Image.SCALE_DEFAULT);
            return new ImageIcon(newImage);
        } catch (IOException e){
            throw new Error(e);
        }

    }
}
