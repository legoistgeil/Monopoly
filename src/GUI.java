import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
public class GUI {
    static JFrame frame = new JFrame();
    JLabel pic = new JLabel(MonopolyImage());
    static JLabel player1 = new JLabel(player1pic());
    static JLabel player2 = new JLabel(player2pic());
    static JLabel player3 = new JLabel(player3pic());
    static JLabel player4 = new JLabel(player4pic());
    static JPanel panel = new JPanel();
    static JButton move = new JButton(ArrowImage());
    static JButton sell = new JButton(dollarImage());
    static JLabel line1 = new JLabel();
    static JLabel line2 = new JLabel();
    static JLabel line3 = new JLabel();
    static JLabel line4 = new JLabel();

    public GUI(){

        /*
            JPanel size: 1690x1025 JPixel hell idk
            MonopolyPic size: 750x750 JPixel xd
        */

        Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Monopoly");
        frame.pack();
        frame.setSize(2600,1650);

        player1.setBounds(500, 810, 50, 50);
        frame.add(player1);

        player2.setBounds(490, 810, 50, 50);
        frame.add(player2);

        player3.setBounds(480, 810, 50, 50);
        frame.add(player3);

        player4.setBounds(470, 810, 50, 50);
        frame.add(player4);

        pic.setBounds(470,138,750,750);// Monopoly spielfeld
        frame.add(pic);

        panel.setSize(2560,1600);
        panel.setLayout(null);
        panel.setBackground(new java.awt.Color(255,231,129));
        frame.add(panel);

        move.setBounds(10,500,100,90);
        panel.add(move);
        sell.setBounds(10,600,100,90 );
        panel.add(sell);

        Font font18 = font().deriveFont(18f); //Font auf Schriftgröße 18 machen

        line1.setBounds(845,15,400,20);  // erste Zeile
        line1.setVisible(true);
        line1.setFont(font18);
        panel.add(line1);

        line2.setBounds(845, 40, 500,20);    // zweite Zeile, hier:
        line2.setVisible(true);                                 // Textzeile für Geld vor Zug
        line2.setFont(font18);
        panel.add(line2);

        line3.setBounds(845,65,500,20); // dritte Zeile, hier:
        line3.setVisible(true);                            // Textzeile für Zug
        line3.setFont(font18);
        panel.add(line3);

        line4.setBounds(845,90,500,20); // vierte Zeile, hier:
        line4.setVisible(true);                            // Textzeile für Geld nach Zug
        line4.setFont(font18);
        panel.add(line4);

        frame.setVisible(true);

    }

    private ImageIcon MonopolyImage(){
        try {
            BufferedImage bufferedImage = ImageIO.read(new FileInputStream("src/res/monopoly.png"));
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
    private static Font font(){
        Font tffBase;
        try {
            InputStream is = new FileInputStream("src/res/kabel.ttf");
            tffBase = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (FontFormatException | IOException e) {
            throw new RuntimeException(e);
        }
        return tffBase;
    }


    public static void start(boolean i){
        JLabel start = new JLabel("Das Spiel beginnt! Druecke die Pfeiltaste");
        Font font24 = font().deriveFont(24f);
        start.setFont(font24);
        start.setBounds(10,10,1000,35);
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

    public static ImageIcon player2pic (){
        try {
            BufferedImage bufferedImage = ImageIO.read(new FileInputStream("src/res/Player2.png"));
            Image newImage = bufferedImage.getScaledInstance(50,50, Image.SCALE_DEFAULT);
            return new ImageIcon(newImage);
        } catch (IOException e){
            throw new Error(e);
        }
    }

    public static ImageIcon player3pic (){
        try {
            BufferedImage bufferedImage = ImageIO.read(new FileInputStream("src/res/Player3.png"));
            Image newImage = bufferedImage.getScaledInstance(50,50, Image.SCALE_DEFAULT);
            return new ImageIcon(newImage);
        } catch (IOException e){
            throw new Error(e);
        }
    }

    public static ImageIcon player4pic (){
        try {
            BufferedImage bufferedImage = ImageIO.read(new FileInputStream("src/res/PLayer4.png"));
            Image newImage = bufferedImage.getScaledInstance(50,50, Image.SCALE_DEFAULT);
            return new ImageIcon(newImage);
        } catch (IOException e){
            throw new Error(e);
        }
    }
}
