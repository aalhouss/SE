package de.thk.se.prakt.module.impl2;

import de.thk.se.prakt.module.sortinterface.SortArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class implB implements SortArray {
    @Override
    public int[] sort(int[] original) {
        int erg []= Arrays.copyOf(original,original.length);
        int tmp;
        for(int i=0;i<erg.length;i++){
            for(int j=i+1;j<erg.length;j++) {
                if (erg[i]<erg[j]){
                    tmp=erg[i];
                    erg[i]=erg[j];
                    erg[j]=tmp;
                }
            }
        }
        //  for(int i=0;i<erg.length;i++)
        return erg;
    }

    @Override
    public String getImplProperty() {
        return "Absteigend Sortierung";
    }
}
