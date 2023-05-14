import java.util.Random;
import java.util.ArrayList;
public class Main {
    static Random rand = new Random();
    static int ran1 = rand.nextInt(5)+1;
    static int ran2 = rand.nextInt(5)+1;
    static int ran = ran1 + ran2;
    static ArrayList<Player> players = new ArrayList<>();
    static Board board;
    static int move = -1;
    public static void main(String[] args) {
        new GUI();
        board = new Board();
        players.add(new Player(1501, 0, 0, 0));
        players.add(new Player(1502, 0, 0, 0));
        players.add(new Player(1503, 0, 0, 0));
        players.add(new Player(1504, 0, 0, 0));
        Main.makeMove();
    }
    static void makeMove(){
        GUI.start(true);
        GUI.move.addActionListener(e -> act(turn()));
    }

    private static void act(int finalI) {
        GUI.line1.setText("Spieler " + (finalI + 1) + " ist an der Reihe.");
        players.get(finalI).makeMove(ran, finalI, Board.street);
        ran1 = rand.nextInt(5) + 1;
        ran2 = rand.nextInt(5) + 1;
        ran = ran1 + ran2;
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