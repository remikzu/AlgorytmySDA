package struktury_danych.sortowanie;

import java.util.Arrays;

public class MainSortowanie {

    public static void wywolajSelectSort() {
        SortowaniePrzezWybieranie sort = new SortowaniePrzezWybieranie();
        int[] tab = {10, 5, 3, 7, 1, 6, 2};
        System.out.println(Arrays.toString(sort.sortowaniePrzezWybieranie(tab)));
    }

    public static void main(String[] args) {
        wywolajSelectSort();
    }

}
