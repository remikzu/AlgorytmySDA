package struktury_danych.sortowanie;

public class QuickSort {

    public int[] quickSort(int[] tab, int lewy, int prawy) {
        int pivot = tab[(lewy + prawy) / 2];
        int i = lewy;
        int j = prawy;

        while (i <= j) {
            while (tab[i] < pivot) {
                i++;
            }
            while (tab[j] > pivot) {
                j--;
            }
            if (i <= j) {
                TabUtils.swap(tab, i, j);
                i++;
                j--;
            }
        }
        if (lewy < j) {
            quickSort(tab, lewy, j);
        }
        if (i < prawy) {
            quickSort(tab, i, prawy);
        }

        return tab;
    }

}
