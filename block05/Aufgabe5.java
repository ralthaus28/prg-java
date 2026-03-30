/**
 * ----------------------------------------
 *  File Name:  Aufgabe5.java
 *  Author:     Reto Althaus
 *  Created:    30-03-2026
 * ----------------------------------------
 */

public class Aufgabe5 {
    public static void main(String[] args) {
        Buch[] bibliothek = new Buch[3];

        bibliothek[0] = new Buch("Der Alchimist", "Paulo Coelho", 1988, 1);
        bibliothek[1] = new Buch("Der Herr der Ringe", "J.R.R. Tolkien", 1954, 3);
        bibliothek[2] = new Buch("Die unendliche Geschichte", "Michael Ende", 1979, 2);

         for (Buch buch : bibliothek) {
             System.out.println("Buchnummer: " + buch.getBuchNummer());
             System.out.println("Titel: " + buch.getTitel());
             System.out.println("Autor: " + buch.getAutor());
             System.out.println("Erscheinungsjahr: " + buch.getErscheinungJahr());
             System.out.println("Auflage: " + buch.getAuflage());
             System.out.println();
         }
    }
}

class Buch {

    private int buchNummer;
    private String titel;
    private String autor;
    private int erscheinungJahr;
    private int auflage;

    private static int buchNummerCounter = 1;

    public Buch() {
        this.buchNummer = buchNummerCounter++;
    }

    public Buch(String titel, String autor, int erscheinungJahr, int auflage) {
        this.buchNummer = buchNummerCounter++;
        this.titel = titel;
        this.autor = autor;
        this.erscheinungJahr = erscheinungJahr;
        this.auflage = auflage;
    }


    public int getBuchNummer() {
        return this.buchNummer;
    }

    public String getTitel() {
        return this.titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getErscheinungJahr() {
        return this.erscheinungJahr;
    }

    public void setErscheinungJahr(int erscheinungJahr) {
        this.erscheinungJahr = erscheinungJahr;
    }

    public int getAuflage() {
        return this.auflage;
    }

    public void setAuflage(int auflage) {
        this.auflage = auflage;
    }

}
