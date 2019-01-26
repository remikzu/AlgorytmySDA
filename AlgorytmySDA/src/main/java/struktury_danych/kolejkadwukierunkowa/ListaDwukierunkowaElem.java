package struktury_danych.kolejkadwukierunkowa;

public class ListaDwukierunkowaElem {

    private int value;
    private ListaDwukierunkowaElem next;
    private ListaDwukierunkowaElem previous;

    public ListaDwukierunkowaElem(int value) {
        this.value = value;
    }

    public ListaDwukierunkowaElem(int value, ListaDwukierunkowaElem next, ListaDwukierunkowaElem previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListaDwukierunkowaElem getNext() {
        return next;
    }

    public void setNext(ListaDwukierunkowaElem next) {
        this.next = next;
    }

    public ListaDwukierunkowaElem getPrevious() {
        return previous;
    }

    public void setPrevious(ListaDwukierunkowaElem previous) {
        this.previous = previous;
    }
}
