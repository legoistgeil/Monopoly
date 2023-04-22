public class Player {
    int money;
    int pos;
    int num_trains;
    int num_utilities;

    public Player(int moneye, int pose, int num_trainse, int num_utilitiese){
        money = moneye;
        pos = pose;
        num_trains = num_trainse;
        num_utilities = num_utilitiese;

    }

    void makeMove(int ran, int i){
        move(ran, i);
    }
    void move(int ran, int i){
        pos = pos+ran;
        if(Street.street[pos].available){
            if(Street.street[pos].cost <= money){
                buy(i);
            }
        }
    }

    void buy(int i){
        Street.street[pos].player = i;
    }



}
