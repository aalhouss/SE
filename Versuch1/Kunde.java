package de.thk.prakt.kunden;

import java.util.ArrayList;

public class Kunde {
    private String name;
    private ArrayList<Mietvertrag> vertraegekunde;

    public Kunde() {
        vertraegekunde=new ArrayList<Mietvertrag>();
    }

    public void addKunde(Mietvertrag kunvert){
        vertraegekunde.add(kunvert);
    }
    public void removeKunde(Mietvertrag kunver){
        vertraegekunde.remove(kunver);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
