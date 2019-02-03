package struktury_danych.sortowanie;

public class BubbleSort {

    public int[] bubbleSort(int[] tab) {
        for (int j = 0; j < tab.length - 1; j++) {
            boolean zmieniono = false;
            for (int i = 0; i < tab.length - 1 - j; i++) { //bardziej optymalna
                if (tab[i] > tab[i + 1]) {
                    TabUtils.swap(tab, i, i + 1);
                    zmieniono = true;
                }
            }
        }


        return tab;
    }
}
