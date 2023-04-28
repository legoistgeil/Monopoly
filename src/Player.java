public class Player {
    int money;
    int pos;
    int num_trains;
    int num_utilities;

    public Player(int moneye, int pose, int num_trainse, int num_utilitiese) {
        money = moneye;
        pos = pose;
        num_trains = num_trainse;
        num_utilities = num_utilitiese;

    }
    void makeMove(int ran, int i, Street[] street){

        move(ran, i, street);
    }
    void move(int ran, int i, Street[] Street){
        this.pos = this.pos+ran;
            if(Street[pos].available){
                if(Street[pos].cost <= money){
                    buy(Street);
                } else {
                    //versteigern
                }
            } else if(Street[pos].owner != null && Street[pos].owner == this) {
                Street[pos].payrent(i);
        }

    }

    void buy(Street[] Street){
        Street[pos].owner = this;
        this.money = money - Street[pos].cost;
    }

    void printProperties(){
        System.out.println(money + " " + pos + " ");
    }

}

