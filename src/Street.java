public class Street{
    final public String name;
    boolean available;
    final int cost;
    int rent;
    Player owner;
    //int num_houses;

    public Street(String name, boolean available, int cost, int rent, Player owner) {
        this.name = name;
        this.available = available;
        this.cost = cost;
        this.rent = rent;
        this.owner = owner;
    }

    public int getRent() {
        return rent;
    }

    void payrent(int i){
        GUI.playerstats.append("Du kannst des nd kaufen, musst " + this.getRent() + " Miete zahlen\n");
        Main.players.get(i).money = Main.players.get(i).money - this.getRent();
        owner.money = owner.money + this.getRent();
    }

    public int UtilityRent(){
        if(Board.street[Main.playerturn].owner != null){
            if(Board.street[Main.playerturn].owner.num_utilities == 1){

            }
        }
        return 0;
    }
}
