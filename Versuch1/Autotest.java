package de.thk.prakt.test;

import de.thk.prakt.kunden.Kunde;
import de.thk.prakt.kunden.Mietvertrag;
import de.thk.prakt.vermietung.Auto;
import de.thk.prakt.vermietung.AutoVermietung;

public class Autotest {
    public static void main(String args []) throws NullPointerException{


        Auto Auto1=new Auto();
        Auto Auto2=new Auto();
        Auto Auto3=new Auto();
        Auto1.setKennzeichen("AC-P 1234");
        Auto1.setGebuehrProWoche(20);
        Auto2.setKennzeichen("DN-T 2345");
        Auto2.setGebuehrProWoche(30);
        Auto3.setKennzeichen("K-TZ 9876");
        Auto3.setGebuehrProWoche(123);


        Kunde Ernst=new Kunde();
        Ernst.setName("Ernst");
        Kunde Martin=new Kunde();
        Martin.setName("Martin");
        Kunde Peter=new Kunde();
        Peter.setName("Peter");
        Kunde Klaus=new Kunde();
        Klaus.setName("Klaus");



       AutoVermietung Minipreis=new AutoVermietung();
       AutoVermietung Maxipreis=new AutoVermietung();
       Minipreis.setName("Minipreis");
       Maxipreis.setAnschrift("Koeln");

       Maxipreis.setName("Maxpres");
       Maxipreis.setAnschrift("Bonn");


        Mietvertrag vertrag1=new Mietvertrag(Auto1,Minipreis,Peter);
        vertrag1.setBeginnKW(2);
        vertrag1.setEndKW(3);

        Mietvertrag vertrag2=new Mietvertrag(Auto3,Minipreis,Martin);
        vertrag2.setBeginnKW(51);
        vertrag2.setEndKW(3);

        Mietvertrag vertrag3=new Mietvertrag(Auto2,Maxipreis,Peter);
        vertrag3.setBeginnKW(4);
        vertrag3.setEndKW(4);

        Mietvertrag vertrag4=new Mietvertrag(Auto2,Maxipreis,Ernst);
        vertrag4.setBeginnKW(10);
        vertrag4.setEndKW(22);


        Auto1.addvertraegeAuto(vertrag1);
        Auto2.addvertraegeAuto(vertrag3);
        Auto2.addvertraegeAuto(vertrag4);
        Auto3.addvertraegeAuto(vertrag2);


        Minipreis.addvertraegevermietungen(vertrag2);
        Minipreis.addvertraegevermietungen(vertrag1);

        Maxipreis.addvertraegevermietungen(vertrag3);
        Maxipreis.addvertraegevermietungen(vertrag4);
        int b= Maxipreis.summeAllerVertrage();
        int c= Minipreis.summeAllerVertrage();
int d=b+c;
        System.out.println("Die Gebuehren von Maxpreis Firma sind "+b);
        System.out.println("Die Gebuehren von Minipreis Firma sind "+c);
        System.out.println("Die Gebuehren insgesamt von beiden Firmen sind  "+d);






    }
}
