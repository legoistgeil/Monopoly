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
    static JLabel line1r = new JLabel();
    static JLabel line2r = new JLabel();
    static JLabel line3r = new JLabel();
    static JLabel line4r = new JLabel();
    static JTextArea playerstats = new JTextArea();

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
        panel.setBackground(new java.awt.Color(255, 246, 210));
        frame.add(panel);

        move.setBounds(10,500,100,90);
        panel.add(move);

        Font font18 = font().deriveFont(18f); //Font auf Schriftgröße 18 machen

        playerstats.setBounds(845,15,500,85);
        playerstats.setBackground(new java.awt.Color(255, 246, 210));
        playerstats.setEditable(false);
        playerstats.setVisible(true);
        playerstats.setFont(font18);
        panel.add(playerstats);

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
