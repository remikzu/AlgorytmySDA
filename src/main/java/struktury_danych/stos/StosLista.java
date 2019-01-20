package struktury_danych.stos;

public class StosLista {

    private StosElem top;

    public StosLista() {
        top = null;
    }

    public void push(int value) {
//        StosElem newLast = new StosElem(value);
//        newLast.setPrev(top);
//        top = newLast;

        top = new StosElem(value,top);
    }

    public int pop() throws StosListaOutOfIndex {
        if (isEmpty()) {
            throw new StosListaOutOfIndex("Pusty stos!");
        }
        int value = top.getValue();
        top = top.getPrev();
        return value;
    }

    public int peek() throws StosListaOutOfIndex {
        if (isEmpty()) {
            throw new StosListaOutOfIndex("Pusty stos!");
        }
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void print() {
        StosElem tmpElem = top;
        while (tmpElem != null) {
            System.out.print(tmpElem.getValue() + " ");
            tmpElem = tmpElem.getPrev();
        }
        System.out.println();
    }
}
