public class PropertyCell extends Street {
    final String name;
    final int cost;
    int rent;
    Player owner;
    final String colour;

    public PropertyCell(String name, int cost, int rent, Player owner, String colour) {
        this.name = name;
        this.cost = cost;
        this.rent = rent;
        this.owner = owner;
        this.colour = colour;
    }

    void payrent(int i){
        GUI.playerstats.append("Du kannst des nd kaufen, musst " + rent + " Miete zahlen\n");
        Main.players.get(i).money = Main.players.get(i).money - this.rent;
        owner.money = owner.money + rent;
    }
}
