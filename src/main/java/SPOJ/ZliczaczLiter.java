package SPOJ;

import java.lang.reflect.Array;
import java.util.*;

public class ZliczaczLiter {

    public static void zliczanieLiter(StringBuilder string) {
        String trimedString = string.toString().trim().replace(" ", "");
        char[] tab = trimedString.toCharArray();
        TreeMap<Character, Integer> mapa = new TreeMap<>();
        int count = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (tab[i] == tab[j]) {
                    count++;
                }
            }
            mapa.put(tab[i], count);
            count = 0;
        }
        printMap(mapa);
    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
        int t = 2;
        StringBuilder sB = new StringBuilder();

//        for (int i = 0; i <= t; i++) {
//            String tekst = sc.nextLine();
//            sB.append(tekst);
//        }
        sB.append("ala ma kota").append("Ola ma psa");
        zliczanieLiter(sB);
    }
}
