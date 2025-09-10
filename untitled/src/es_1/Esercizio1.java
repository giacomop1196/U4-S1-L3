package es_1;

public class Esercizio1 {

    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Area del rettangolo: " + r.calcolaArea());
        System.out.println("Perimetro del rettangolo: " + r.calcolaPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        double areaTotale = r1.calcolaArea() + r2.calcolaArea();
        double perimetroTotale = r1.calcolaPerimetro() + r2.calcolaPerimetro();

        System.out.println("Rettangolo 1:");
        stampaRettangolo(r1);
        System.out.println("\nRettangolo 2:");
        stampaRettangolo(r2);

        System.out.println("\nSomma delle aree: " + areaTotale);
        System.out.println("Somma dei perimetri: " + perimetroTotale);
    }

    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(10.0, 5.0);
        Rettangolo rettangolo2 = new Rettangolo(7.0, 3.5);

        System.out.println("--- Il primo rettangolo ---");
        stampaRettangolo(rettangolo1);

        System.out.println("\n--- I due rettangoli e le loro somme ---");
        stampaDueRettangoli(rettangolo1, rettangolo2);
    }
}