public class Player {
    int money;
    int[] houses;
    int pos;
    int num_trains;
    int num_utilities;

    public Player(int moneye, int[] housese, int pose, int num_trainse, int num_utilitiese){
        money = moneye;
        houses = housese;
        pos = pose;
        num_trains = num_trainse;
        num_utilities = num_utilitiese;

    }

    void makeMove(int ran){
        move(ran);
    }
    void move(int num){
        pos = pos+num;
        if(Street.street[pos].available){
            if(Street.street[pos].cost <= money){
                buy();
            }
        }
    }

    void buy(){

    }



}
