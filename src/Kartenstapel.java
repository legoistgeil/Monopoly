import java.util.LinkedList;
import java.util.Random;
public class Kartenstapel {
      static Random rand = new Random();
    public static LinkedList<Ereigniskarten> ereigniskarten = new LinkedList<>();
      static int ran = rand.nextInt(9);
    public Kartenstapel(){
        ereigniskarten.add(new Ereigniskarten("Kreuzwortraetselwettbewerb", "Du hast in einem Kreuzwortraetselwettbewerb gewonnen. Ziehe DM 100 ein",100,0,false,0,false));
        ereigniskarten.add(new Ereigniskarten("Miete und Anleihezinsen","Miete und Anleihezinsen werden fällig. Die Bank zahlt Dir DM 150",150,0,false,0,false));
        ereigniskarten.add(new Ereigniskarten("Bankzahlung","Die Bank zahlt dir eine Dividende von DM 50",50,0,false,0,false));
        ereigniskarten.add(new Ereigniskarten("Seestraße","Rücke vor bis zur Seestraße. Wenn du über Los kommst, ziehe DM 200 ein",0,0,true,11,false));
        ereigniskarten.add(new Ereigniskarten("Los","Rücke bis auf Los vor",0,0,true,0,false));
        ereigniskarten.add(new Ereigniskarten("Schlossallee","Rücke vor bis zu Schlossallee",0,0,true,39,false));
        ereigniskarten.add(new Ereigniskarten("Opernplatz","Rücke vor bis zum Opernplatz. Wenn Du über Los kommst, ziehe DM 200 ein",0,0,true,24,false));
        ereigniskarten.add(new Ereigniskarten("Betrunken im Dienst","Betrunken im Dienst. Strafe DM 200",-200,200,false,0,false));
        ereigniskarten.add(new Ereigniskarten("Strafzahlung","Strafe für zu schnelles Fahren DM 150",-150,150,false,0,false));
        ereigniskarten.add(new Ereigniskarten("Gefängnis","Gehe in das Gefängnis. Begib Dich direkt dorthin. Gehe nicht über Los. Ziehe nicht DM 200 ein",0,0,false,0,true));
    }
    public static Ereigniskarten karte_ziehen(){
        return ereigniskarten.get(ran);
    }
}
