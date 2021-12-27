package de.thk.se.prakt.module.anwendung;

import java.util.Iterator;
import java.util.ServiceLoader;

import de.thk.se.prakt.module.sortinterface.SortArray;

public class Anwendungsklasse {
    public static void main (String[] args){
        int original []={3,6,1,9,3,34,12,444};
        SortArray big=null;
        SortArray small =null;
        int auftseigsort[]=new int[original.length];
        int absteigsort[]=new int[original.length];
        Iterator<SortArray> iterator = ServiceLoader.load(SortArray.class).iterator();
        ServiceLoader<SortArray> sl = ServiceLoader.load(SortArray.class);
        if(!iterator.hasNext()){
            System.out.println("keine Implemntirung vorhanden");
        }
            for (SortArray a :sl){
                if (a.getImplProperty().equals("Aufsteigend Sortierung"))
                    small=a;
            }
            for (SortArray a :sl){
                if (a.getImplProperty().equals("Absteigend Sortierung"))
                    big=a;
            }
            auftseigsort=small.sort(original);
            absteigsort= big.sort(original);

            System.out.print(small.getImplProperty()+" ");
            for (int i=0;i<original.length;i++)
                System.out.print(auftseigsort[i]+",");
            System.out.println();

            System.out.print(big.getImplProperty()+" ");
            for (int i=0;i<original.length;i++)
                System.out.print(absteigsort[i]+",");
            System.out.println();


            System.out.print("Das Original-Array ");
            for(int i=0;i<original.length;i++)
                System.out.print(original[i]+",");


      //  }
    }
}
