package struktury_danych.algorytmy;

import struktury_danych.stos.StosLista;
import struktury_danych.stos.StosListaOutOfIndex;

public class ONP {

    public ONP() {

    }

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
                        count = valueFirstElement + valueSecondElement;
                        break;
                    case "-":
                        break;
                    case "*":
                        break;
                    case "/":
                        break;
                }
            }
        }
    }

}
