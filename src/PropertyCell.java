import javax.swing.*;
import java.util.ArrayList;
import java.util.Hashtable;

public class PropertyCell extends Street {
    final String name;
    final int cost;
    int rent;
    Player owner;
    final String color;

    public PropertyCell(String name, int cost, int rent, Player owner, String color) {
        this.name = name;
        this.cost = cost;
        this.rent = rent;
        this.owner = owner;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getRent() {
        return rent;
    }

    public Player getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    void makeAction(int i) {
        if (owner == null) {
            if (cost <= Main.players.get(i).money) {
                int decision = JOptionPane.showConfirmDialog(GUI.frame, "Willst du's kaufen? Kosten:" + cost, "Grundstueck kaufen", JOptionPane.YES_NO_OPTION);
                if (decision == 0) {
                    buy(Board.street,Main.players.get(i).pos,i);
                }
            }
        } else {
            payrent(i);
        }
    }
    void payrent(int i){
        GUI.playerstats.append("Du kannst des nd kaufen, musst " + rent + " Miete zahlen\n");
        Main.players.get(i).money -= this.rent;
        owner.money += rent;
    }
    void buy (Street[]street,int pos,int i){
        owner = Main.players.get(i);
        Main.players.get(i).money -= street[pos].getCost();
    }

    void colorTest(int j){

    }
}
