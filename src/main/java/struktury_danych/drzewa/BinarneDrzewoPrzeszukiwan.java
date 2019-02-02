package struktury_danych.drzewa;

public class BinarneDrzewoPrzeszukiwan {

    private Wezel korzen;

    public BinarneDrzewoPrzeszukiwan() {
        korzen = null;
    }

    public void dodaj(int wartosc) {
        korzen = dodajRekurencyjnie(korzen, wartosc);
    }

    public boolean znajdz(int wartosc) {
        return znajdujeRekurencyjnie(korzen, wartosc);
    }

    public void usun(int wartosc) {
        korzen = usunRekurencyjnie(korzen, wartosc);
    }

    private Wezel dodajRekurencyjnie (Wezel obecny, int wartosc) {
        if (obecny == null) {
            return new Wezel(wartosc);
        }

        if (wartosc < obecny.getWartosc()) {
            obecny.setLewy(dodajRekurencyjnie(obecny.getLewy(), wartosc));
        }
        else if (wartosc > obecny.getWartosc()){
            obecny.setPrawy(dodajRekurencyjnie(obecny.getPrawy(), wartosc));
        }

        return obecny;
    }

    private boolean znajdujeRekurencyjnie (Wezel obecny, int wartosc) {
        if (obecny == null) {
            return false;
        }

        if (wartosc == obecny.getWartosc()) {
            return true;
        } else if (wartosc < obecny.getWartosc()) {
            return znajdujeRekurencyjnie(obecny.getLewy(), wartosc);
        } else if (wartosc > obecny.getWartosc()) {
            return znajdujeRekurencyjnie(obecny.getPrawy(), wartosc);
        }

        return false;
    }

    private Wezel usunRekurencyjnie (Wezel obecny, int wartosc) {
        if (obecny == null) {
            return null;
        }

        if (wartosc == obecny.getWartosc()) {
            if (obecny.getLewy() == null && obecny.getPrawy() == null) {
                return null;
            } else if (obecny.getLewy() != null && obecny.getPrawy() == null) {
                return obecny.getLewy();
            } else if (obecny.getPrawy() != null && obecny.getLewy() == null) {
                return obecny.getPrawy();
            } else if (obecny.getPrawy() != null && obecny.getLewy() != null) {
                int wartoscMinimumPoddrzewa = znajdzWartoscMinimum(obecny.getPrawy());
                obecny.setWartosc(wartoscMinimumPoddrzewa);
                obecny.setPrawy(usunRekurencyjnie(obecny.getPrawy(), wartoscMinimumPoddrzewa));
            }
        } else if (wartosc < obecny.getWartosc()) {
            obecny.setLewy(usunRekurencyjnie(obecny.getLewy(), wartosc));
        } else if (wartosc > obecny.getWartosc()) {
            obecny.setPrawy(usunRekurencyjnie(obecny.getPrawy(), wartosc));
        }

        return obecny;
    }

    private int znajdzWartoscMinimum (Wezel obecny) {
        while(obecny.getLewy() != null ) {
            obecny = obecny.getLewy();
        }
        return obecny.getWartosc();
    }

}
