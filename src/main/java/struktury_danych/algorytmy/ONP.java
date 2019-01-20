package struktury_danych.algorytmy;

import struktury_danych.stos.StosLista;
import struktury_danych.stos.StosListaOutOfIndex;

public class ONP {

//    public ONP() { // <- pusty konstruktor, teoretycznie nie potrzebny bo Java to robi za nas
//
//    }

    public void run(String[] tab) {
        StosLista stosLista = new StosLista();
        for (String e : tab) {
            try {
                int value = Integer.parseInt(e);
                stosLista.push(value);
            } catch (NumberFormatException ex) {
                int valueFirstElement = 0;
                int valueSecondElement = 0;

                try {
                    valueFirstElement = stosLista.pop(); //drugi dodany argument
                    valueSecondElement = stosLista.pop(); //pierwszy dodany argument
                } catch (StosListaOutOfIndex stosListaOutOfIndex) {
                    stosListaOutOfIndex.printStackTrace();
                }

                int count = 0;
                switch (e) {
                    case "+":
                        count = valueSecondElement + valueFirstElement;
                        break;
                    case "-":
                        count = valueSecondElement - valueFirstElement;
                        break;
                    case "*":
                        count = valueSecondElement * valueFirstElement;
                        break;
                    case "/":
                        count = valueSecondElement / valueFirstElement;
                        break;
                }

                stosLista.push(count);
            }
        }

        try {
            int result = stosLista.pop();
            System.out.println("Wynik: " + result);
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace();
        }
    }

}
