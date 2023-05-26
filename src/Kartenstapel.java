import java.util.LinkedList;
import java.util.Random;
public class Kartenstapel {
      static Random rand = new Random();
    public static LinkedList<Ereigniskarten> ereigniskarten = new LinkedList<>();
    public Kartenstapel(){
        ereigniskarten.add(new Ereigniskarten("Planspiel Boerse", "Du hast bei Planspiel Boerse \ngewonnen. Ziehe DM 100 ein",100,0,false,0,false));
        ereigniskarten.add(new Ereigniskarten("Fette Koehle","Du hast die fette Koehle gewonnen.\n Die Bank zahlt Dir DM 150",150,0,false,0,false));
        ereigniskarten.add(new Ereigniskarten("Kuchenverkauf","Der Kuchenverkauf bringt dir DM 50 ein",50,0,false,0,false));
        ereigniskarten.add(new Ereigniskarten("BJ is watching you","Ruecke vor bis Sport Bejenke. Wenn\n du ueber Los kommst, ziehe DM 200 ein",0,0,true,11,false));
        ereigniskarten.add(new Ereigniskarten("Neues Schuljahr","Ruecke bis auf Los vor",0,0,true,0,false));
        ereigniskarten.add(new Ereigniskarten("W-Seminar Abgabetermin","Ruecke vor bis zum W-Seminar",0,0,true,39,false));
        ereigniskarten.add(new Ereigniskarten("Deutschklausur","Ruecke vor bis zu Deutsch Seville.\n Wenn Du ueber Los kommst, \nziehe DM 200 ein",0,0,true,24,false));
        ereigniskarten.add(new Ereigniskarten("Verschlafen","Du kommst 20 Minuten zu spaet \nzum Unterricht. Strafe DM 200",-200,200,false,0,false));
        ereigniskarten.add(new Ereigniskarten("Strafzahlung","Strafe fuer Handy im Unterricht DM 150",-150,150,false,0,false));
        ereigniskarten.add(new Ereigniskarten("Gefaengnis","Gehe in das Gefaengnis. Begib Dich \ndirekt dorthin. Gehe nicht ueber Los.\n Ziehe nicht DM 200 ein",0,0,false,0,true));
    }
    public static Ereigniskarten karte_ziehen(){
        return ereigniskarten.get(rand.nextInt(9));
    }
}
