package de.thk.se.prakt.laufstrecke.code;

public interface BerechnungLaufstrecke {

    public boolean istTeilnehmer(String name);
    public void addiereLaufstrecke(int teilnehmerNr, double strecke) throws TeilnehmerNotFoundException, LaengeStreckeException, AlterTeilnehmerException;
    public  Teilnehmer findeTeilnehmer(int teilnehmerNr) throws TeilnehmerNotFoundException;
    public void addTeilnehmer (Teilnehmer neuerTeilnehmer);
    public void delTeilnehmer (Teilnehmer entfernterTeilnehmer);

}
