package SPOJ;

import java.util.Scanner;

public class StringMerge {

    public static String string_merge(String s1, String s2) {
        StringBuilder finalString = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < s1.length() && j < s2.length()) {
            finalString.append(s1.charAt(i++));
            finalString.append(s2.charAt(j++));
        }
        return finalString.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s1 = sc.next();
            String s2 = sc.next();

        System.out.println(string_merge(s1, s2));
        }
    }

}
