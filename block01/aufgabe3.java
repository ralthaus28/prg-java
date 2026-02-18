/**
 * ----------------------------------------
 *  File Name:  aufgabe3.java
 *  Author:     Reto Althaus
 *  Created:    18-02-2026
 * ----------------------------------------
 */

public class aufgabe3 {
    public static void main ( String [] args ) {
        // Variablen
        double guthaben = 1000;
        double zinsSatz = 3;
        double guthabenMitZinsen;
        // Verarbeitung
        guthabenMitZinsen = guthaben * (1 + zinsSatz / 100);
        // Ausgabe
        System.out.println(guthabenMitZinsen);
    }
}
