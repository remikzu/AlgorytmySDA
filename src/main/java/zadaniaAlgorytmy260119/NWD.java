package zadaniaAlgorytmy260119;

import java.sql.SQLSyntaxErrorException;

public class NWD {

    public int przezOdejmowanie(int a, int b) {
        while (b!=0) {
            if (a > b) {
                a  = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public int przezReszteZDzielenia(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public int rekurencyjnie(int a, int b) {
        if (b != 0) {
            return rekurencyjnie(b,a%b);
        }
        else return a;
    }
}
