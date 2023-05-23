public class Steuern extends Street{
    String name;

    public Steuern(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return 0;
    }

    @Override
    public Player getOwner() {
        return null;
    }

    void makeAction(int i) {
        Main.players.get(i).money -= 200;
        Board.Moneypool += 200;
    }
}
