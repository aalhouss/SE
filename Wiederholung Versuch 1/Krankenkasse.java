package de.thk.se.prakt.patienten;

import java.util.ArrayList;
/**
 * Entity class Krankenkasse
 *
 * @author Ahmad.Al Housseini
 * @version 1.1
 *
 */
public class Krankenkasse {
    /**
     * unique Krakenkasse name
     */
    private String name;
    /**
     * Liste über alle patienten des Krankenkasse
     */
    private ArrayList<Patient> patienten;

    /**
     * Konstruktor für erstellen des Liste
     * @param name der KrankenKasse
     */
    public Krankenkasse(String name) {
        this.name=name;
        patienten = new ArrayList<>();
    }

    /**
     * getter von Krankenkasse name
     * @return name der Krankenkasse
     */
    public String getName() {
        return name;
    }

    /**
     *Setter für Krakenkasse name
     * @param name der neuen Krankenkasse
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *Addiert ein Patien zur Liste
     *
     * * @param p Der Patien , der zur Liste hinzugefügt wird
     */
    public void addPatient(Patient p) {
        patienten.add(p);
    }

    /**
     * Entfernt ein Patient von der Liste
     *
     * @param p der Patient, der von der Liste entfernt wird
     */
    public void rdelPatient(Patient p) {
        patienten.remove(p);
    }

    /**
     * Berechnet alle Behandlung durch die Patienten gemacht
     *
     * @return totalsumme
     * @see Patient#berechne()
     */
    public int summeBehandlungen() {
        int totalsumme=0;
        for (int i = 0; i < patienten.size(); i++) {
            totalsumme=totalsumme+patienten.get(i).berechne();
        }
        return totalsumme;
    }
}
