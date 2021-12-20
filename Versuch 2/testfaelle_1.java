package de.thk.se.prakt.laufstrecke.test;
import de.thk.se.prakt.laufstrecke.code.*;
import org.junit.Before;
import org.junit.Test;
import de.thk.se.prakt.laufstrecke.code.Teilnehmer;
import static org.junit.Assert.*;

public class testfaelle_1 {
    private implemntierung objekt;
    private Teilnehmer teil1;
    private Teilnehmer teil2;
    private Teilnehmer teil3;
    private Teilnehmer teil4;

    @Before
    public void setupclass(){
        teil1=new Teilnehmer("Klaus",23,15);
        teil2=new Teilnehmer("ahmad",21,15);
        teil3=new Teilnehmer("Micheal",99,-1);
        teil4=new Teilnehmer("Peter",46,15);
        objekt=new implemntierung();
    }

    @Test
    public void test1(){
        objekt.addTeilnehmer(teil1);
        assertTrue(objekt.istTeilnehmer("Klaus"));
    }
    @Test
    public void test2(){
        objekt.addTeilnehmer(teil2);
        assertFalse(objekt.istTeilnehmer("Klaus"));
    }
    @Test(expected = TeilnehmerNotFoundException.class)
    public void test3() throws TeilnehmerNotFoundException {
        objekt.addTeilnehmer(teil2);
        objekt.findeTeilnehmer(23);
    }

    @Test(expected = TeilnehmerNotFoundException.class)
    public void test4() throws TeilnehmerNotFoundException {
        objekt.findeTeilnehmer(23);
    }

    @Test
    public void test5() throws TeilnehmerNotFoundException {
        objekt.addTeilnehmer(teil1);
        assertEquals(teil1,objekt.findeTeilnehmer(23));
    }

    @Test(expected = LaengeStreckeException.class)
    public void test6() throws LaengeStreckeException, TeilnehmerNotFoundException, AlterTeilnehmerException {
        objekt.addTeilnehmer(teil4);
        objekt.addiereLaufstrecke(46,-3.9);
    }

    @Test(expected = AlterTeilnehmerException.class)
    public void test7() throws LaengeStreckeException, TeilnehmerNotFoundException, AlterTeilnehmerException {
        objekt.addTeilnehmer(teil3);
        objekt.addiereLaufstrecke(99,12.57);
    }

    @Test(expected = TeilnehmerNotFoundException.class)
    public void test8() throws LaengeStreckeException, TeilnehmerNotFoundException, AlterTeilnehmerException {
        objekt.addTeilnehmer(teil3);
        objekt.addiereLaufstrecke(10,15);
    }


}

