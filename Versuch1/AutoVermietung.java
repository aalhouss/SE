package de.thk.prakt.vermietung;

import de.thk.prakt.kunden.Mietvertrag;

import java.util.ArrayList;

/**
 * @author Ahmad
 */
public class AutoVermietung {
    private String name;
    private String anschrift;
    private ArrayList<Mietvertrag> vertraegeVermietung;


    /**
     * Konstruktor für erstellen des Arraylists
     */
    public AutoVermietung(){
        vertraegeVermietung=new ArrayList<Mietvertrag>();
    }

    /**
     *Getter des Names der Firma
     * @return Name
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Setter für das Attribut name
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter für das Attribut Anschrift
     * @return anschrift
     */
    public String getAnschrift() {
        return anschrift;
    }

    /**
     * setter für das Attribut Anschrift
     * @param anschrift
     */
    public void setAnschrift(String anschrift) {
        this.anschrift = anschrift;
    }

    /**
     * Add methode , um Mietvertrage zum ArrayList vertrageVermietung hinzufügen
     * @param x
     */
    public void addvertraegevermietungen(Mietvertrag x){

            vertraegeVermietung.add(x);

    }

    /**
     * Add methode , um Mietvertrage von ArrayList vertrageVermietung zu entfernen
     * @param y
     */
    public void delvertraegevermietungen(Mietvertrag y){
        vertraegeVermietung.remove(y);
    }


    /**
     *berechnet die gesamte gebühren für jedes Auto , es ruft 2 methoden auf , eine die gibt die Kosten
     * und eine gibt die Zeit aus, beide würden durch ein  Schleife von Grösse des ArrayList durch geführt
     * @return result
     */
    public int summeAllerVertrage() {
        int result=0;
        for(int i=0;i<vertraegeVermietung.size();i++)
    result=result+vertraegeVermietung.get(i).berechnewochen()*vertraegeVermietung.get(i).getAuto().getgeb();
    return result;
    }


}
