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

    public static int tsrent(){
        int rent;
        if(Board.street[Main.playerturn].owner != null) {
            return switch (Board.street[Main.playerturn].owner.num_trains) {
                case 1 -> 25;
                case 2 -> 50;
                case 3 -> 100;
                case 4 -> 200;
                default -> 0;
            };
        } else {
            return 0;
        }
    }
}
