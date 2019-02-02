package struktury_danych.drzewa;

public class Wezel {

    private int wartosc;
    private Wezel lewy;
    private Wezel prawy;

    public Wezel(int wartosc) {
        this.wartosc = wartosc;
        lewy = prawy = null;
    }

    public int getWartosc() {
        return wartosc;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }

    public Wezel getLewy() {
        return lewy;
    }

    public void setLewy(Wezel lewy) {
        this.lewy = lewy;
    }

    public Wezel getPrawy() {
        return prawy;
    }

    public void setPrawy(Wezel prawy) {
        this.prawy = prawy;
    }
}
