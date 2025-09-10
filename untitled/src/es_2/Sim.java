package es_2;

import java.util.ArrayList;
import java.util.List;

public class Sim {
    private String numeroTelefono;
    private double creditoDisponibile;
    private List<Chiamata> ultime5Chiamate;

    public Sim(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.creditoDisponibile = 0.0;
        this.ultime5Chiamate = new ArrayList<>();
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public double getCreditoDisponibile() {
        return creditoDisponibile;
    }

    // Metodo per aggiungere una chiamata, mantenendo solo le ultime 5
    public void aggiungiChiamata(Chiamata chiamata) {
        this.ultime5Chiamate.add(0, chiamata);
        if (this.ultime5Chiamate.size() > 5) {
            this.ultime5Chiamate.remove(5);
        }
    }

    public void stampaDatiSim() {
        System.out.println("--- Dati della SIM ---");
        System.out.println("Numero di telefono: " + this.numeroTelefono);
        System.out.println("Credito disponibile: " + String.format("%.2f", this.creditoDisponibile) + "€");
        System.out.println("Ultime 5 chiamate effettuate:");

        if (this.ultime5Chiamate.isEmpty()) {
            System.out.println("Nessuna chiamata registrata.");
        } else {
            for (Chiamata c : this.ultime5Chiamate) {
                System.out.println("  - Numero: " + c.getNumeroChiamato() + ", Durata: " + c.getDurataMinuti() + " minuti");
            }
        }
    }
}