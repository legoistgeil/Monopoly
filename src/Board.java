import java.util.*;

public class Board {
    public static Street[] street;
    public static int Moneypool;
    HashMap<Street, String> colorGroup = new HashMap<Street, String>();
    Player player = new Player(0,0,0,0,0);
    public Board(){
        street = new Street[40];
        street[0]=new Street("Los", 0,2,player);
        street[1]=new Street("eins", 60,4,null);
        street[2]=new Street("Gemeinschaftsfeld", 0,0,player);
        street[3]=new Street("drei", 60,6,null);
        street[4]=new Street("Einkommenssteuer", 0,0,player);
        street[5]=new Street("Bahnhof", 200,50,null);
        street[6]=new Street("sechs", 100,6,null);
        street[7]=new Street("Ereignisfeld", 0,0,player);
        street[8]=new Street("acht", 100,8,null);
        street[9]=new Street("neun", 120,10,null);
        street[10]=new Street("Gefaengnis", 0,0,player);
        street[11]=new Street("elf", 140,10,null);
        street[12]=new Street("Elektrizitaetswerk", 150,0,null);
        street[13]=new Street("13", 140,12,null);
        street[14]=new Street("14", 160,14,null);
        street[15]=new Street("Bahnhof", 200,50,null);
        street[16]=new Street("16", 180,14,null);
        street[17]=new Street("Gemeinschaftsfeld", 0,0,player);
        street[18]=new Street("18", 180,16,null);
        street[19]=new Street("19", 200,18,null);
        street[20]=new Street("Frei_Parken", 0,0,player);
        street[21]=new Street("21", 220,18,null);
        street[22]=new Street("Ereignisfeld", 0,0,player);
        street[23]=new Street("23", 220,20,null);
        street[24]=new Street("24", 240,22,null);
        street[25]=new Street("Bahnhof", 200,50,null);
        street[26]=new Street("26", 260,22,null);
        street[27]=new Street("27", 260,24,null);
        street[28]=new Street("Wasserwerk", 150,0,null);
        street[29]=new Street("29", 280,26,null);
        street[30]=new Street("Geh ins Gefaengnis", 0,0,player);
        street[31]=new Street("31", 300,26,null);
        street[32]=new Street("32", 300,0,null);
        street[33]=new Street("Gemeinschaftsfeld", 0,0,player);
        street[34]=new Street("34", 320,38,null);
        street[35]=new Street("Bahnhof", 200,50,null);
        street[36]=new Street("Ereignisfeld", 0,0,player);
        street[37]=new Street("37", 350,35,null);
        street[38]=new Street("Zusatzsteuer", 0,0,player);
        street[39]=new Street("39", 400,50,null);

        colorGroup.put(street[1],"lila");
        colorGroup.put(street[3],"lila");
        colorGroup.put(street[6],"hellblau");
        colorGroup.put(street[8],"hellblau");
        colorGroup.put(street[9],"hellblau");
        colorGroup.put(street[11],"pink");
        colorGroup.put(street[13],"pink");
        colorGroup.put(street[14],"pink");
        colorGroup.put(street[16],"blau");
        colorGroup.put(street[18],"blau");
        colorGroup.put(street[19],"blau");
        colorGroup.put(street[21],"blau");
        colorGroup.put(street[23],"blau");
        colorGroup.put(street[24],"blau");
        colorGroup.put(street[26],"blau");
        colorGroup.put(street[27],"blau");
        colorGroup.put(street[29],"blau");
        colorGroup.put(street[31],"blau");
        colorGroup.put(street[32],"blau");
        colorGroup.put(street[34],"blau");
        colorGroup.put(street[37],"blau");
        colorGroup.put(street[39],"blau");
    }

}
