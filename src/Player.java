public class Player {
    int money;
    int pos;
    int num_trains;
    int num_utilities;

    public Player(int money, int pos, int num_trains, int num_utilities) {
        this.money = money;
        this.pos = pos;
        this.num_trains = num_trains;
        this.num_utilities = num_utilities;
    }

    void makeMove(int ran, int i, Street[] street) {
        move(ran, i, street);
    }

    void move(int ran, int i, Street[] street) {
        System.out.println("Du hast eine " + ran + " gewuerfelt!");
        System.out.println("Die Stats davor:");
        printProperties();
        this.pos = this.pos + ran;
        if (this.pos > 39){
            this.pos = this.pos - 40;
            System.out.println("Spieler ist über Los gegangen und hat 200 erhalten");
            money = money + 200;
        }
        switch (street[pos].name) {
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
                if (street[pos].available) {
                    if (street[pos].cost <= money) {
                        GUI.sell.addActionListener(e -> buy(street, pos));
                    } else {
                        //versteigern
                    }
                } else if (street[pos].owner != null) {
                    street[pos].payrent(i);
                }

        }
        System.out.println("Du stehst auf " + street[pos].name);
        System.out.println("Die Stats danach:");
        printProperties();
        System.out.println();
    }
    public void printProperties() {
        System.out.println(money + " " + pos + " ");
    }
    void buy(Street[] street, int pos){
        street[pos].owner = this;
        this.money = this.money - street[pos].cost;
    }
}

