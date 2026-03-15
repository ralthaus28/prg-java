/**
 * ----------------------------------------
 *  File Name:  Aufgabe1ASS.java
 *  Author:     Reto Althaus
 *  Created:    15-03-2026
 * ----------------------------------------
 */

// KV: Klassenvariabel
// KM: Klassenmethode
// OV: Objektvariabel
// OM: Objektmethode
// LV: Lokale Variabel
// LM: Lokale Methode
//
// K: Sichtbar in Klasse
// M: Sichtbar in Methode
// B: Sichtbar in Block
//
// KL: Beim Laden der Klasse erstellt
// KI: Beim Instanzieren der Klasse erstellt
// MA: Beim Methodenaufruf erstellt
//
// LK: Lebt solange wie die Klasse lebt
// LI: Lebt solange wie die Instanz lebt
// LM: Lebt solange wie die Methode läuft
// LB: Lebt bis zum ende des Blocks

public class Rechner {
    private static int gesamt; // A KV K KL LK
    private int basis; // B OV K KI LI

    public Rechner(int start) { // C OM K KI LI
        basis = start; // D OV M MA LI
        gesamt++; // E KV M KL LK
    }

    public int addiere(int wert) { // F OM K KI LI
        int temp = basis + wert; // G LV M MA LM
        basis = temp; // H OV M KL LK
        return temp; // I LV M MA LM
    }

    public int multipliziere(int faktor) { // J OM K KI LI
        int ergebnis = basis * faktor; // K LV M MA LM
        return ergebnis; // L LV M MA LM
    }

    public static int anzahl() {
        int z = gesamt; // M LV M MA LM
        return z; // N LV M MA LM
    }
}

public class App {
    private static int zähler = 10; // O KV K KL LK

    public static void main(String[] args) { // P KM K KL LK
        Rechner r1 = new Rechner(5); // Q LV M MA LM
        Rechner r2 = new Rechner(7); // R LV M MA LM
        int a = r1.addiere(3); // S LV M MA LM
        int b = r2.multipliziere(2); // T LV M MA LM

        if (a > b) {
            int diff = a - b; // U LV B Bei eintritt in if erstellt LB
            System.out.println(diff); // V KM K KL LK
        }

        int n = Rechner.anzahl(); // W LV M MA LM
        System.out.println(n); // X KM K KL LK
    }
}
