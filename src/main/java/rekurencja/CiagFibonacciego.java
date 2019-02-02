package rekurencja;

public class CiagFibonacciego {

    public int obliczFib (int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        else
            return obliczFib(n-1) + obliczFib(n-2);
    }

    public static void main(String[] args) {

    }

}
