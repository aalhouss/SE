package de.thk.prakt.kunden;

import de.thk.prakt.vermietung.Auto;
import de.thk.prakt.vermietung.AutoVermietung;

public class Mietvertrag {
    private int beginnKW;
    private int endKW;
    private Auto auto;
    private AutoVermietung firma;
    private  Kunde kunde;

    public Mietvertrag(){

    }
    public Mietvertrag(Auto a,AutoVermietung fi,Kunde k){
        auto=a;
        firma=fi;
        kunde=k;
    }

    public int getBeginnKW() {
        return beginnKW;
    }

    public void setBeginnKW(int beginnKW) {
        this.beginnKW = beginnKW;
    }

    public int getEndKW() {
        return endKW;
    }

    public void setEndKW(int endKW) {
        this.endKW = endKW;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public AutoVermietung getFirma() {
        return firma;
    }

    public void setFirma(AutoVermietung firma) {
        this.firma = firma;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }
    public int berechnewochen(){
       int erg=0;
       int tmp;
        if(endKW>beginnKW)
            erg=endKW-beginnKW+1;
        else if(endKW==beginnKW)
            erg=1;
        else if(endKW<beginnKW) {
            tmp = 52 - beginnKW;
            erg = tmp + endKW+1;
        }
        return erg;
    }






}
