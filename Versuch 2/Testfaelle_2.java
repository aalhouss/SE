package de.thk.se.prakt.laufstrecke.test;

import de.thk.se.prakt.laufstrecke.code.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Testfaelle_2 {
    private implemntierung objekt;
private Teilnehmer teilnehmer[];
    private int x;
    private double y;
    private double res;

    public Testfaelle_2(int x,double y,double res){
        this.x=x;
        this.y=y;
        this.res=res;
    }
    @Before
    public void setup_class(){
        objekt=new implemntierung();
        teilnehmer=new Teilnehmer[5];
        teilnehmer[0]=new Teilnehmer("Peter",34,11);
        teilnehmer[0].setGewichteteStrecke(13.2);
        teilnehmer[1]=new Teilnehmer("Martin",57,14);
        teilnehmer[1].setGewichteteStrecke(18.6);
        teilnehmer[2]=new Teilnehmer("Klaus",96,28);
        teilnehmer[2].setGewichteteStrecke(33.9);
        teilnehmer[3]=new Teilnehmer("Lea",1,56);
        teilnehmer[3].setGewichteteStrecke(125.4);
        teilnehmer[4]=new Teilnehmer("Lucy",49,78);
        teilnehmer[4].setGewichteteStrecke(56.7);

    }
    @Parameterized.Parameters
    public static Collection<Object> param(){
        return Arrays.asList(new Object[][] {
            {34, 23.89, 41.86},
            {57, 45.64, 68.804},
            {96, 13.1, 47},
            {1, 39.1, 168.41},
            {49, 56.78, 124.836}
        });
        }
        @Test
    public void Test1() throws LaengeStreckeException, TeilnehmerNotFoundException, AlterTeilnehmerException {
        for(int i=0;i<teilnehmer.length;i++)
            objekt.addTeilnehmer(teilnehmer[i]);
        objekt.addiereLaufstrecke(x,y);
        assertEquals(res,objekt.findeTeilnehmer(x).getGewichteteStrecke(),0.01);
}

        }


