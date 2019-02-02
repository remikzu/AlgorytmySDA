package SPOJ;

import java.util.*;
import java.lang.*;

class Flamaster {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int count = 1;
//        String word = "OPSS";
        for (int i = 0; i < c; i++) {
            String word = sc.next();
            if (word == null) {
                break;
            } else {
                char[] tab = word.toCharArray();
                for (int j = 0; j < tab.length - 1; j++) {
                    if (count < 3) {
                        if (tab[j] == tab[j + 1]) {
                            count++;
                        } else {
                            count = 1;
                            if (count < 3) {
                                System.out.print(tab[j]);
                            }
                        }
                    } else {
                        if (tab[j] == tab[j + 1]) {
                            count++;
                        } else {
                            System.out.print(count);
                            count = 1;
                        }
                    }
                }
            }
        }
    }
}