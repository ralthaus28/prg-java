/**
 * ----------------------------------------
 *  File Name:  Aufgabe3.java
 *  Author:     Reto Althaus
 *  Created:    24-03-2026
 * ----------------------------------------
 */

/**
 * Sehen Sie sich anschliessend die Methoden ein und aus an und beantworten Sie folgende Fragen:
 * Handelt es sich bei diesen Methoden um Instanz- oder Klassenmethoden?
 *
 * ein und aus sind Instanzmethoden da sie nicht static sind und
 * auf ein Instanzattribut zugreifen
 *
 *
 * Wenn es Instanzmethoden sind, hätte man sie auch als Klassenmethoden
 * implementieren können? Und auch umgekehrt?
 *
 * Nein, es muss eine Instanzmethode sein da wir private attribute von instanzen
 * verändern wollen
 * Klassenmethoden gehören der Klasse und nicht einer Instanz
 *
 */

class Schalter {
    private boolean eingeschaltet;

    public void ein () {
        if (! eingeschaltet ) {
            eingeschaltet = true;
        }
    }

    public void aus() {
        if ( eingeschaltet ){
            eingeschaltet = false;
        }
    }

    public boolean isEingeschaltet() {
        return eingeschaltet;
    }
}
