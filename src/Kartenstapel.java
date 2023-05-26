import java.util.LinkedList;
import java.util.Random;
public class Kartenstapel {
      static Random rand = new Random();
    public static LinkedList<Ereigniskarten> ereigniskarten = new LinkedList<>();
      static int ran = rand.nextInt(9);
    public Kartenstapel(){
        ereigniskarten.add(new Ereigniskarten("Planspiel Boerse", "Du hast bei Planspiel Boerse gewonnen. Ziehe DM 100 ein",100,0,false,0,false));
        ereigniskarten.add(new Ereigniskarten("Fette Koehle","Du hast die fette Koehle gewonnen. Die Bank zahlt Dir DM 150",150,0,false,0,false));
        ereigniskarten.add(new Ereigniskarten("Kuchenverkauf","Der Kuchenverkauf bringt dir DM 50 ein",50,0,false,0,false));
        ereigniskarten.add(new Ereigniskarten("BJ is watching you","Rücke vor bis Sport Bejenke. Wenn du über Los kommst, ziehe DM 200 ein",0,0,true,11,false));
        ereigniskarten.add(new Ereigniskarten("Neues Schuljahr","Rücke bis auf Los vor",0,0,true,0,false));
        ereigniskarten.add(new Ereigniskarten("W-Seminar Abgabetermin","Rücke vor bis zum W-Seminar",0,0,true,39,false));
        ereigniskarten.add(new Ereigniskarten("Deutschklausur","Rücke vor bis zu Deutsch Seville. Wenn Du über Los kommst, ziehe DM 200 ein",0,0,true,24,false));
        ereigniskarten.add(new Ereigniskarten("Verschlafen","Du kommst 20 Minuten zu spaet zum Unterricht. Strafe DM 200",-200,200,false,0,false));
        ereigniskarten.add(new Ereigniskarten("Strafzahlung","Strafe für Handy im Unterricht DM 150",-150,150,false,0,false));
        ereigniskarten.add(new Ereigniskarten("Gefaengnis","Gehe in das Gefaengnis. Begib Dich direkt dorthin. Gehe nicht über Los. Ziehe nicht DM 200 ein",0,0,false,0,true));
    }
    public static Ereigniskarten karte_ziehen(){
        return ereigniskarten.get(ran);
    }
}
