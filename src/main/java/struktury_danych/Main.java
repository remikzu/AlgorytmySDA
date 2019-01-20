package struktury_danych;

public class Main {



    public static void main(String[] args) {

        Tablice tablica = new Tablice();

        int[] tab = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] tab2 = {11, 122, 1231, 31231, 23123, 1, 23, 123, 1321};
        int[] tab3 = {2, 1, 2, 3, 4};
        System.out.println("Metoda 1:");
        tablica.showEvenReversed(tab);
        System.out.println("Metoda 2:");
        System.out.println(tablica.sumDividedBy3(tab));
        System.out.println("Metoda 3:");
        System.out.println(tablica.sumOfFirst5(tab));

    }

}
