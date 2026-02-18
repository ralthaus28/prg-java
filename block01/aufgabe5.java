/**
 * ----------------------------------------
 *  File Name:  aufgabe5.java
 *  Author:     Reto Althaus
 *  Created:    18-02-2026
 * ----------------------------------------
 */

import java.util.Scanner;

public class aufgabe5 {
    public static void main ( String [] args )
    {
        // Variablen
        double guthaben;
        double zinsSatz;
        double guthabenMitZinsen;
        double zinsen;

        // Eingabe
        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie ein Guthaben ein: ");
        guthaben = sc.nextDouble();
        System.out.print("Geben Sie den Zinssatz in % ein: ");
        zinsSatz = sc.nextDouble();

        // Verarbeitung
        zinsen = guthaben * (zinsSatz / 100);
        guthabenMitZinsen = guthaben + zinsen;

        // Ausgabe
        System.out.println("Zinsen im ersten Jahr: " + zinsen);
        System.out.println("Guthaben nach einem Jahr: " + guthabenMitZinsen);
    }
}
