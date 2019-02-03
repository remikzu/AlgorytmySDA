package struktury_danych.sortowanie;

import java.util.Arrays;

public class SortowaniePrzezWybieranie {

    public int[] sortowaniePrzezWybieranie(int tab[]) {

        int n = tab.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(tab[j] < tab[i]) {
                    TabUtils.swap(tab, i, j);
                }
            }
        }

        return tab;
    }

}
