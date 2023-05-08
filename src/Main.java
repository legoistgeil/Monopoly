import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;
public class Main {
    static Random rand = new Random();
    static Scanner scanner = new Scanner(System.in);
    static int ran1 = rand.nextInt(5)+1;
    static int ran2 = rand.nextInt(5)+1;
    static int ran = ran1 + ran2;
    static Player[] player = new Player[4];
    static Board board;
    static boolean test = false;
    public static void main(String[] args) {
        new GUI();
        board = new Board();
        player[0] = new Player(2501, 0, 0, 0);
        player[1] = new Player(2502, 0, 0, 0);
        player[2] = new Player(2503, 0, 0, 0);
        player[3] = new Player(2504, 0, 0, 0);
        Main.makeMove();
    }

    static void makeMove(){
        System.out.println("Das Spiel beginnt! Drücke eine beliebige Taste !");
        GUI.start(true);
        int i = 0;
        while(gameContinues()) {
            final int test = i;
            GUI.move.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Main.test = true;
                    System.out.println("test passed");
                    player[test].makeMove(ran, test, Board.street);
                    //player[i].printProperties();
                    ran = rand.nextInt(10) + 2;
                    System.out.println("Spieler " + (test + 1) + " ist an der Reihe. Drücke eine beliebige Taste!");


                }
            });
            if (i < 3) {
                i++;
            } else {
                i = 0;
            }
        }
    }




    static boolean gameContinues() {
        for(int i=0; i<4; i++){
            if(player[i].money < 0) {
                return false;
            }
        }
        return true;
    }
}
