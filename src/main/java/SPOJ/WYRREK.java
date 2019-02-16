package SPOJ;

import java.util.Scanner;

public class WYRREK {

    public static String odwrotnaKolejnosc () {

        Scanner sc = new Scanner(System.in);
        String slowo = sc.next();
        if (slowo == null) {
            return null;
        }
        odwrotnaKolejnosc();
        System.out.println(slowo);
        return slowo;
    }

    public static void main(String[] args) {
        odwrotnaKolejnosc();
    }

}
