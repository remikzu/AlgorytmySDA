package SPOJ;

import java.util.Scanner;

public class SUMREK {

    public int sumaRekurencyjnie (int n) {

        if (n == 0) {
            return 0;
        }

        return n + sumaRekurencyjnie(n-1);

    }

}
