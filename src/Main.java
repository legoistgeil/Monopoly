import java.util.Random;
import java.util.ArrayList;
public class Main {
    static Random rand = new Random();
    static ArrayList<Player> players = new ArrayList<>();
    static Board board;
    static Kartenstapel kartenstapel;
    static int move = -1;
    static int playerturn;
    static int random;
    static GUI gui = new GUI();
    public static void main(String[] args) {
        board = new Board();
        kartenstapel = new Kartenstapel();
        players.add(new Player(1500, 0, 0, 0,0));
        players.add(new Player(1500, 0, 0, 0,0));
        players.add(new Player(1500, 0, 0, 0,0));
        players.add(new Player(1500, 0, 0, 0,0));
        Main.makeMove();
    }
      static void makeMove(){
        gui.start();
        gui.move.addActionListener(e -> act(turn()));
    }
    private static void act(int finalI) {
        int ran1 = rand.nextInt(5) + 1;
        int ran2 = rand.nextInt(5) + 1;
        int ran = ran1 + ran2;
        playerturn = finalI;
        GUI.playerstats.setText(null);
        GUI.playerstats.append("Spieler " + (finalI + 1) + " ist an der Reihe.\n");
        players.get(finalI).makeMove(ran, finalI, Board.street);
        random = ran;
    }
    private static int turn(){
        if(move < players.size()-1){
            move++;
        } else {
            move = 0;
        }
        return move;
    }

}