import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;

public class GUI {
    static JFrame frame = new JFrame();
    static JLabel player1 = new JLabel(player1pic());
    static JLabel player2 = new JLabel(player2pic());
    static JLabel player3 = new JLabel(player3pic());
    static JLabel player4 = new JLabel(player4pic());
    JPanel panel = new JPanel();
    JButton move = new JButton(ArrowImage());
    static JTextArea playerstats = new JTextArea();
    static JTextArea leftStats = new JTextArea();
    static JTextArea karte = new JTextArea();;
    JLabel monopolyBoard = new JLabel(MonopolyImage());

    public GUI() {

        /*
            JPanel size: 1690x1025 JPixel hell idk
            MonopolyPic size: 750x750 JPixel xd
        */

        Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Monopoly");
        frame.setSize(screenSize.width, screenSize.height);

        player1.setBounds(538, 893, 50, 50);
        frame.add(player1);

        player2.setBounds(526, 893, 50, 50);
        frame.add(player2);

        player3.setBounds(514, 893, 50, 50);
        frame.add(player3);

        player4.setBounds(502, 893, 50, 50);
        frame.add(player4);

        monopolyBoard.setBounds(470, 138, 850, 850);
        frame.add(monopolyBoard);

        panel.setSize(2560, 1600);
        panel.setLayout(null);
        panel.setBackground(new java.awt.Color(255, 246, 210));
        frame.add(panel);

        move.setBounds(10, 500, 100, 90);
        move.setFocusPainted(false);
        move.setBorderPainted(false);
        panel.add(move);

        Font font18 = font().deriveFont(18f); //Font auf Schriftgröße 18 machen

        playerstats.setBounds(845,15,500,85);
        playerstats.setBackground(new java.awt.Color(255, 246, 210));
        playerstats.setEditable(false);
        playerstats.setVisible(true);
        playerstats.setFont(font18);
        panel.add(playerstats);

        leftStats.setBounds(1325,138,355,800);
        leftStats.setBackground(new java.awt.Color(255,246,210));
        leftStats.setEditable(false);
        leftStats.setVisible(true);
        leftStats.setFont(font18);
        panel.add(leftStats);

        karte.setBounds(10,138,450,350);
        karte.setBackground(new java.awt.Color(255,246,210));
        karte.setEditable(false);
        karte.setVisible(true);
        karte.setFont(font18);

        panel.add(karte);

        frame.setVisible(true);

    }

    private Font font() {
        Font tffBase;
        try {
            String path = "res/kabel.ttf";
            InputStream is = GUI.class.getClassLoader().getResourceAsStream(path);
            if (is == null)
                throw new NullPointerException("Font not found: " + path);
            tffBase = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (FontFormatException | IOException e) {
            throw new RuntimeException(e);
        }
        return tffBase;
    }

    void start() {
        JLabel start = new JLabel("Das Spiel beginnt! Druecke die Pfeiltaste");
        Font font24 = font().deriveFont(24f);
        start.setFont(font24);
        start.setBounds(10, 10, 1000, 35);
        start.setVisible(true);
        panel.add(start);
    }

    public static ImageIcon player1pic() {
        return icon("res/Player1.png", 50, 50);
    }

    public static ImageIcon player2pic() {
        return icon("res/Player2.png", 50, 50);
    }

    public static ImageIcon player3pic() {
        return icon("res/Player3.png", 50, 50);
    }

    public static ImageIcon player4pic() {
        return icon("res/Player4.png", 50, 50);
    }

    private ImageIcon MonopolyImage() {
        return icon("res/Monopoly_Map.jpg", 850, 850);
    }

    private ImageIcon ArrowImage() {
        return icon("res/arrow-sign.png", 100, 90);
    }

    public static Image image(String path, int width, int height) {
        try {
            InputStream is = GUI.class.getClassLoader().getResourceAsStream(path);
            if (is == null)
                throw new NullPointerException("Image not found: " + path);
            Image image = ImageIO.read(is);
            image = image.getScaledInstance(width, height, Image.SCALE_DEFAULT);
            return image;
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    public static ImageIcon icon(String path, int width, int height) {
        return icon(image(path, width, height));
    }

    public static ImageIcon icon(Image image) {
        return new ImageIcon(image);
    }
}
