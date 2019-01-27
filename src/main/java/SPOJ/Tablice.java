package SPOJ;

import java.util.Arrays;
import java.util.Scanner;

public class Tablice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //ilość testów
        int[] tab;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); //ilość liczb
            tab = new int[n];
            for (int j = n-1; j >= 0; j--) {
                tab[j] = sc.nextInt(); //liczby
            }
            for (int i1 : tab) {
                System.out.print(i1 + " ");
            }
        }
    }

}
