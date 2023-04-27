import java.util.Random;

public class Main {
    static Random rand = new Random();
    static int ran = rand.nextInt(10) + 2;
    static Player[] player = new Player[4];
    static Board board;
    static Street Street;
    public static void main(String[] args) {
        new GUI();
        board = new Board();
        player[0] = new Player(2500, 0, 0, 0);
        player[1] = new Player(2500, 0, 0, 0);
        player[2] = new Player(2500, 0, 0, 0);
        player[3] = new Player(2500, 0, 0, 0);
        makeMove();    }

    static void makeMove(){
        for(int i=0; i<4; i++){
            player[i].makeMove(ran, i, Board.street);
            player[i].printProperties();
            ran = rand.nextInt(10)+2;
        }
    }
}