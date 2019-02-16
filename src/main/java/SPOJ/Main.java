package SPOJ;

import java.util.*;
import java.lang.*;

class Main
{
    public static int sumaRekurencyjnie (int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumaRekurencyjnie(n-1);
    }

    public static void wywolajSUMREK() {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 1; i <= test; i++) {
            int n = sc.nextInt();
            System.out.println(sumaRekurencyjnie(n));
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        wywolajSUMREK();
    }
}