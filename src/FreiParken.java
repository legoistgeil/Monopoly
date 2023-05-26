public class FreiParken extends Street{
    String name;

    public FreiParken(String name) {
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

    @Override
    public Object getColor() {
        return null;
    }

    void makeAction(int i) {
        Main.players.get(i).money += Board.Moneypool;
        Board.Moneypool = 0;
    }
}
