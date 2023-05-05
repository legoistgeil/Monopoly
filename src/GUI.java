import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
public class GUI {
    static JFrame frame = new JFrame();
    JLabel pic = new JLabel(MonopolyImage());
    static JPanel panel = new JPanel();
    static JButton move = new JButton(ArrowImage());
    JButton sell = new JButton(dollarImage());
    public GUI(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Monopoly");
        frame.pack();
        frame.setSize(2560,1600);

        pic.setBounds(500,200,750,750);
        frame.add(pic);

        panel.setLayout(null);
        frame.add(panel);

        move.setBounds(10,500,100,90);
        panel.add(move);
        sell.setBounds(10,600,100,90 );
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
    private static ImageIcon ArrowImage(){
        try {
            BufferedImage bufferedImage = ImageIO.read(new File("C:\\Users\\plida\\Desktop\\arrow-sign.png"));
            Image newImage = bufferedImage.getScaledInstance(100,90, Image.SCALE_DEFAULT);
            return new ImageIcon(newImage);
        } catch (IOException e){
            throw new Error(e);
        }
    }
    private ImageIcon dollarImage(){
        try {
            BufferedImage bufferedImage = ImageIO.read(new File("C:\\Users\\plida\\Desktop\\Download.png"));
            Image newImage = bufferedImage.getScaledInstance(100,90, Image.SCALE_DEFAULT);
            return new ImageIcon(newImage);
        } catch (IOException e){
            throw new Error(e);
        }
    }
    public static void start(){
        JLabel start = new JLabel("Das Spiel beginnt! Druecke eine beliebige Taste  !");
        start.setBounds(10,10,1000,100);
        panel.add(start);
    }
}
