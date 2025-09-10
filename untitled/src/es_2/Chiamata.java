package es_2;

public class Chiamata {
    private int durataMinuti;
    private String numeroChiamato;

    public Chiamata(int durataMinuti, String numeroChiamato) {
        this.durataMinuti = durataMinuti;
        this.numeroChiamato = numeroChiamato;
    }

    public int getDurataMinuti() {
        return durataMinuti;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }
}