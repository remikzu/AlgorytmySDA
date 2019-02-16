package SPOJ;

public class TrojkatRekurencyjnie {

    public String rysujTrojkat (int n) {

        if (n <= 0) {
            return "";
        }
        String gwiazdka = rysujTrojkat(n - 1);
        gwiazdka = gwiazdka + "*";
        System.out.println(gwiazdka);

        return gwiazdka;
    }

}
