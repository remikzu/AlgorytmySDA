public class Zadanie1 {

//Dana jest tablica liczb calkowitych. Wypisz:
//i wszystkie liczby od końca będące na parzystych indeksach
// sumę tylko tych liczb podzielnych przez 3
// wynik sumy 5 poczatkowych liczb i odejmując ostatni element, zakłądając, że tablica jest rozmiaru co najmniej 6


    static void evenReversed (int tab[]) {
        for (int i = tab.length; i > 0; i--) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
    }

    static int sumDividedBy3 (int tab[]) {
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]%3 == 0) {
                sum+=tab[i];
            }
        }
        return sum;
    }

    static int sumOfFirst5 (int tab[]) {
        int sum = 0;
        if (tab.length < 6) throw new IllegalArgumentException("Tablica za malego rozmiaru!");
        else {
            for (int i = 0; i < 5; i++) {
                sum += tab[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        evenReversed(tab);
        System.out.println(sumDividedBy3(tab));
        System.out.println(sumOfFirst5(tab));


    }

}
