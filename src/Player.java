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
        //System.out.println("Der Spieler " + i + "");
    }

    void move(int ran, int i, Street[] Street) {
        System.out.println("Du hast eine " + ran + " gewuerfelt!");
        System.out.println("Die Stats davor:");
        printProperties();
        this.pos = this.pos + ran;
        if (this.pos > 39){
            this.pos = this.pos - 40;
        }
        switch (Street[pos].name) {
            case "Ereignisfeld":
                //Ereigniskarte ziehen
                break;
            case "Gemeinschaftsfeld":
                //Gemeinschaftskarte ziehen
                break;
            case "Frei Parken":
                //Steuergelder einkassieren
                break;
            case "Einkommenssteuer":
                money = money - 200;
                break;
            case "Zusatzsteuer":
                money = money - 100;
                break;

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
        System.out.println("Die Stats danach:");
        printProperties();
        System.out.println("");
    }
    public void printProperties() {
        System.out.println(money + " " + pos + " ");
    }
    void buy (Street[] Street){
        Street[pos].owner = this;
        this.money = money - Street[pos].cost;
    }
}

