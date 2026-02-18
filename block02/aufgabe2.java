/**
 * ----------------------------------------
 *  File Name:  aufgabe2.java
 *  Author:     Reto Althaus
 *  Created:    18-02-2026
 * ----------------------------------------
 */

import java.util.Scanner;

void main()
{
    Scanner sc = new Scanner(System.in);

    System.out.print("Maschinenleistung (Stück pro Stunde): ");
    double maschinenleistung = sc.nextDouble();
    System.out.print("Maschinenkosten (CHF pro Stunde): ");
    double maschinenkosten = sc.nextDouble();
    System.out.print("Lohnkosten (CHF pro Stunde): ");
    double lohnkosten = sc.nextDouble();
    System.out.print("Auftragskosten (Fixkosten pro Auftrag): ");
    double auftragskosten = sc.nextDouble();
    System.out.print("Menge der zu produzierenden Einheiten: ");
    double stückzahl = sc.nextDouble();

    double zeitlicherAufwand = stückzahl / maschinenleistung;
    System.out.printf("\nDer zeitliche Aufwand beträgt: %.2fh\n", zeitlicherAufwand);

    /**
     * Algorithmus für das Berechnen der Produktionskosten:
     * Gesamte stündlichen Kosten berechnen
     * - Maschinenkosten
     * - Lohnkosten
     * Produktionskosten berechnen (stündliche Kosten * zeitlicher Aufwand + Auftragsfixkosten)
     */

    double stündlicheKosten = maschinenkosten + lohnkosten;
    double produktionskosten = stündlicheKosten * zeitlicherAufwand + auftragskosten;

    produktionskosten += stückzahl < 100 ? produktionskosten * 0.2 : stückzahl >= 1000 ? - produktionskosten * 0.05 : 0;

    System.out.printf("\nDie Produktionskosten betragen: CHF %.2f\n", produktionskosten);
}
