import javax.swing.*;

public class TrainStation extends Street{
    String name;
    int cost;
    Player owner;

    public TrainStation(String name, int cost, Player owner) {
        this.name = name;
        this.cost = cost;
        this.owner = owner;
    }

    @Override
    public Player getOwner() {
        return owner;
    }

    @Override
    public Object getColor() {
        return null;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return 0;
    }

    void makeAction(int i) {
        if (owner == null) {
            if (cost <= Main.players.get(i).money) {
                int decision = JOptionPane.showConfirmDialog(GUI.frame,"Willst du's kaufen? Kosten:" + cost,"Grundstueck kaufen", JOptionPane.YES_NO_OPTION);
                if (decision == 0) {
                    buy(Board.street,Main.players.get(i).pos,i);
                }
            }
        } else {
            GUI.playerstats.append("Du kannst des nd kaufen, musst " + tsRent() + " Miete zahlen\n");
            Main.players.get(i).money -= tsRent();
            owner.money += tsRent();
        }
    }
    private int tsRent(){
        double tsrent = 25 * Math.pow(2, owner.num_trains - 1);
        return (int) tsrent;
    }
    void buy (Street[]street,int pos,int i){
        owner = Main.players.get(i);
        owner.num_trains += 1;
        Main.players.get(i).money -= street[pos].getCost();
    }
    void payrent(){}
}
