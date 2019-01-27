package zadaniaAlgorytmy260119;

import java.util.Arrays;

public class SitoEratostenesa {

    public static void main(String[] args) {

        int size = 100;
        boolean tab[] = new boolean[size];

        Arrays.fill(tab, true);

        tab[0] = false;
        tab[1] = false;

        for (int i = 2; i < size; i++) {
            if (tab[i] == true) {
                for (int j = i+i; j < size; j = j + i) {
                    tab[j] = false;
                }
            }
        }

        for (int i = 0; i < tab.length; i++) {
            if (tab[i]) {
                System.out.println(i);
            }
        }

    }

}
