/**
 * ----------------------------------------
 *  File Name:  aufgabe1.java
 *  Author:     Reto Althaus
 *  Created:    19-02-2026
 * ----------------------------------------
 */

import java.util.Scanner;

public class aufgabe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Startkapital eingeben: ");
        double startKapital = sc.nextDouble();

        System.out.print("Anzahl Jahre eingeben: ");
        double anzahlJahre = sc.nextDouble();

        // System.out.print("Zinssatz in Prozent eingeben: ");
        // double zinsSatzInProzent = sc.nextDouble();
        double zinsSatzInProzent = startKapital < 10000.00 ? 0.75 : startKapital > 100000.00 ? 0.25 : 0.5;

        /* Endkapital berechnen und ausgeben */
        double endKapital = startKapital * Math.pow((1 + zinsSatzInProzent / 100), anzahlJahre);
        System.out.println("\nZinssatz: " + zinsSatzInProzent);
        System.out.println("\nEndkapital: " + endKapital);
    }
}
