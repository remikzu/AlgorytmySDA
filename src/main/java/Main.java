import struktury_danych.StosTab;
import struktury_danych.Tablice;

import java.util.Scanner;

public class Main {

    public static void wywolajTablice() {
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

    public static void wywolajStosTab() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj rozmiar stosu:");
        int size = scanner.nextInt();
        StosTab stosTab = new StosTab(size);

        while (true) {
            System.out.println("Podaj operację:" +
                    "1. push()" +
                    "2. pop() " +
                    "3. peek()" +
                    "4. print()" +
                    "0. wyjście");

            int num = scanner.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Podaj wartość:");
                    int value = scanner.nextInt();

                    try {
                        stosTab.push(value);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println(stosTab.pop());
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println(stosTab.peek());
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                        stosTab.print();
                    break;
                case 0:
                    return;
            }
        }
    }


    public static void main(String[] args) {

//        wywolajTablice();
        wywolajStosTab();

    }

}
