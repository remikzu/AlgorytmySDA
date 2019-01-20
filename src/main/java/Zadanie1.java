public class Zadanie1 {

//Dana jest tablica liczb calkowitych. Wypisz:
//i wszystkie liczby od końca będące na parzystych indeksach
// sumę tylko tych liczb podzielnych przez 3
// wynik sumy 5 poczatkowych liczb i odejmując ostatni element, zakłądając, że tablica jest rozmiaru co najmniej 6


    static void evenReversed (int tab[]) {
        for (int i = tab.length-1; i >= 0; i--) {
            if (i%2 == 0) {
                System.out.println(tab[i]);
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
        int[] tab2 = {11, 122, 1231, 31231, 23123, 1, 23, 123, 1321};
        int[] tab3 = {2, 1, 2, 3, 4};
        System.out.println("Metoda 1:");
        evenReversed(tab);
        System.out.println("Metoda 2:");
        System.out.println(sumDividedBy3(tab));
        System.out.println("Metoda 3:");
        System.out.println(sumOfFirst5(tab3));

    }

}
