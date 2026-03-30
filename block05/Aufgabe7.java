/**
 * ----------------------------------------
 *  File Name:  Aufgabe7.java
 *  Author:     Reto Althaus
 *  Created:    30-03-2026
 * ----------------------------------------
 */

/**
 * Teilaufgabe 1 - Java API Dokumentation der Klasse Buch
 *
 * Welche Klasse ist die direkte Oberklasse der Klasse Buch?
 *
 * Die direkte Oberklasse ist Object,
 * da jede Klasse in Java implizit von Object erbt
 *
 *
 * Wozu wurde die Klasse Buch erstellt und in welcher Version ist sie aktuell?
 *
 * Die Klasse Buch dient zur Abbildung eines Buches mit seinen Eigenschaften
 * wie Titel, Autor, Erscheinungsjahr und Auflage
 * Die aktuelle Version ist in der Javadoc ersichtlich (@version)
 *
 *
 * Welche Instanzvariablen sind in der Klasse Buch enthalten?
 *
 * buchNummer : int
 * titel      : String
 * autor      : String
 * erscheinungJahr : int
 * auflage    : int
 *
 *
 * Was kann anhand der API Dokumentation zu den Konstruktoren gesagt werden?
 *
 * Es gibt zwei Konstruktoren:
 * - Buch() : parameterloser Standardkonstruktor
 * - Buch(int, String, String, int, int) : parametrisierter Konstruktor
 *   zur vollständigen Initialisierung bei der Erstellung
 *
 *
 * Wie viele Methoden stehen zur Verfügung?
 *
 * Pro Instanzvariable je eine get- und set-Methode, also 10 eigene Methoden
 * Zusätzlich werden Methoden von Object vererbt (z.B toString, equals, hashCode)
 *
 *
 * Stellt die API Dokumentation alle nötigen Informationen bereit?
 *
 * Ja, sofern JavaDoc vollständig ist:
 * - Methodenname und Rückgabetyp
 * - Parameternamen und -typen (@param)
 * - Beschreibung des Rückgabewerts (@return)
 * - Kurzbeschreibung der Methode
 *
 *
 * Code zum Erstellen von zwei Buch-Instanzen und Ausgabe von Titel, ISBN, Auflage:
 *
 * Buch buch1 = new Buch();
 * buch1.setTitel("Deutsche Grammatik");
 * buch1.setAutor("Johan Weber");
 * buch1.setErscheinungJahr(2014);
 * buch1.setAuflage(1);
 *
 * Buch buch2 = new Buch(2, "Programmieren mit PHP", "Roland Walker", 2012, 3);
 *
 * System.out.println("Titel: " + buch1.getTitel());
 * System.out.println("Auflage: " + buch1.getAuflage());
 *
 *
 * Teilaufgabe 2 - JavaDoc generieren
 *
 * Lampe und Schalter mit JavaDoc-Kommentaren versehen (@author, @version, @param, @return)
 * Anschliessend Generierung via Terminal:
 *
 * javadoc -d javadoc Lampe.java Schalter.java -private -author -version
 *
 * oder für alle .java-Dateien im Verzeichnis:
 *
 * javadoc -d javadoc *.java -private -author -version
 *
 * Die generierte Dokumentation ist über javadoc/index.html aufrufbar
 */
