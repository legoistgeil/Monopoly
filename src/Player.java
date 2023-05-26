public class Player {
    int money;
    int pos;
    int num_trains;
    int num_utilities;
    int cooldown;// in Klasse Main als cooldown oder so denn benutzen

    public Player(int money, int pos, int num_trains, int num_utilities, int cooldown) {
        this.money = money;
        this.pos = pos;
        this.num_trains = num_trains;
        this.num_utilities = num_utilities;
        this.cooldown = cooldown;
    }

    void makeMove (int ran, int i, Street[] street){
        GUI.playerstats.append("Geld:" + money + "\n");
        this.pos += ran;
        passedLOS();
        iconMove(i);
        GUI.playerstats.append("Du stehst auf " +  Board.street[pos].getName() + "\n");
        street[pos].makeAction(i);
        printMoney();
        streets_ausgeben();
    }

    public void printMoney () {
        GUI.playerstats.append("Jetzt hast du " + money + " Geld\n");
    }

    public void streets_ausgeben () {
        GUI.leftStats.setText(null);
        for (int i = 0; i < Main.players.size(); i++){
            GUI.leftStats.append("Der Spieler " + (i + 1) + " hat\n");
            for (int j = 0; j < 40; j++) {
                if (Board.street[j].getOwner() == Main.players.get(i)) {
                    GUI.leftStats.append("   " + Board.street[j].getName() + "\n");
                }
            }
            GUI.leftStats.append("\n");
        }
    }

    public int[] BoardCoords ( int playernum){
        int x = 538;
        int y = 893; //hier startcoords eingeben
        final int distance = 67; //Entfernung zws Feldern
        final int distanceSquareRectangle = 88; //Entfernung Ecke zu Feld
        if (pos < 10) {
            x = x - (playernum * 12);
            y = y - distanceSquareRectangle - (pos - 1) * distance;
            return new int[]{x, y};
        } else if (pos < 20) {
            x = 525 + distanceSquareRectangle + ((pos - 11) * distance);
            y = y - 2 * distanceSquareRectangle - 8 * distance - (playernum * 12);
            return new int[]{x, y};
        } else if (pos < 30) {
            x = x + 2 * distanceSquareRectangle + 8 * distance - (playernum * 12);
            y = y - distanceSquareRectangle - (29 - pos) * distance;
            return new int[]{x, y};
        } else if (pos < 40) {
            x = 525 + distanceSquareRectangle + (39 - pos) * distance;
            y = y + (playernum * 12);
            return new int[]{x, y};
        }
        return new int[]{0, 0};
    }

    public void passedLOS () {
        if (this.pos > 39) {
            this.pos = this.pos - 40;
            System.out.println("Spieler ist über Los gegangen und hat 200 erhalten");
            money = money + 200;
        }
    }
    public void iconMove(int i){
        int[] a = BoardCoords(i);
        switch (i) {
            case 0 -> GUI.player1.setBounds(a[0], a[1], 50, 50);
            case 1 -> GUI.player2.setBounds(a[0], a[1], 50, 50);
            case 2 -> GUI.player3.setBounds(a[0], a[1], 50, 50);
            case 3 -> GUI.player4.setBounds(a[0], a[1], 50, 50);
        }
    }
}


