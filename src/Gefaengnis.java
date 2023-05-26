public class Gefaengnis extends Street{
    String name;

    public Gefaengnis(String name) {
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

    void payrent(){};

    void makeAction(int i) {
        if(Main.players.get(i).pos == 30){
            gehe_ins_gefaengnis(i);
        }
    }
    static void gehe_ins_gefaengnis(int i){
        switch (i) {
            case 0 -> {
                GUI.player1.setBounds(535, 195, 50, 50);
                Main.players.get(i).pos = 10;
                Main.players.get(i).cooldown = 3;
            }
            case 1 -> {
                GUI.player2.setBounds(535, 195, 50, 50);
                Main.players.get(i).pos = 10;
                Main.players.get(i).cooldown = 3;
            }
            case 2 -> {
                GUI.player3.setBounds(535, 195, 50, 50);
                Main.players.get(i).pos = 10;
                Main.players.get(i).cooldown = 3;
            }
            case 3 -> {
                GUI.player4.setBounds(535, 195, 50, 50);
                Main.players.get(i).pos = 10;
                Main.players.get(i).cooldown = 3;
            }
        }
    }
}
