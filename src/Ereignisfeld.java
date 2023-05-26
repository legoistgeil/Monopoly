public class Ereignisfeld extends Street{
    String name;

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
        Ereigniskarten karte = Kartenstapel.karte_ziehen();
        System.out.println("Ereigniskarte: " + karte.name);
        System.out.println(karte.textausgabe);
        Main.players.get(i).money += karte.geldzahlung;
        if (karte.vorruecken) {
            if (Main.players.get(i).pos > karte.moveToPos) {
                System.out.println("Du bekommst DM 200, weil du ueber Los gegangen bist");
                Main.players.get(i).money = Main.players.get(i).money + 200;
            }
            Main.players.get(i).pos = karte.moveToPos;
        }
        if (karte.gehe_ins_gefaengnis) {
            Gefaengnis.gehe_ins_gefaengnis(i);
        }
    }

}
