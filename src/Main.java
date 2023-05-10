import java.util.Random;
public class Main {
    static Random rand = new Random();
    static int ran1 = rand.nextInt(5)+1;
    static int ran2 = rand.nextInt(5)+1;
    static int ran = ran1 + ran2;
    static Player[] player = new Player[4];
    static Board board;
    public static void main(String[] args) {
        new GUI();
        board = new Board();
        player[0] = new Player(1501, 0, 0, 0);
        player[1] = new Player(1502, 0, 0, 0);
        player[2] = new Player(1503, 0, 0, 0);
        player[3] = new Player(1504, 0, 0, 0);
        Main.makeMove();
    }
    static void makeMove(){
        GUI.start(true);
        int j = 0;
        int movecounter = 0;
        for(int i=0; i<4; i++) {
            if (player[i].money >= 0) {
                final int test = j;
                GUI.move.addActionListener(e -> {
                    System.out.println("Spieler " + (test + 1) + " ist an der Reihe.");
                    player[test].makeMove(ran, test, Board.street);
                    ran1 = rand.nextInt(5) + 1;
                    ran2 = rand.nextInt(5) + 1;
                    ran = ran1 + ran2;
                });
                if (i < 3) {
                    i++;
                } else {
                    i = 0;
                }
                if (movecounter < 4) {
                    movecounter++;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
    }
}
