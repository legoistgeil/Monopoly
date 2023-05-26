public class Ereignisfeld extends Street{
    String name;
    int counter = 0;

    public Ereignisfeld(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return 0;
    }

    @Override
    public Player getOwner() {
        return null;
    }

    @Override
    public Object getColor() {
        return null;
    }

    void makeAction(int i) {
        GUI.karte.setText(null);
        Ereigniskarten karte = Kartenstapel.karte_ziehen();
        GUI.karte.append("Ereigniskarte: " + karte.name + "\n");
        GUI.karte.append(karte.textausgabe + "\n");
        Main.players.get(i).money += karte.geldzahlung;
        if (karte.vorruecken) {
            if (Main.players.get(i).pos > karte.moveToPos) {
                GUI.karte.append("Du bekommst DM 200, weil du ueber Los gegangen bist\n");
                Main.players.get(i).money += 200;
            }
            Main.players.get(i).pos = karte.moveToPos;
        }
        if (karte.gehe_ins_gefaengnis) {
            Gefaengnis.gehe_ins_gefaengnis(i);
        }
    }

}
