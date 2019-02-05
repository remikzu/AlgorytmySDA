package SPOJ;

import java.util.Scanner;

public class SUMA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        while(sc.hasNextInt()) {
            int number = sc.nextInt();
            suma += number;
            System.out.println(suma);
        }
    }

}
