package struktury_danych.sortowanie;

import java.util.Arrays;

public class CountingSort {

    public int[] countingSort(int[] tab, int max) {

        int[] count = new int[max + 1];
        int[] output = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            count[tab[i]]++;
        }

        for (int i = 1; i < count.length; i++) {
//            count[i] = count[i] + count[i-1];
            count[i] += count[i-1];
        }

        for (int i = 0; i < tab.length; i++) {
            output[count[tab[i]] - 1] = tab[i];
            count[tab[i]]--;
        }

        return output;
    }

}
