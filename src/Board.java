import java.util.*;

public class Board {
    static Street[] street = new Street[40];
    public static int Moneypool;
    Player player = new Player(0,0,0,0,0);
    public Board(){
        street[0]=new Los("Los");
        street[1]=new PropertyCell("Informatik Berkmann", 60,4,null,"lila");
        street[2]=new Ereignisfeld("Gemeinschaftsfeld");
        street[3]=new PropertyCell("Informatik Weber", 60,6,null,"lila");
        street[4]=new Steuern("Einkommenssteuer");
        street[5]=new TrainStation("Pausenverkauf",200,null);
        street[6]=new PropertyCell("Biologie Koerner", 100,6,null,"hellblau");
        street[7]=new Ereignisfeld("Ereignisfeld");
        street[8]=new PropertyCell("Biologie Rosch", 100,8,null,"hellblau");
        street[9]=new PropertyCell("Biologie Getfert", 120,10,null,"hellblau");
        street[10]=new Gefaengnis("Gefaengnis");
        street[11]=new PropertyCell("Geografie Bejenke", 140,10,null,"pink");
        street[12]=new Werk("E-Werk",player,100);
        street[13]=new PropertyCell("Geografie Lenner", 140,12,null,"pink");
        street[14]=new PropertyCell("WR Schmidpeter", 160,14,null,"pink");
        street[15]=new TrainStation("Ihle",200,null);
        street[16]=new PropertyCell("Geschichte/Sk Maul", 180,14,null,"orange");
        street[17]=new Ereignisfeld("Gemeinschaftsfeld");
        street[18]=new PropertyCell("Geschichte Strunz", 180,16,null,"orange");
        street[19]=new PropertyCell("Geschichte/Sk Giessen", 200,18,null,"orange");
        street[20]=new FreiParken("FreiParken");
        street[21]=new PropertyCell("Deutsch Dabbert", 220,18,null,"rot");
        street[22]=new Ereignisfeld("Ereignisfeld");
        street[23]=new PropertyCell("Deutsch Stemplinger", 220,20,null,"rot");
        street[24]=new PropertyCell("Deutsch Seville", 240,22,null,"rot");
        street[25]=new TrainStation("Mueller",200,null);
        street[26]=new PropertyCell("Physik Hoeft", 260,22,null,"gelb");
        street[27]=new PropertyCell("Physik Kopp", 260,24,null,"gelb");
        street[28]=new Werk("W-Werk",player,100);
        street[29]=new PropertyCell("Chemie Weissvogtmann", 280,26,null,"gelb");
        street[30]=new Gefaengnis("Geh_ins_Gefaengnis");
        street[31]=new PropertyCell("Mathe Berkmann", 300,26,null,"gruen");
        street[32]=new PropertyCell("Mathe Kroiss", 300,0,null,"gruen");
        street[33]=new Ereignisfeld("Gemeinschaftsfeld");
        street[34]=new PropertyCell("Mathe Hansen", 320,38,null,"gruen");
        street[35]=new TrainStation("Edeka",200,null);
        street[36]=new Ereignisfeld("Ereignisfeld");
        street[37]=new PropertyCell("P-Seminar", 350,35,null,"blau");
        street[38]=new Steuern("Zusatzsteuer");
        street[39]=new PropertyCell("W-Seminar", 400,50,null,"blau");
    }

}
