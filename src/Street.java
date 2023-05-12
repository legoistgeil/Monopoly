public class Street{
    public String name;
    boolean available;
    int cost;
    int rent;
    Player owner;
    boolean buyable;
    //int num_houses;

    public Street(String name, boolean available, int cost, int rent, Player owner, boolean buyable) {
        this.name = name;
        this.available = available;
        this.cost = cost;
        this.rent = rent;
        this.owner = owner;
        this.buyable = buyable;
    }

    void payrent(int i){
        Main.players.get(i).money = Main.players.get(i).money - this.rent;
        owner.money = owner.money + this.rent;
    }

}
