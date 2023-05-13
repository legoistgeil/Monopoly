public class Ereigniskarten{
  public String name;
  public String textausgabe;
  public int geldzahlung;
  public int steuergeld_aenderung;
  public boolean vorruecken;
  public int ruecke_vor_bis_position;
  public boolean gehe_ins_gefaengnis;

  public Ereigniskarten(String name, String textausgabe, int geldzahlung, int steuergeld_aenderung, boolean vorruecken, int ruecke_vor_bis_position, boolean gehe_ins_gefaengnis) {
    this.name = name;
    this.textausgabe = textausgabe;
    this.geldzahlung = geldzahlung;
    this.steuergeld_aenderung = steuergeld_aenderung;
    this.vorruecken = vorruecken;
    this.ruecke_vor_bis_position = ruecke_vor_bis_position;
    this.gehe_ins_gefaengnis = gehe_ins_gefaengnis;
  }
}
