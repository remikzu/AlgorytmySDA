package zadaniaAlgorytmy260119;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    public static int binarySearch(int[] tab, int y) {

        int left = 0;
        int right = tab.length-1;
        int index;
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
            index = left;
        } else {
            index = -1;
        }
        return index;
    }

    public static void runBinarySearch() {
        int[] tab = new int[100];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i+8;
        }
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));
        System.out.println(binarySearch(tab,10));
    }

    public static void main(String[] args) {
        runBinarySearch();
    }
}
