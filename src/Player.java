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

    void makeMove(int ran, int i, Street[] street) {
        move(ran, i, street);
        System.out.println("Der Spieler " + i + "");
    }

    void move(int ran, int i, Street[] Street) {
        this.pos = this.pos + ran;
        switch (Street[pos].name) {
            case "Ereignisfeld":
                //Ereigniskarte ziehen
            case "Gemeinschaftsfeld":
                //Gemeinschaftskarte ziehen
            case "Frei Parken":
                //Steuergelder einkassieren
            case "Einkommenssteuer":
                money = money - 200;
            case "Zusatzsteuer":
                money = money - 100;


            default:
                if (Street[pos].available) {
                    if (Street[pos].cost <= money) {
                        //buy(Street[pos]);
                    } else {
                        //versteigern
                    }
                } else if (Street[pos].owner != null && Street[pos].owner == this) {
                    Street[pos].payrent(i);
                }

        }

        /*void buy (Street[] Street){
            Street[pos].owner = this;
            this.money = money - Street[pos].cost;
        }

        void printProperties () {
            System.out.println(money + " " + pos + " ");
        }

        void setMoney ( int moneye){
            money = moneye;
        }*/
    }
}

