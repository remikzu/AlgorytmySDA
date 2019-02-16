package struktury_danych.sortowanie;

import struktury_danych.kopiec.Kopiec;

import java.util.function.Supplier;

public class SortowaniePrzezKopcowanie {

    public int[] sortujKopiec(int[] tab) {
        Kopiec kopiec = new Kopiec();
        kopiec.run(tab);
        int n = tab.length;
        for (int i = n - 1; i >= 0; i--) {
            int tmp = tab[i];
            tab[i] = tab[0];
            tab[0] = tmp;

            kopiec.stworz(tab, i, 0);
        }

        return tab;
    }

}
