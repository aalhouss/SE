package de.thk.prakt.vermietung;

import de.thk.prakt.kunden.Mietvertrag;

import java.util.ArrayList;

public class Auto {
    private int gebuehrProWoche ;
    private String kennzeichen;
    private ArrayList<Mietvertrag> vertraegeAuto;

    public Auto() {
        vertraegeAuto=new ArrayList<Mietvertrag>();
    }


    public int getGebuehrProWoche() {
        return gebuehrProWoche;
    }

    public void setGebuehrProWoche(int gebuehrProWoche) {
        this.gebuehrProWoche = gebuehrProWoche;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

public void addvertraegeAuto(Mietvertrag ver){
        vertraegeAuto.add(ver);
}
public void remvertrageAuto(Mietvertrag ver){
        vertraegeAuto.remove(ver);
}

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }
    public  int getgeb(){
        int x=0;
        for(int i=0;i<vertraegeAuto.size();i++)
         x= vertraegeAuto.get(i).getAuto().getGebuehrProWoche();
        return  x;
    }

}
