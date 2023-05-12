public class Board {
    public static Street[] street;
    public Board(){
        street = new Street[40];
        street[0]=new Street("los", false, 0,0,null,false);
        street[1]=new Street("a", true, 60,0,null,true);
        street[2]=new Street("Gemeinschaftsfeld", false, 0,0,null,false);
        street[3]=new Street("a", true, 60,0,null,true);
        street[4]=new Street("Einkommenssteuer", false, 0,0,null,false);
        street[5]=new Street("Bahnhof", true, 200,0,null,true);
        street[6]=new Street("a", true, 100,1,null,true);
        street[7]=new Street("Ereignisfeld", false, 0,0,null,false);
        street[8]=new Street("a", true, 100,0,null,true);
        street[9]=new Street("a", true, 120,0,null,true);
        street[10]=new Street("Gefängnis", false, 0,0,null,false);
        street[11]=new Street("a", true, 140,0,null,true);
        street[12]=new Street("Elektrizitätswerk", true, 150,0,null,true);
        street[13]=new Street("a", true, 140,0,null,true);
        street[14]=new Street("a", true, 160,0,null,true);
        street[15]=new Street("Bahnhof", true, 200,0,null,true);
        street[16]=new Street("a", true, 180,0,null,true);
        street[17]=new Street("Gemeinschaftsfeld", false, 0,0,null,false);
        street[18]=new Street("a", true, 180,0,null,true);
        street[19]=new Street("a", true, 200,0,null,true);
        street[20]=new Street("Frei_Parken", false, 0,0,null,false);
        street[21]=new Street("a", true, 220,0,null,true);
        street[22]=new Street("Ereignisfeld", false, 0,0,null,false);
        street[23]=new Street("a", true, 220,0,null,true);
        street[24]=new Street("a", true, 240,0,null,true);
        street[25]=new Street("Bahnhof", true, 200,0,null,true);
        street[26]=new Street("a", true, 260,0,null,true);
        street[27]=new Street("a", true, 260,0,null,true);
        street[28]=new Street("Wasserwerk", true, 150,0,null,true);
        street[29]=new Street("a", true, 280,0,null,true);
        street[30]=new Street("Geh_ins_Gefängnis", false, 0,0,null,false);
        street[31]=new Street("a", true, 300,0,null,true);
        street[32]=new Street("a", true, 300,0,null,true);
        street[33]=new Street("Gemeinschaftsfeld", false, 0,0,null,false);
        street[34]=new Street("a", true, 320,0,null,true);
        street[35]=new Street("Bahnhof", true, 200,0,null,true);
        street[36]=new Street("Ereignisfeld", false, 0,0,null,false);
        street[37]=new Street("a", true, 350,0,null,true);
        street[38]=new Street("Zusatzsteuer", false, 0,0,null,false);
        street[39]=new Street("a", true, 400,0,null,true);
    }

}
