public class Board {
    public static Street[] street;
    public Board(){
        street = new Street[40];
        street[0]=new Street("Los", false, 0,0,null);
        street[1]=new Street("eins", true, 60,0,null);
        street[2]=new Street("Gemeinschaftsfeld", false, 0,0,null);
        street[3]=new Street("drei", true, 60,0,null);
        street[4]=new Street("Einkommenssteuer", false, 0,0,null);
        street[5]=new Street("Bahnhof", true, 200,Street.tsrent(),null);
        street[6]=new Street("sechs", true, 100,1,null);
        street[7]=new Street("Ereignisfeld", false, 0,0,null);
        street[8]=new Street("acht", true, 100,0,null);
        street[9]=new Street("neun", true, 120,0,null);
        street[10]=new Street("Gefaengnis", false, 0,0,null);
        street[11]=new Street("elf", true, 140,0,null);
        street[12]=new Street("Elektrizitätswerk", true, 150,0,null);
        street[13]=new Street("13", true, 140,0,null);
        street[14]=new Street("14", true, 160,0,null);
        street[15]=new Street("Bahnhof", true, 200,Street.tsrent(),null);
        street[16]=new Street("16", true, 180,0,null);
        street[17]=new Street("Gemeinschaftsfeld", false, 0,0,null);
        street[18]=new Street("18", true, 180,0,null);
        street[19]=new Street("19", true, 200,0,null);
        street[20]=new Street("Frei_Parken", false, 0,0,null);
        street[21]=new Street("21", true, 220,0,null);
        street[22]=new Street("Ereignisfeld", false, 0,0,null);
        street[23]=new Street("23", true, 220,0,null);
        street[24]=new Street("24", true, 240,0,null);
        street[25]=new Street("Bahnhof", true, 200,Street.tsrent(),null);
        street[26]=new Street("26", true, 260,0,null);
        street[27]=new Street("27", true, 260,0,null);
        street[28]=new Street("Wasserwerk", true, 150,0,null);
        street[29]=new Street("29", true, 280,0,null);
        street[30]=new Street("Geh_ins_Gefängnis", false, 0,0,null);
        street[31]=new Street("31", true, 300,0,null);
        street[32]=new Street("32", true, 300,0,null);
        street[33]=new Street("Gemeinschaftsfeld", false, 0,0,null);
        street[34]=new Street("34", true, 320,0,null);
        street[35]=new Street("Bahnhof", true, 200,Street.tsrent(),null);
        street[36]=new Street("Ereignisfeld", false, 0,0,null);
        street[37]=new Street("37", true, 350,0,null);
        street[38]=new Street("Zusatzsteuer", false, 0,0,null);
        street[39]=new Street("39", true, 400,0,null);
    }


}
