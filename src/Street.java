public class Street{
    public String name;
    boolean available;
    int cost;
    int rent;
    Player owner;
    boolean buyable;
    //int num_houses;

    public Street(String namee, boolean availablee, int coste, int rente, Player ownere, boolean buyablee){
        name = namee;
        available = availablee;
        cost = coste;
        rent = rente;
        owner = ownere;
        buyable = buyablee;
    }

    void payrent(int i){
        Main.players.get(i).money = Main.players.get(i).money - this.rent;
        owner.money = owner.money + this.rent;
    }
    
}
