public class Street{
    String name;
    boolean available;
    int cost;
    int rent;
    Player owner;
    //int num_houses;

    public Street(String name, boolean availablee, int coste, int rente, Player ownere){
        available = availablee;
        cost = coste;
        rent = rente;
        owner = ownere;
    }

    void payrent(int i){
        Main.player[i].money = Main.player[i].money - this.rent;
        owner.money = owner.money + this.rent;
    }
    
}
