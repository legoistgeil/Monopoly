public class Ereigniskarten{
  public String name;
  public String textausgabe;
  public int geldzahlung;
  public int steuergeld_aenderung;
  public boolean vorruecken;
  public int ruecke_vor_bis_position;
  public boolean gehe_ins_gefaengnis;
  public Ereigniskarten(String nameE, String textausgabeE, int geldzahlungE, int steuergeld_aenderungE, boolean vorrueckenE, int ruecke_vor_bis_positionE, boolean gehe_ins_gefaengnisE) {
    name = nameE;
    textausgabe = textausgabeE;
    geldzahlung = geldzahlungE;
    steuergeld_aenderung = steuergeld_aenderungE;
    vorruecken = vorrueckenE;
    ruecke_vor_bis_position = ruecke_vor_bis_positionE;
    gehe_ins_gefaengnis = gehe_ins_gefaengnisE;
  }
}
