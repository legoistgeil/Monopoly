import java.util.*;

public class Board {
    public static Street[] street;
    public static int Moneypool;
    Player player = new Player(0,0,0,0,0);
    public Board(){
        street = new Street[40];
        street[0]=new Los();
        street[1]=new PropertyCell("Informatik Berkmann", 60,4,null,"lila");
        street[2]=new Ereignisfeld("Gemeinschaftsfeld", 0,0,player,"");
        street[3]=new PropertyCell("Informatik Weber", 60,6,null,"lila");
        street[4]=new Street("Einkommenssteuer", 0,0,player,"");
        street[5]=new PropertyCell("Pausenverkauf", 200,50,null,"");
        street[6]=new PropertyCell("Biologie Koerner", 100,6,null,"hellblau");
        street[7]=new Street("Ereignisfeld", 0,0,player,"");
        street[8]=new Street("Biologie Rosch", 100,8,null,"hellblau");
        street[9]=new Street("Biologie Getfert", 120,10,null,"hellblau");
        street[10]=new Street("Gefaengnis", 0,0,player,"");
        street[11]=new Street("Geografie Bejenke", 140,10,null,"pink");
        street[12]=new Street("Elektrizitaetswerk", 150,0,null,"");
        street[13]=new Street("Geografie Lenner", 140,12,null,"pink");
        street[14]=new Street("WR Schmidpeter", 160,14,null,"pink");
        street[15]=new Street("Ihle", 200,50,null,"");
        street[16]=new Street("Geschichte/Sk Maul", 180,14,null,"orange");
        street[17]=new Street("Gemeinschaftsfeld", 0,0,player,"");
        street[18]=new Street("Geschichte Strunz", 180,16,null,"orange");
        street[19]=new Street("Geschichte/Sk Giessen", 200,18,null,"orange");
        street[20]=new Street("Frei_Parken", 0,0,player,"");
        street[21]=new Street("Deutsch Dabbert", 220,18,null,"rot");
        street[22]=new Street("Ereignisfeld", 0,0,player,"");
        street[23]=new Street("Deutsch Stemplinger", 220,20,null,"rot");
        street[24]=new Street("Deutsch Seville", 240,22,null,"rot");
        street[25]=new Street("Mueller", 200,50,null,"");
        street[26]=new Street("Physik Hoeft", 260,22,null,"gelb");
        street[27]=new Street("Physik Kopp", 260,24,null,"gelb");
        street[28]=new Street("Wasserwerk", 150,0,null,"");
        street[29]=new Street("Chemie Weissvogtmann", 280,26,null,"gelb");
        street[30]=new Street("Geh ins Gefaengnis", 0,0,player,"");
        street[31]=new Street("Mathe Berkmann", 300,26,null,"gruen");
        street[32]=new Street("Mathe Kroiss", 300,0,null,"gruen");
        street[33]=new Street("Gemeinschaftsfeld", 0,0,player,"");
        street[34]=new Street("Mathe Hansen", 320,38,null,"gruen");
        street[35]=new Street("Edeka", 200,50,null,"");
        street[36]=new Street("Ereignisfeld", 0,0,player,"");
        street[37]=new Street("P-Seminar", 350,35,null,"blau");
        street[38]=new Street("Zusatzsteuer", 0,0,player,"");
        street[39]=new Street("W-Seminar", 400,50,null,"blau");


    }

}
