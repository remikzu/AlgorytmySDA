package struktury_danych.sortowanie;

public class InsertSort {

    public int[] insertSort(int[] tab) {

        for (int i = 0; i < tab.length; i++) {
            for (int j = i; j > 0; j--) {
                if (tab[j] < tab[j-1]) {
                    TabUtils.swap(tab, j, j-1);
                } else {
                    break;
                }
            }
        }
        return tab;
    }

}
