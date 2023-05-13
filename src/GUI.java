import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
public class GUI {
    static JFrame frame = new JFrame();
    JLabel pic = new JLabel(MonopolyImage());
    static JLabel player1 = new JLabel(player1pic());
    static JPanel panel = new JPanel();
    static JButton move = new JButton(ArrowImage());
    static JButton sell = new JButton(dollarImage());
    static JLabel playerln = new JLabel();
    static JLabel posln = new JLabel();
    static JLabel test = new JLabel();

    public GUI(){

        /*
            JPanel size: 1690x1025 JPixel hell idk
            MonopolyPic size: 750x750 JPixel xd
        */

        Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Monopoly");
        frame.pack();
        frame.setSize(screenSize.width,screenSize.height);

        player1.setBounds(520, 875, 50, 50);
        frame.add(player1);

        pic.setBounds(470,1025,750,750);
        frame.add(pic);

        panel.setSize(2560,1600);
        panel.setLayout(null);
        frame.add(panel);

        move.setBounds(10,500,100,90);
        panel.add(move);
        sell.setBounds(10,600,100,90 );
        panel.add(sell);

        playerln.setBounds(500,10,300,90); //Textzeile für welcher spieler dran ist
        playerln.setVisible(true);
        panel.add(playerln);

        posln.setBounds(500, 30, 300,90); //Textzeile für Positionsanzeige für spieler
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

    public static ImageIcon player1pic (){
        try {
            BufferedImage bufferedImage = ImageIO.read(new FileInputStream("src/res/Player1.png"));
            Image newImage = bufferedImage.getScaledInstance(50,50, Image.SCALE_DEFAULT);
            return new ImageIcon(newImage);
        } catch (IOException e){
            throw new Error(e);
        }
    }

}
