import java.util.Random;
import java.util.ArrayList;
public class Main {
    static Random rand = new Random();
    static int ran1 = rand.nextInt(5)+1;
    static int ran2 = rand.nextInt(5)+1;
    static int ran = ran1 + ran2;
    static ArrayList<Player> players = new ArrayList<Player>();
    static Board board;
    static int finalI = 0;
    public static void main(String[] args) {
        new GUI();
        board = new Board();
        players.add(new Player(1501, 0, 0, 0));
        players.add(new Player(1502, 0, 0, 0));
        players.add(new Player(1503, 0, 0, 0));
        players.add(new Player(1504, 0, 0, 0));
        Main.makeMove(finalI);
    }
    static void makeMove(int finalI){
        GUI.start(true);
            GUI.move.addActionListener(e -> act(finalI));
    }

    private static int act(int finalI) {
        for (int i = players.size()-1; i >= 0; i--) {
            System.out.println("Spieler " + (finalI + 1) + " ist an der Reihe.");
            players.get(finalI).makeMove(ran, finalI, Board.street);
            ran1 = rand.nextInt(5) + 1;
            ran2 = rand.nextInt(5) + 1;
            ran = ran1 + ran2;
            if (finalI == players.size()) {
                finalI = 0;
                return finalI;
            }
        }
        return finalI;
    }
}