import javax.swing.*;

public class Werk extends Street{
    String name;
    Player owner;
    int cost;

    public Werk(String name, Player owner, int cost) {
        this.name = name;
        this.owner = owner;
        this.cost = cost;
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

    void payrent(){}

    void makeAction(int i) {
        if (owner == null) {
            if (cost <= Main.players.get(i).money) {
                int decision = JOptionPane.showConfirmDialog(GUI.frame, "Willst du's kaufen? Kosten:" + cost, "Grundstueck kaufen", JOptionPane.YES_NO_OPTION);
                if (decision == 0) buy(Board.street,Main.players.get(i).pos,i);

            }
        } else {
            int utilityrent = Main.random * (Board.street[Main.players.get(i).pos].owner.num_utilities * 4);
            GUI.playerstats.append("Du kannst des nd kaufen, musst " + utilityrent + " Miete zahlen\n");
            Main.players.get(i).money = Main.players.get(i).money - utilityrent;
            Board.street[Main.players.get(i).pos].owner.money += utilityrent;

        }
    }
    void buy(Street[] street,int pos,int i){
        owner = Main.players.get(i);
        owner.num_utilities += 1;
        Main.players.get(i).money -= street[pos].cost;
    }
}
