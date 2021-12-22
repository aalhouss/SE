package de.thk.se.prakt.praxis;

import java.util.ArrayList;

public  class Arzt {

    private String name;
    private String addresse;
    private ArrayList<Behandlung> behandlungen;
    public Arzt(){
        behandlungen=new ArrayList<Behandlung>();
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addbehandlung(Behandlung beh){
        behandlungen.add(beh);
    }

    public void delbehandlung(Behandlung beh){
        behandlungen.remove(beh);
    }


}