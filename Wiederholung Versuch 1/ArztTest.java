package de.thk.se.prakt.kassentest;

import de.thk.se.prakt.patienten.Krankenkasse;
import de.thk.se.prakt.patienten.Patient;
import de.thk.se.prakt.praxis.Arzt;
import de.thk.se.prakt.praxis.Behandlung;

public class ArztTest {

    public static void main(String [] args){
      //Arzt erstellen
      Arzt Sommer=new Arzt();
      Sommer.setAddresse("Berlin");
      Sommer.setName("Sommer");
      Arzt Winter=new Arzt();
      Winter.setName("Winter");
      Winter.setAddresse("Berlin");
      Arzt Herbst=new Arzt();
      Herbst.setAddresse("Potsdam");
      Herbst.setName("Herbst");

      //krankenaksse erstellen
        Krankenkasse Techniker=new Krankenkasse("Techniker");
        Krankenkasse AOK=new Krankenkasse("AOK");

      // Patienten erstellen
        Patient Klaus=new Patient();
        Klaus.setAnschrift("Berlin");
        Klaus.setKasse(AOK);
        Klaus.setName("Klaus");

        Patient Dieter=new Patient();
        Dieter.setAnschrift("Berlin");
        Dieter.setKasse(Techniker);
        Dieter.setName("Dieter");

        Patient Peter=new Patient();
        Peter.setAnschrift("Berlin");
        Peter.setKasse(AOK);
        Peter.setName("Peter");

      //Behandlungen erstellen
        Behandlung behandlung1=new Behandlung("13.06.2015","Impfung",45,Sommer,Peter);
        Behandlung behandlung2=new Behandlung("16.06.2015","Untersuchung",144,Herbst,Peter);
        Behandlung behandlung3=new Behandlung("19.05.2015","Blutdruck",23,Sommer,Klaus);
        Behandlung behandlung4=new Behandlung("23.7.2015","Verstauchung",77,Winter,Dieter);
        Behandlung behandlung5=new Behandlung("01.08.2015","Bruch",234,Winter,Dieter);
        Behandlung behandlung6=new Behandlung("20.03.2015","Untersucuhung",22,Herbst,Klaus);

    //Arzt add behandlung
        Sommer.addbehandlung(behandlung1);
        Sommer.addbehandlung(behandlung3);
        Herbst.addbehandlung(behandlung2);
        Herbst.addbehandlung(behandlung6);
        Winter.addbehandlung(behandlung4);
        Winter.addbehandlung(behandlung5);

     //patieneten add behandlung
        Peter.addbehandlung(behandlung1);
        Peter.addbehandlung(behandlung2);
        Klaus.addbehandlung(behandlung3);
        Dieter.addbehandlung(behandlung4);
        Dieter.addbehandlung(behandlung5);
        Klaus.addbehandlung(behandlung6);

      //Krakenkasse add patient
        AOK.addPatient(Peter);
        AOK.addPatient(Klaus);
        Techniker.addPatient(Dieter);

        System.out.println("Die gesamte Behandlung preise bei AOK sind :"+AOK.summeBehandlungen());
      System.out.println("Die gesamte Behandlung preise bei techniker sind :"+Techniker.summeBehandlungen());
      System.out.println("Die GESAMTE bEHANDLUNG preise der Krankenakssen sind :"+(AOK.summeBehandlungen()+Techniker.summeBehandlungen()));




    }
}
