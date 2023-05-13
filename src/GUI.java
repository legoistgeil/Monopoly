import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
public class GUI {
    static JFrame frame = new JFrame();
    JLabel pic = new JLabel(MonopolyImage());
    static JPanel panel = new JPanel();
    static JButton move = new JButton(ArrowImage());
    static JButton sell = new JButton(dollarImage());
    static JLabel playerln = new JLabel();

    static JLabel posln = new JLabel();

    public GUI(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Monopoly");
        frame.pack();
        frame.setSize(2560,1600);

        //Monopoly pic position
        pic.setBounds(500,200,750,750);
        frame.add(pic);

        panel.setLayout(null);
        frame.add(panel);

        //Buttons move and sell
        move.setBounds(10,500,100,90);
        panel.add(move);
        sell.setBounds(10,600,100,90 );
        panel.add(sell);

        //Player stats line
        playerln.setBounds(500,10,300,90);
        playerln.setVisible(true);
        panel.add(playerln);

        //Pos line
        posln.setBounds(500, 30, 300,90);
        posln.setVisible(true);
        panel.add(posln);

        frame.setVisible(true);

    }

    private ImageIcon MonopolyImage(){
        try {
            BufferedImage bufferedImage = ImageIO.read(new FileInputStream("src/res/monopoly-map.jpg"));
            Image newImage = bufferedImage.getScaledInstance(750,750, Image.SCALE_DEFAULT);
            return new ImageIcon(newImage);
        } catch (IOException e){
            throw new Error(e);
        }
    }
    private static ImageIcon ArrowImage(){
        try {
            BufferedImage bufferedImage = ImageIO.read(new FileInputStream("src/res/arrow-sign.png"));
            Image newImage = bufferedImage.getScaledInstance(100,90, Image.SCALE_DEFAULT);
            return new ImageIcon(newImage);
        } catch (IOException e){
            throw new Error(e);
        }
    }
    private static ImageIcon dollarImage(){
        try {
            BufferedImage bufferedImage = ImageIO.read(new FileInputStream("src/res/Download.png"));
            Image newImage = bufferedImage.getScaledInstance(100,90, Image.SCALE_DEFAULT);
            return new ImageIcon(newImage);
        } catch (IOException e){
            throw new Error(e);
        }
    }
    public static void start(boolean i){
        JLabel start = new JLabel("Das Spiel beginnt! Druecke die Pfeiltaste");
        start.setBounds(10,10,1000,100);
        start.setVisible(i);
        panel.add(start);
    }

}
