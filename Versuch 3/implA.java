package de.thk.se.prakt.module.impl1;
import de.thk.se.prakt.module.sortinterface.SortArray;

import java.util.Arrays;

public class implA implements SortArray {

    @Override
    public int[] sort(int[] original) {
       int erg []= Arrays.copyOf(original,original.length);
        int tmp;
        for(int i=1;i<erg.length;i++){
            for(int j=i;j>0;j--) {
                if (erg[j] < erg[j - 1]) {
                    tmp = erg[j];
                    erg[j] = erg[j - 1];
                   erg[j - 1] = tmp;
                }
            }
        }
      //  for(int i=0;i<erg.length;i++)
        return erg;
    }

    @Override
    public String getImplProperty() {
        return "Aufsteigend Sortierung";
    }
}
