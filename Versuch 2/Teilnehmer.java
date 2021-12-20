package de.thk.se.prakt.laufstrecke.code;

public class Teilnehmer {
    private  String name;
    private int teilnehmerNr;
    private int alter;
    private double gewichteteStrecke;

    public Teilnehmer(String name, int teilnehmerNr, int alter) {
        this.name = name;
        this.teilnehmerNr = teilnehmerNr;
        this.alter = alter;
        this.gewichteteStrecke = 0;
    }

    public String getName() {
        return name;
    }

    public int getTeilnehmerNr() {
        return teilnehmerNr;
    }

    public int getAlter() {
        return alter;
    }

    public double getGewichteteStrecke() {
        return gewichteteStrecke;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeilnehmerNr(int teilnehmerNr) {
        this.teilnehmerNr = teilnehmerNr;
    }


    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setGewichteteStrecke(double gewichteteStrecke) {
        this.gewichteteStrecke = gewichteteStrecke;
    }
}
