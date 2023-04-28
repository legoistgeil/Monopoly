import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class GUI {
    int width, height;
    public GUI(){
        JFrame frame = new JFrame();
        Image file = null;
        Dimension frameSize = new Dimension (frame.getWidth(),frame.getHeight());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Monopoly");
        frame.pack();
        frame.setSize(2560,1600);

        JLabel label = new JLabel(MonopolyImage());

        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        frame.add(label);

        JButton button = new JButton("Hit me");
        button.setBounds(frame.getSize().width / 2,frame.getSize().height / 2, 100,100);
        panel.add(button);

        frame.setVisible(true);


    }

    private ImageIcon MonopolyImage(){
        try {
            File file = new File("C:\\Users\\plida\\Desktop\\61af122e29f75f25d62199d6_hasbro-diadora-monopoly.jpg");
            BufferedImage bufferedImage = ImageIO.read(file);
            Image newImage = bufferedImage.getScaledInstance(750,750, Image.SCALE_DEFAULT);
            return new ImageIcon(newImage);
        } catch (IOException e){
            throw new Error(e);
        }

    }

    /*private class State extends WindowAdapter
    {
        public void windowStateChanged(WindowEvent e)
        {

            width = bufferedImage.getWidth();
            height = i.getHeight();
            x = i.getX();
            y = i.getY();

            title.setEnabled(false);
            title.setDisabledIcon(newImageIcon);

        }
*/
}
