package zadaniaAlgorytmy260119;

import java.util.Arrays;

public class BinarySearch {

    private static String binarySearch(int[] tab, int y) {

        int left = 0;
        int right = tab.length-1;
        String index;
        int middle;

        while (left < right) {
            middle = (left + right) / 2;
            if (tab[middle] < y) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        if (tab[left] == y) {
            index = String.valueOf(left);
        } else {
            index = "Nie znaleziono takiej liczby!";
        }
        return index;
    }

    private static void runBinarySearch() {
        int[] tab = new int[100];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i+1;
        }
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));
        System.out.println(binarySearch(tab,10));
    }

    public static void main(String[] args) {
        runBinarySearch();
    }
}
