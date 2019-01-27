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

    public static void main(String[] args) {

    }
}
