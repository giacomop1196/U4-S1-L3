package es_2;

public class Esercizio2 {
    public static void main(String[] args) {
        Sim simUtente = new Sim("+393331234567");

        System.out.println("Creazione di una nuova SIM:");
        simUtente.stampaDatiSim();

        // Simuliamo alcune chiamate per dimostrare il funzionamento
        simUtente.aggiungiChiamata(new Chiamata(5, "+393456789012"));
        simUtente.aggiungiChiamata(new Chiamata(2, "+393210987654"));
        simUtente.aggiungiChiamata(new Chiamata(12, "+393451122334"));

        System.out.println("\nDopo aver effettuato 3 chiamate:");
        simUtente.stampaDatiSim();

        // Aggiungiamo altre chiamate per mostrare il limite di 5
        simUtente.aggiungiChiamata(new Chiamata(3, "+393339876543"));
        simUtente.aggiungiChiamata(new Chiamata(8, "+393481234567"));
        simUtente.aggiungiChiamata(new Chiamata(1, "+393290001112"));

        System.out.println("\nDopo aver effettuato altre 3 chiamate (la lista ne mantiene solo 5):");
        simUtente.stampaDatiSim();
    }
}