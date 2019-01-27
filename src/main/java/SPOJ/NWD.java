package SPOJ;

import java.util.*;
import java.lang.*;

class NWD
{

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            System.out.println(nwd(sc.nextInt(), sc.nextInt()));
        }

    }

    public static int nwd (int a, int b) {
        while (b != 0) {
            if (a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        return a;
    }
}