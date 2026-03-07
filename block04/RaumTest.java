/**
 * ----------------------------------------
 *  File Name:  RaumTest.java
 *  Author:     Reto Althaus
 *  Created:    27-02-2026
 * ----------------------------------------
 */

public class RaumTest {
    public static void main(String[] args) {
        Raum raumA = new Raum();
        Raum raumB = new Raum();

        System.out.println("Raum A Werte:");
        System.out.println("Name: " + raumA.raumBezeichnung);
        System.out.println("Plätze: " + raumA.anzahlPlaetze);
        System.out.println("Klimatisiert: " + raumA.klimatisiert);
        System.out.println("\nRaum B Werte:");
        System.out.println("Name: " + raumB.raumBezeichnung);
        System.out.println("Plätze: " + raumB.anzahlPlaetze);
        System.out.println("Klimatisiert: " + raumB.klimatisiert);

        raumB.raumBezeichnung = "Raum B";
        raumB.anzahlPlaetze = 30;
        raumB.klimatisiert = true;

        System.out.println("\nUngeänderte Raum A Werte:");
        System.out.println("Name: " + raumA.raumBezeichnung);
        System.out.println("Plätze: " + raumA.anzahlPlaetze);
        System.out.println("Klimatisiert: " + raumA.klimatisiert);
        System.out.println("\nGeänderte Raum B Werte:");
        System.out.println("Name: " + raumB.raumBezeichnung);
        System.out.println("Plätze: " + raumB.anzahlPlaetze);
        System.out.println("Klimatisiert: " + raumB.klimatisiert);
    }
}
