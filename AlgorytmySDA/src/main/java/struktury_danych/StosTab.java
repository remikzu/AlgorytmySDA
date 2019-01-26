package struktury_danych;

public class StosTab {

    private int[] tab;

    private int top = -1; //jako że nic jeszcze nie ma to jest zdeklarowany jako -1

    public StosTab(int size) {
        tab = new int[size];
    }

    public void push(int value) throws ArrayIndexOutOfBoundsException{
//        top++; //top += 1; //zwiekszamy topa zeby indeks byl rowny 0
//        tab[top] = value; lub:
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("isFull moja wiadomość");
        }

        tab[++top] = value; //preinkrementacja, żeby najpierw go zwiększył
    }

    public int pop() throws ArrayIndexOutOfBoundsException{
/*        int value = tab[top];
        top--;
        return value; lub:*/
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("isEmpty moja wiadomość");
        }

        return tab[top--];
    }

/*    public boolean isEmpty() {
        if(top == -1) {
            return true;
        }
        else return false;
    } lub:*/

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top >= tab.length-1;
    }

    public int peek() throws ArrayIndexOutOfBoundsException{

        if(isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("isEmpty moja wiadomość");
        }

        return tab[top];
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

}
