package SPOJ;

import java.util.Arrays;
import java.util.Scanner;

public class PRIME_T {

    private static boolean[] sito;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        stworzSito(10000);

        int n = scanner.nextInt();
        int liczb;

        for (int i = 0; i < n; i++) {
            liczb = scanner.nextInt();

            if (sprawdzPrzezSito(liczb)) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }

        scanner.close();
    }

    public static boolean sprawdzPrzezSito(int n) {
        return sito[n];
    }

    public static void stworzSito(int size) {
        sito = new boolean[size+1];

        Arrays.fill(sito, true);

        sito[0] = false;
        sito[1] = false;

        for (int i = 2; i*i <= size; i++) {
            if (sito[i]) {
                for (int j = i+i; j <= size; j += i) {
                    sito[j] = false;
                }
            }
        }
    }

}
