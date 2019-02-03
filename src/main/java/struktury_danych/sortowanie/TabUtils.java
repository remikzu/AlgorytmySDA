package struktury_danych.sortowanie;

public class TabUtils {

    public static void swap(int[] tab, int i, int j) {
        int tmp = tab[i];
        tab[i] = tab[j];
        tab[j] = tmp;
    }

}
