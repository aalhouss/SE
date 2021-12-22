package de.thk.se.prakt.praxis;

import de.thk.se.prakt.patienten.Patient;


public class Behandlung {

    private String datum;
    private String art;
    private int preis;
    private Arzt arzt;
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }



    public Behandlung(String datum,String art,int preis,Arzt arzt,Patient patien){
        this.datum=datum;
        this.art=art;
        this.preis=preis;
        this.arzt=arzt;
        this.patient=patien;
    }

    public Arzt getArzt() {
        return arzt;
    }

    public void setArzt(Arzt arzt) {
     //   this.arzt = arzt;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }
    public void probe(){
        int y =getPatient().berechne();
    }


}
