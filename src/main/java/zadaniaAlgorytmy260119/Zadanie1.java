package zadaniaAlgorytmy260119;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//1. Stwórz tablicę intów i wypełnij ją wartościami.
// Sprawdź czy elementy w tablicy są posortowane niemalejąco. Zwróć true, jeżeli prawda, wpp. false.
//2. Stwórz tablicę intów o wielkości podanej przez użytkownika.
//Wypełnij ją wartościami losowymi, a następnie wypisz wszystkie elementy.
//3. Podaj dwie tablice intów o takim samym rozmiarze,
//        zsumuj wartości na tych samych indeksach i wynik zwróć w nowej tablicy.
//4(*)Podaj dwie tablice intów o różnym rozmiarze,
//        zsumuj wartości na tych samych indeksach i wynik zwróć w nowej tablicy.
//5(*)Stwórz tablicę intów, wypełnij ją wartościami,
//        wypisz ile elementów jest mniejszych, a ile większych od średniej.
public class Zadanie1 {

    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    public static boolean ifSortedFromLower (int[] tab) {
        boolean isSorted = false;
        for (int i = 0; i < tab.length-1; i++) {
            if (tab[i+1] >= tab[i]) {
                isSorted = true;
            }
            else isSorted = false;
        }
        return isSorted;
    }

    public static void showElements () {
        System.out.println("Podaj liczbę elementów");
        int count = sc.nextInt();
        int[] tab = new int[count];
        for (int i = 0; i < count; i++) {
            tab[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(tab));
    }

    public static int[] sumOfElements(int[] tab, int[] tab2) {
        if (tab.length != tab2.length)
        {
            throw new IllegalArgumentException("Tablice nie są jednakowego rozmiaru!");
        }
        int[] sum = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            sum[i] = tab[i] + tab2[i];
        }

        return sum;
    }

    public static int[] sumOfDifferentArrayLengthElemenets (int[] tab, int[] tab2) {
        int length = 0;
        if (tab.length > tab2.length) {
            length = tab2.length;
        }
        else length = tab.length;
        int[] sum = new int[length];

        for (int i = 0; i < length; i++) {
            sum[i] = tab[i] + tab2[i];
        }

        return sum;
    }

    public static void howManyBiggerOrLowerElements (int[] tab) {
        int lowerCount = 0;
        int biggerCount = 0;
        int sum = 0;
        int average = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        average = sum / tab.length;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > average)
                biggerCount++;
        }

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < average)
                lowerCount++;
        }

        System.out.println("Elementów większych niż średnia jest: " + biggerCount +
                "\n" + "Elementów mniejszych niż średnia jest: " + lowerCount);
    }

    public static void main(String[] args) {

        int[] tab = {1, 2, 3, 4, 5, 246, 234, 5, 2345, 2345, 3245, 435};
        int[] tab2 = {2, 3, 4, 4, 5};
        int[] tab3 = {1, 2, 3};
        int[] tab4 = {1, 2, 3, 4, 5};
        System.out.println("Zadanie 1:");
        System.out.println("Czy postortowane: " + ifSortedFromLower(tab));
        System.out.println("Czy postortowane: " + ifSortedFromLower(tab2));

        System.out.println("Zadanie 2:");
        showElements();
        System.out.println("Zadanie 3:");
        System.out.println(Arrays.toString(sumOfElements(tab4, tab2)));
        System.out.println("Zadanie 4:");
        System.out.println(Arrays.toString(sumOfDifferentArrayLengthElemenets(tab2, tab3)));
        System.out.println("Zadanie 5:");
        howManyBiggerOrLowerElements(tab);

    }

}
