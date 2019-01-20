package struktury_danych;

public class Tablice {

//Dana jest tablica liczb calkowitych. Wypisz:
//i wszystkie liczby od końca będące na parzystych indeksach
// sumę tylko tych liczb podzielnych przez 3
// wynik sumy 5 poczatkowych liczb i odejmując ostatni element, zakłądając, że tablica jest rozmiaru co najmniej 6


    void showEvenReversed(int tab[]) {
        for (int i = tab.length-1; i >= 0; i--) {
            if (i%2 == 0) {
                System.out.println(tab[i]);
            }
        }
    }

    int sumDividedBy3(int tab[]) {
        int sum = 0;
        for (int e : tab) {
            if (e % 3 == 0) {
                sum += e;
            }
        }
        return sum;
    }

    int sumOfFirst5(int tab[]) {
        int sum = 0;
        if (tab.length < 6) throw new ArrayIndexOutOfBoundsException("Tablica za malego rozmiaru!");
        else {
            for (int i = 0; i < 5; i++) {
                sum += tab[i];
            }
        }
        return sum - tab[tab.length-1];
    }
}
