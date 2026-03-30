/**
 * ----------------------------------------
 *  File Name:  Aufgabe4.java
 *  Author:     Reto Althaus
 *  Created:    30-03-2026
 * ----------------------------------------
 */

/**
 * Wie sehen die Zustände der beiden Lampe-Instanzen nach deren Erstellungi
 * und Initialisierung aus?
 *
 * Beide Schalter sind nach der Initialisierung zunächst ausgeschaltet
 * (eingeschaltet = false), da der boolesche Default-Wert in Java false ist
 *
 *
 * Sind die Zustände der beiden Lampe-Instanzen nach deren Erstellung
 * und Initialisierung gleich oder unterschiedlich? Begründen Sie Ihre Antwort
 *
 * Die Zustände sind unterschiedlich
 * Beide Lampen haben verschiedene Werte für spannung, leistung und fassungTyp
 * Auch ihre Schalter sind zwar beide im gleichen Default-Zustand (false),
 * aber es handelt sich um zwei separate Schalter-Instanzen -
 * also zwei eigenständige Objekte im Heap
 *
 *
 * Wie sieht es mit Verhalten der beiden Lampe-Instanzen aus? Verhalten sich die
 * beiden Lampe-Instanzen gleich oder unterschiedlich? Woran ist dies zu erkennen
 *
 * Das Verhalten ist bei beiden Instanzen gleich,
 * da sie von derselben Klasse abstammen
 *
 * Wir gehen davon aus, dass die beiden Lampen mit unterschiedlichen
 * Schalter-Instanzen versehen wurden, womit wir auch zwei unterschiedliche
 * Schalter-Instanzen haben
 * Wie sieht es mit Zuständen der beiden
 * Schalter-Instanzen nach der Programmausführung2 aus? Gleich oder unterschiedlich?
 *
 * Die zustände der beiden Schalter-Instanzen sind unterschiedlich, 
 * da es sich um zwei separate Objekte handelt, 
 * die unabhängig voneinander ihren Zustand ändern können
 */
