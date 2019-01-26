package struktury_danych.kolejkadwukierunkowa;

public class ListaDwukierunkowaLista {

    private ListaDwukierunkowaElem first;
    private ListaDwukierunkowaElem last;

    public ListaDwukierunkowaLista() {
        first = last = null;
    }

    public void addFirst(int value) {
        ListaDwukierunkowaElem elem = new ListaDwukierunkowaElem(value);

        if (first == null) {
            first = last = elem; //w kolejce jak jest jeden element to jest on pierwszym i ostatnim
        } else {
            elem.setNext(first);
            first.setPrevious(elem);
            first = elem;
        }
    }

    public void addLast(int value) {
        ListaDwukierunkowaElem elem = new ListaDwukierunkowaElem(value);

        if (last == null) {
            first = last = elem;
        } else {
            elem.setPrevious(last); //przypisanie poprzedniego obiektu
            last.setNext(elem);
            last = elem;
        }
    }

    public int peekFirst() throws KolejkaLista2KierOutOfIndex {
        if (isEmpty()) {
            throw new KolejkaLista2KierOutOfIndex("Lista jest pusta!");
        }
        return first.getValue();
    }

    public int peekLast() throws KolejkaLista2KierOutOfIndex {
        if (isEmpty()) {
            throw new KolejkaLista2KierOutOfIndex("Lista jest pusta!");
        }
        return last.getValue();
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int pollFirst() throws KolejkaLista2KierOutOfIndex {
        if (isEmpty()) {
            throw new KolejkaLista2KierOutOfIndex("Lista jest pusta!");
        }
        int value = first.getValue();

        if (first.getNext() == null) {
            first = last = null;
        } else {
            first = first.getNext();
            first.setPrevious(null);
        }

        return value;
    }

    public int pollLast() throws KolejkaLista2KierOutOfIndex {
        if (isEmpty()) {
            throw new KolejkaLista2KierOutOfIndex("Lista jest pusta!");
        }
        int value = last.getValue();

        if (last.getPrevious() == null) {
            first = last = null;
        } else {
            last = last.getPrevious();
            last.setNext(null);
        }

        return value;
    }

    public void printFromStart() {
        ListaDwukierunkowaElem firstTmp = first;
        while (firstTmp != null) {
            System.out.print(firstTmp.getValue() + " ");
            firstTmp = firstTmp.getNext();
        }
        System.out.println();
    }

    public void printFromLast() {
        ListaDwukierunkowaElem lastTmp = last;
        while (lastTmp != null) {
            System.out.print(lastTmp.getValue() + " ");
            lastTmp = lastTmp.getPrevious();
        }
        System.out.println();
    }

}
