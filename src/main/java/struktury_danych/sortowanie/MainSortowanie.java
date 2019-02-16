package struktury_danych.sortowanie;

import java.util.ArrayList;
import java.util.Arrays;

public class MainSortowanie {

    public static void wywolajSelectSort() {
        SelectSort sort = new SelectSort();
        int[] tab = {10, 5, 3, 7, 1, 6, 2};
        System.out.println(Arrays.toString(sort.sortowaniePrzezWybieranie(tab.clone())));
    }

    public static void wywolajBubbleSort() {
        BubbleSort sort = new BubbleSort();
        int[] tab = {10, 5, 3, 7, 1, 6, 2};
        System.out.println(Arrays.toString(sort.bubbleSort(tab.clone())));
    }

    public static void wywolajCountingSort() {
        CountingSort sort = new CountingSort();
        int[] tab = {10, 5, 3, 7, 1, 6, 2};
        System.out.println(Arrays.toString(sort.countingSort(tab.clone(), 100)));
    }

    public static void wywolajInsterSort() {
        InsertSort sort = new InsertSort();
        int[] tab = {10, 5, 3, 7, 1, 6, 2};
        System.out.println(Arrays.toString(sort.insertSort(tab.clone())));
    }

    public static void wywolajQuickSort() {
        QuickSort sort = new QuickSort();
        int[] tab = {10, 5, 3, 7, 1, 6, 2};
        System.out.println(Arrays.toString(sort.quickSort(tab.clone(), 0, tab.length - 1)));
    }

    public static void wywolajKopiecSort() {
        SortowaniePrzezKopcowanie sort = new SortowaniePrzezKopcowanie();
        int[] tab = {10, 5, 3, 7, 1, 6, 2};
        System.out.println(Arrays.toString(sort.sortujKopiec(tab)));
    }


    public static void main(String[] args) {
//        wywolajSelectSort();
//        wywolajBubbleSort();
//        wywolajCountingSort();
//        wywolajInsterSort();
//        wywolajQuickSort();
            wywolajKopiecSort();
    }

}
