package rekurencja;

public class Silnia {

    public int rekurencyjnie(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }

        return n * rekurencyjnie(n -1);
    }

}
