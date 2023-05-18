import javax.swing.*;

public class Player {
    int money;
    int pos;
    int num_trains;
    int num_utilities;
    static int cooldown;// in Klasse Main als cooldown oder so denn benutzen

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
        GUI.playerstats.append("Geld:" + money + "\n");
        this.pos = this.pos + ran;

        passedLOS();//sind jz Methoden damit es aufgeräumter ist
        IconMove(i);

        GUI.playerstats.append("Du stehst auf " + street[pos].name + "\n");

        switch (street[pos].name) {
            case "Ereignisfeld":
                //Ereigniskarte ziehen
                Ereigniskarten karte = Kartenstapel.karte_ziehen();
                break;
            case "Gemeinschaftsfeld":
                //Gemeinschaftskarte ziehen
                break;
            case "Frei_Parken":
                money = money + Board.Moneypool;
                Board.Moneypool = 0;
                //Steuergelder einkassieren
                break;
            case "Einkommenssteuer":
                money = money - 200;
                Board.Moneypool = Board.Moneypool + 200;//Funktioniert Frei Parken auch
                break;
            case "Zusatzsteuer":
                money = money - 100;
                Board.Moneypool = Board.Moneypool + 100;
                break;
            case "Geh_ins_Gefängnis":
                switch (i){
                    case 0:
                        GUI.player1.setBounds(520, 180, 50, 50);
                        Main.players.get(i).pos = 10;
                        cooldown = 3;
                        break;
                    case 1:
                        GUI.player2.setBounds(520, 180, 50, 50);
                        Main.players.get(i).pos = 10;
                        cooldown = 3;
                        break;
                    case 2:
                        GUI.player3.setBounds(520, 180, 50, 50);
                        Main.players.get(i).pos = 10;
                        cooldown = 3;
                        break;
                    case 3:
                        GUI.player4.setBounds(520, 180, 50, 50);
                        Main.players.get(i).pos = 10;
                        cooldown = 3;
                        break;
                }


            default:
                if (street[pos].available) {
                    if (street[pos].cost <= money) {
                        int decision = JOptionPane.showConfirmDialog(GUI.frame, "Willscht kaufen? Kosten:"+ street[pos].cost, "Einkaufennnnnnn", JOptionPane.YES_NO_OPTION);
                        if (decision == 0) {
                            buy(street, pos);
                        }
                    }
                } else if (street[pos].owner != null) {
                    if (street[pos].name.equals("Bahnhof")){
                        double tsrent = 25 * Math.pow(2, street[pos].owner.num_trains - 1);
                        int tsRent = (int) tsrent;
                        GUI.playerstats.append("Du kannst des nd kaufen, musst " + tsRent + " Miete zahlen\n");
                        Main.players.get(i).money = Main.players.get(i).money - tsRent;
                        street[pos].owner.money = street[pos].owner.money + tsRent;
                        break;
                    } else if (street[pos].name.equals("Elektrizitaetswerk") | street[pos].name.equals("Wasserwerk")){
                        int utilityrent = ran * (street[pos].owner.num_utilities * 4);
                        GUI.playerstats.append("Du kannst des nd kaufen, musst " + utilityrent + " Miete zahlen\n");
                        Main.players.get(i).money = Main.players.get(i).money - utilityrent;
                        street[pos].owner.money = street[pos].owner.money + utilityrent;
                        break;
                    }
                    street[pos].payrent(i);
                }
        }
        printMoney();
    }

    public void printMoney() {
        GUI.playerstats.append("Jetzt hast du " + money + " Geld\n");
    }

    void buy(Street[] street, int pos) {
        street[pos].owner = this;
        if (street[pos].name.equals("Bahnhof")) {
            this.num_trains = this.num_trains + 1;
        }
        if (street[pos].name.equals("Elektrizitaetswerk") || street[pos].name.equals("Wasserwerk")) {
            this.num_utilities = this.num_utilities + 1;
        }
        street[pos].available = false;
        this.money = this.money - street[pos].cost;
    }

    /*public void streets_ausgeben(Street[] street) {
        System.out.println("Der Spieler besitzt folgende Strassen:");
        for (int j, j<40, j++){
            if (Board.street[j].owner == this) {
                System.out.println(Board.street[j].name);
            }
        }
    }*/

    public int[] BoardCoords(int playernum){
        final int startx = 500 + (playernum * 3);// damit spieler nicht aufeinander stehen
        final int starty = 810 + (playernum * 3); //hier startcoords eingeben
        final int distance = 60; //Entfernung zws Feldern
        final int distanceSquareRectangle = 85; //Entfernung Ecke zu Feld
        int movex; //Änderung der Koordinaten
        int movey;
        if (pos < 10){
            movex = startx;
            movey = starty - distanceSquareRectangle - (pos - 1) * distance;
            return new int[]{movex, movey};
        } else if (pos < 20){
            movex = startx + distanceSquareRectangle + (pos - 11) * distance;
            movey = starty - 2 * distanceSquareRectangle - 8 * distance;
            return new int[]{movex, movey};
        } else if (pos < 30){
            movex = startx + 2 * distanceSquareRectangle + 8 * distance;
            movey = starty - distanceSquareRectangle - (29 - pos) * distance;
            return new int[]{movex, movey};
        } else if (pos < 40) {
            movex = startx + distanceSquareRectangle + (39 - pos) * distance;
            movey = starty;
            return new int[]{movex, movey};
        }
        return new int[]{0,0};
    }

    public void passedLOS(){
        if (this.pos > 39) {
            this.pos = this.pos - 40;
            System.out.println("Spieler ist über Los gegangen und hat 200 erhalten");
            money = money + 200;
        }
    }

    public void IconMove(int i){
        int[] a = BoardCoords(i);
        switch (i) {
            case 0 -> GUI.player1.setBounds(a[0], a[1], 50, 50);
            case 1 -> GUI.player2.setBounds(a[0], a[1], 50, 50);
            case 2 -> GUI.player3.setBounds(a[0], a[1], 50, 50);
            case 3 -> GUI.player4.setBounds(a[0], a[1], 50, 50);
        }
    }
}
