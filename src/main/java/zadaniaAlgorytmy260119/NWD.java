package zadaniaAlgorytmy260119;

import java.sql.SQLSyntaxErrorException;

public class NWD {

    public static int przezOdejmowanie(int a, int b) {
        while (b!=0) {
            if (a > b) {
                a  = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int przezReszteZDzielenia(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        long start;
        long stop;
        int a = 10002;
        int b = 4;

        start = System.nanoTime();
        przezOdejmowanie(a, b);
        stop = System.nanoTime();

        System.out.println("NWD odejmowanie: " + (stop-start));

        start = System.nanoTime();
        przezReszteZDzielenia(a, b);
        stop = System.nanoTime();

        System.out.println("NWD przez reszte: " + (stop-start));
    }
}
