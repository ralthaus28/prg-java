/**
 * ----------------------------------------
 *  File Name:  aufgabe4.java
 *  Author:     Reto Althaus
 *  Created:    18-02-2026
 * ----------------------------------------
 */

import java.util.Scanner;

public class aufgabe4 {
    public static void main ( String [] args ) {
        // Variablen
        double guthaben;
        double zinsSatz = 1.5;
        double guthabenMitZinsen;
        // Eingabe
        Scanner sc = new Scanner(System.in);
        System.out.print(" Geben Sie ein Guthaben ein: ");
        guthaben = sc.nextDouble();
        // Verarbeitung
        guthabenMitZinsen = guthaben * (1 + zinsSatz / 100);
        // Ausgabe
        System.out.println("Guthaben nach einem Jahr: " + guthabenMitZinsen);

        /**
         * Was macht das Programm?
         *      Guthaben eines Kontos nach einem Jahr
         *
         * Der Wert für Zinssatz ist fest kodiert Was hat das für eine Folge für das Programm?
         *      Hardcoded = nicht flexibel
         *      Änderung des Zinssatzes = Änderung des Sourcecodes
         */
    }
}
