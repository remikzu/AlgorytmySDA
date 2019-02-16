import SPOJ.SUMREK;
import SPOJ.TrojkatRekurencyjnie;
import rekurencja.CiagFibonacciego;
import rekurencja.Silnia;
import struktury_danych.StosTab;
import struktury_danych.Tablice;
import struktury_danych.algorytmy.ONP;
import struktury_danych.algorytmy.dijkstra.Dijkstra;
import struktury_danych.drzewa.BinarneDrzewoPrzeszukiwan;
import struktury_danych.kolejka.KolejkaLista;
import struktury_danych.kolejkadwukierunkowa.ListaDwukierunkowaLista;
import struktury_danych.kolejkadwukierunkowa.ListaOutOfIndex;
import struktury_danych.kopiec.Kopiec;
import struktury_danych.stos.StosLista;
import struktury_danych.stos.StosListaOutOfIndex;
import zadaniaAlgorytmy260119.*;

import java.util.Arrays;
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

    public static void wywolajStosList() {
        StosLista stosLista = new StosLista();

        stosLista.push(1);
        stosLista.push(2);
        stosLista.push(3);

        stosLista.print();

        try {
            System.out.println("pop: " + stosLista.pop());
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace();
        }
        try {
            System.out.println("pop: " + stosLista.pop());
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace();
        }

        stosLista.push(4);
        stosLista.push(5);

        stosLista.print();

        try {
            System.out.println("peek: " + stosLista.peek());
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace();
        }
        try {
            System.out.println(stosLista.pop());
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace();
        }
        try {
            System.out.println("peek: " + stosLista.peek());
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace();
        }

        try {
            stosLista.pop();
            stosLista.pop();
            stosLista.pop();
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            System.out.println(stosListaOutOfIndex.getMessage());
        }

        stosLista.print();
    }

    public static void wywolajKolejkaLista() {
        KolejkaLista kolejkaLista = new KolejkaLista();

        kolejkaLista.add(1);
        kolejkaLista.add(2);
        kolejkaLista.add(3);

        kolejkaLista.print();

        System.out.println(kolejkaLista.poll());
        System.out.println(kolejkaLista.peek());
        System.out.println(kolejkaLista.poll());

        kolejkaLista.add(5);
        kolejkaLista.add(7);

        kolejkaLista.print();
    }

    public static void wywolajONP() {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] operations = input.split(" ");

        new ONP().run(operations);
    }

    public static void wywolajKolejkaDwukierunkowa() {

        ListaDwukierunkowaLista listaDwukierunkowaLista = new ListaDwukierunkowaLista();

        listaDwukierunkowaLista.addFirst(1);
        listaDwukierunkowaLista.addFirst(123);
        listaDwukierunkowaLista.addFirst(334);
        listaDwukierunkowaLista.addLast(22);
        listaDwukierunkowaLista.addLast(5324523);
        listaDwukierunkowaLista.printFromStart();
        int szukaj = 3;
        System.out.println("Czy znajduje się " + szukaj + ": " + listaDwukierunkowaLista.ifContain(szukaj));

        listaDwukierunkowaLista.delete(22);
        listaDwukierunkowaLista.printFromStart();
        System.out.println("===============");
        listaDwukierunkowaLista.printFromLast();

        try {
            System.out.println(listaDwukierunkowaLista.pollFirst());
        } catch (ListaOutOfIndex listaOutOfIndex) {
            listaOutOfIndex.printStackTrace();
        }
        try {
            System.out.println(listaDwukierunkowaLista.peekFirst());
        } catch (ListaOutOfIndex listaOutOfIndex) {
            listaOutOfIndex.printStackTrace();
        }
        try {
            System.out.println(listaDwukierunkowaLista.pollFirst());
        } catch (ListaOutOfIndex listaOutOfIndex) {
            listaOutOfIndex.printStackTrace();
        }

        listaDwukierunkowaLista.addLast(5);
        listaDwukierunkowaLista.addFirst(7);

        listaDwukierunkowaLista.printFromStart();
        System.out.println("================");
        listaDwukierunkowaLista.printFromLast();

    }

    public static void wywolajNWD() {
        NWD nwd = new NWD();
        long start;
        long stop;
        int a = 10002;
        int b = 4;

        start = System.nanoTime();
        nwd.przezOdejmowanie(a, b);
        stop = System.nanoTime();

        System.out.println("NWD odejmowanie: " + (stop-start));

        start = System.nanoTime();
        nwd.przezReszteZDzielenia(a, b);
        stop = System.nanoTime();

        System.out.println("NWD przez reszte: " + (stop-start));
    }

    public static void wywolajSitoEratostenesa() {
        SitoEratostenesa sito = new SitoEratostenesa();
        sito.stworzSito(100);
    }

    public static void wywolajSilnia() {
        Silnia silnia = new Silnia();
        silnia.rekurencyjnie(5);
    }

    public static void wywolajCiagFib() {
        CiagFibonacciego ciag = new CiagFibonacciego();
        System.out.println(ciag.obliczFib(10));
    }

    public static void wywolajSUMREK() {
        SUMREK suma = new SUMREK();

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 1; i <= test; i++) {
            int n = sc.nextInt();
            System.out.println(suma.sumaRekurencyjnie(n));
        }
    }

    public static void wywolajTrojkatRekurencyjnie() {
        TrojkatRekurencyjnie trojkat = new TrojkatRekurencyjnie();
        System.out.println(trojkat.rysujTrojkat(3));
    }

    public static void wywolajBST() {
        BinarneDrzewoPrzeszukiwan bst = new BinarneDrzewoPrzeszukiwan();
        bst.dodaj(5);
        bst.dodaj(2);
        bst.dodaj(7);
        bst.dodaj(10);
        bst.dodaj(3);
        bst.dodaj(6);
        bst.dodaj(15);
        bst.dodaj(21);
        bst.dodaj(1);
        bst.usun(1);
        bst.usun(7);
    }

    public static void wywolajKopiec() {
        int[] tab = new int[] {3, 8, 2, 6, 10, 7, 9, 15, 4, 18};
        Kopiec kopiec = new Kopiec();
        kopiec.run(tab);
        System.out.println(Arrays.toString(tab));
    }

    public static void main(String[] args) {

//        wywolajTablice();
//        wywolajStosTab();
//        wywolajStosList();
//        wywolajKolejkaLista();
//        wywolajONP();
//        wywolajKolejkaDwukierunkowa();
//        wywolajNWD();
//        wywolajSitoEratostenesa();
//        wywolajSilnia();
//        wywolajCiagFib();
////        wywolajBST();
////        Dijkstra.run();
//        wywolajKopiec();
//        wywolajSUMREK();
        wywolajTrojkatRekurencyjnie();
    }

}
