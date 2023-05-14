public class Street{
    public String name;
    boolean available;
    int cost;
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

    void payrent(int i){
        Main.players.get(i).money = Main.players.get(i).money - this.rent;
        owner.money = owner.money + this.rent;
    }

}
