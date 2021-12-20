package de.thk.se.prakt.laufstrecke.code;

import java.util.ArrayList;

public class implemntierung implements BerechnungLaufstrecke{
private  ArrayList<Teilnehmer> Teilnehmerliste;

public implemntierung() {
    Teilnehmerliste = new ArrayList<Teilnehmer>();
}
    @Override
    public boolean istTeilnehmer(String name) {
        for(int i=0;i<Teilnehmerliste.size();i++){
            if(Teilnehmerliste.get(i).getName().equals(name))
                return true;
        }
        return false;
    }

    @Override
    public void addiereLaufstrecke(int teilnehmerNr, double strecke) throws TeilnehmerNotFoundException, LaengeStreckeException, AlterTeilnehmerException {
        for (int i = 0; i < Teilnehmerliste.size(); i++) {
            if (findeTeilnehmer(teilnehmerNr) != null) {
                if (Teilnehmerliste.get(i).getAlter() >= 0 && Teilnehmerliste.get(i).getAlter() <= 12) {
                    Teilnehmerliste.get(i).setGewichteteStrecke(Teilnehmerliste.get(i).getGewichteteStrecke() + 1.2 * strecke);
                } else if (Teilnehmerliste.get(i).getAlter() >= 13 && Teilnehmerliste.get(i).getAlter() <= 15) {
                    Teilnehmerliste.get(i).setGewichteteStrecke(Teilnehmerliste.get(i).getGewichteteStrecke() + 1.1 * strecke);
                } else if (Teilnehmerliste.get(i).getAlter() >= 16 && Teilnehmerliste.get(i).getAlter() <= 49) {
                    Teilnehmerliste.get(i).setGewichteteStrecke(Teilnehmerliste.get(i).getGewichteteStrecke()+strecke);
                } else if (Teilnehmerliste.get(i).getAlter() >= 50 && Teilnehmerliste.get(i).getAlter() <= 60) {
                    Teilnehmerliste.get(i).setGewichteteStrecke(Teilnehmerliste.get(i).getGewichteteStrecke() + 1.1 * strecke);
                } else if (Teilnehmerliste.get(i).getAlter() >= 60) {
                    Teilnehmerliste.get(i).setGewichteteStrecke(Teilnehmerliste.get(i).getGewichteteStrecke() + 1.2 * strecke);
                }  if (strecke < 0) {
                    throw new LaengeStreckeException("Streck soll >0 ");
                }  if (Teilnehmerliste.get(i).getAlter() < 0) {
                    throw new AlterTeilnehmerException("Alter soll >0");
                }
            }
        }
    }

    @Override
    public  Teilnehmer findeTeilnehmer(int teilnehmerNr) throws TeilnehmerNotFoundException {

        for(int i=0;i<Teilnehmerliste.size();i++){
            if(Teilnehmerliste.get(i).getTeilnehmerNr()==teilnehmerNr) {
                return Teilnehmerliste.get(i);
            }
        }
        throw  new TeilnehmerNotFoundException("Teilnehmer nicht gefunden");
    }

    @Override
    public void delTeilnehmer(Teilnehmer entfernterTeilnehmer) {
Teilnehmerliste.remove(entfernterTeilnehmer);
    }

    @Override
    public void addTeilnehmer (Teilnehmer neuerTeilnehmer){
        Teilnehmerliste.add(neuerTeilnehmer);
    }

    }

