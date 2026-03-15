/**
 * ----------------------------------------
 *  File Name:  Aufgabe3.java
 *  Author:     Reto Althaus
 *  Created:    15-03-2026
 * ----------------------------------------
 */

public class Aufgabe3 {

    // Um was für Methoden handelt es sich bei den Methoden,
    // die Sie implementiert haben?
    //
    // Überladene Methoden da es mit dem gleichen Methodennamen
    // merere verschiedene Methoden gibt die aufgerufen werden
    //
    //
    // Wie erkennt der Compiler, welche Methode beim Aufruf gemeint ist?
    // 
    // Anhand der Übergabevariablen
    //
    //
    // Haben Sie die obigen Methoden als Instanzmethoden oder Klassenmethoden
    // implementiert? Was könnte in diesem Kontext einen guten Hinweis liefern?
    //
    // Es sind Klassenmethoden da sie mit dem Klassennamen aufgerufen werden
    // und nicht über eine Instanz der Klasse
    //
    //
    // Wie kann einem Methodenaufruf der Name der zu implementierenden
    // Methode entnommen werden?
    //
    // Anhand der Übergabevariablen (wenn z.B. ein Radius übergeben wird, wird
    // es warscheinlich ein Kreis sein der zu berechnen ist)
    //
    //
    // Wie kann einem Methodenaufruf der Typ der Methode (Typ des Rückgabewertes
    // der Methode) entnommen werden?
    //
    // Anhand des Datentypes der variabel, in der das Resultat gespeichert wird
    //
    //
    // Wie kann einem Methodenaufruf die Parameterliste der Methode entnommen werden?
    //
    // Anhand der Datentypen die beim Aufruf übergeben werden.
    //
    //
    // Kann der Typ von Parametern in der Parameterliste der zu implementierenden
    // Methode immer absolut eindeutig bestimmt werden?
    //
    // Nein, es kann durch Typenumwandlung zu Problemen kommen
    // 
    //
    // Kann der Typ der zu implementierenden Methode dem Methodenaufruf immer
    // absolut eindeutig bestimmt werden?
    //
    // Nein, es kann auch durch Typenumwandlung zu Problemen kommen

    public static void main(String[] args) {

        /* Radius */
        double radius = 5;

        /* Seitenlaenge eines Quadrats */
        int seiteLaenge = 10;

        /* Breite und Hoehe eines Rechteck */
        int breite = 25;
        int hoehe = 4;

        /* Kriesflaeche berechnen */
        double flaecheKreis = Aufgabe3.berechneFlaeche(radius);

        /* Qudratflaeche berechnen */
        double flaecheQuadrat = Aufgabe3.berechneFlaeche(seiteLaenge);

        /* Rechteckflaeche berechnen */
        long flaecheRechteck = Aufgabe3.berechneFlaeche(breite, hoehe);

        /* Ausgaben */
        System.out.printf(" Kreisflaeche : %8.2f\n", flaecheKreis);
        System.out.printf(" Quadratflaeche : %8.2f\n", flaecheQuadrat);
        System.out.println(" Rechteckflaeche : " + flaecheRechteck);
    }

    private static double berechneFlaeche(double r){
        return r * r * Math.PI;
    }

    private static double berechneFlaeche(int a){
        return a * a;
    }

    private static long berechneFlaeche(int a, int b){
        return a * b;
    }
}
