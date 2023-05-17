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

    void setRent(int rent) {
        this.rent = rent;
    }

    void payrent(int i){
        GUI.line3.setText("Du kannst des nd kaufen, musst " + this.getRent() + " Miete zahlen");
        Main.players.get(i).money = Main.players.get(i).money - this.getRent();
        owner.money = owner.money + this.getRent();
    }

    static void setTsRent(Street street){
        int a = tsrent();
        street.setRent(a);
    }

    static int tsrent(){
        if(Board.street[Main.playerturn].owner != null) {
            return 25 * (2 ^ Board.street[Main.playerturn].owner.num_trains - 1);
        } else {
            return 0;
        }
    }

    public int UtilityRent(){
        if(Board.street[Main.playerturn].owner != null){
            if(Board.street[Main.playerturn].owner.num_utilities == 1){

            }
        }
        return 0;
    }
}
