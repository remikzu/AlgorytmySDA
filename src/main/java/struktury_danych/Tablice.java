package struktury_danych;

public class Tablice {

//Dana jest tablica liczb calkowitych. Wypisz:
//i wszystkie liczby od końca będące na parzystych indeksach
// sumę tylko tych liczb podzielnych przez 3
// wynik sumy 5 poczatkowych liczb i odejmując ostatni element, zakłądając, że tablica jest rozmiaru co najmniej 6


    public static void showEvenReversed(int tab[]) {
        for (int i = tab.length-1; i >= 0; i--) {
            if (i%2 == 0) {
                System.out.println(tab[i]);
            }
        }
    }

    public static int sumDividedBy3 (int tab[]) {
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]%3 == 0) {
                sum+=tab[i];
            }
        }
        return sum;
    }

    public static int sumOfFirst5 (int tab[]) {
        int sum = 0;
        if (tab.length < 6) throw new IllegalArgumentException("Tablica za malego rozmiaru!");
        else {
            for (int i = 0; i < 5; i++) {
                sum += tab[i];
            }
        }
        return sum;
    }
}
