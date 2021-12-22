package de.thk.se.prakt.patienten;

import de.thk.se.prakt.praxis.Behandlung;

import java.util.ArrayList;

public class Patient {

    private String anschrift;
    private String name;
    private Krankenkasse kasse;
    private ArrayList<Behandlung> behandlungen;

    public Patient(){
    behandlungen=new ArrayList<>();
    }
    public String getAnschrift() {
        return anschrift;
    }

    public void setAnschrift(String anschrift) {
        this.anschrift = anschrift;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Krankenkasse getKasse(){
        return kasse;
    }

    public void setKasse(Krankenkasse kasse){
        this.kasse=kasse;
    }

    public void addbehandlung(Behandlung beh){
        behandlungen.add(beh);
    }

    public void delbehandlung(Behandlung beh){
        behandlungen.remove(beh);
    }

    public  int berechne(){
        int resultat=0;
        for(int i=0;i<behandlungen.size();i++){
            resultat=resultat+behandlungen.get(i).getPreis();
        }
        return  resultat;
    }



}
