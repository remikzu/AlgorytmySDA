package struktury_danych.kolejka;

public class KolejkaLista {

    private KolejkaElem first;
    private KolejkaElem last;

    public KolejkaLista() {
        first = last = null;
    }

    public void add(int value) {
        KolejkaElem elem = new KolejkaElem(value, null);

        if (first == null) {
            first = last = elem; //w kolejce jak jest jeden element to jest on pierwszym i ostatnim
        } else {
            last.setNext(elem);
            last = elem;
        }
    }

    public int poll() {
        if (isEmpty()) {
            //TODO exception
        }
        int value = first.getValue();

        if (first.getNext() == null) {
            first = last = null;
        } else {
            first = first.getNext();
        }

        return value;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int peek() {
        if (isEmpty()) {
            //TODO exception
        }

        return first.getValue();
    }

    public void print() {
        KolejkaElem tmpElem = first;
        while (tmpElem != null) {
            System.out.print(tmpElem.getValue() + " ");
            tmpElem = tmpElem.getNext();
        }
        System.out.println();
    }
}
