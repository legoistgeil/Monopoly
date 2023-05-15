import javax.swing.*;

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
        GUI.line2.setText("Geld:" + money);
        this.pos = this.pos + ran;
        if (this.pos > 39){
            this.pos = this.pos - 40;
            System.out.println("Spieler ist über Los gegangen und hat 200 erhalten");
            money = money + 200;
        }

        int[] a = BoardCoords();
        GUI.player1.setBounds(a[0], a[1],50,50);
        GUI.line3.setText("Du stehst auf " + street[pos].name);

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
                        int decision = JOptionPane.showConfirmDialog(GUI.frame, "Willscht kaufen?","Einkaufennnnnnn", JOptionPane.YES_NO_OPTION);
                        if(decision == 0){
                            buy(street, pos);
                        }
                    }
                } else if (street[pos].owner != null) {
                    street[pos].payrent(i);
                }
        }
        printMoney(street);
    }

    public void printMoney(Street[] street) {
        GUI.line4.setText("Jetzt hast du " + money + " Geld");
    }

    void buy(Street[] street, int pos){
        if(street[pos].name.equals("Bahnhof")){
            this.num_trains = this.num_trains + 1;
        }
        street[pos].owner = this;
        street[pos].available = false;
        this.money = this.money - street[pos].cost;
    }

    public int[] BoardCoords(){
        final int startx = 500;
        final int starty = 810; //hier startcoords eingeben
        final int distance = 60; //Entfernung zws Feldern
        final int distanceSquareRectangle = 85; //Entfernung Ecke zu Feld
        int movex = 0; //Änderung der Koordinaten
        int movey = 0;
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
        return new int[]{movex, movey};
    }
}

