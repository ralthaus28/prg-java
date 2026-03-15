/**
 * ----------------------------------------
 *  File Name:  Aufgabe2.java
 *  Author:     Reto Althaus
 *  Created:    10-03-2026
 * ----------------------------------------
 */


 // Woran wird eine Klassenmethode erkannt?
 //
 // Klassenmethoden sind Methoden welche in der Klasse selbst oder über die
 // Klasse aufgerufen werden.
 //
 //
 // Wie wird eine Klassenmethode üblicherweise aufgerufen?
 //
 // Eine Klassenmethode wird entweder in der Klasse selbst oder über die
 // Klasse aufgerufen und nicht über die Instanz einer Klasse.
 //
 //
 // An Hand von was kann gesagt werden, ob die return-Anweisung
 // nötig ist oder nicht?
 //
 // Eine return-Anweisung ist nötig sobald die funktion mit einem Datentyp
 // und nicht void initialisiert wird.
 //
 //
 // In einigen der obigen Methoden wird 0 zurückgeliefert, während einige Methoden die so genannte
 // Null-Referenz null zurück liefern. Was könnte der Grund dafür sein?
 //
 // Bei einem int als Rückgabeparameter ist ein null nicht valid daher 0
 //
 //
 // Sie haben von den sogenannten formalen und aktuellen Parametern gehört.
 // - Was ist unter formalen Parametern zu verstehen?
 // 
 // Formale Parameter sind eine Art Platzhalter für den Aufruf einer Funktion
 // 
 //
 // - Was sind die aktuellen Parameter (auch Argumente genannt)?
 // 
 // Aktuelle Parameter sind konkrete Werte oder Variablen die bei einem 
 // Methodenaufruf übergeben werden
 //
 //
 // - Rufen Sie eine Methode mehrmals auf, um den Unterschied zwischen 
 // formalen und aktuellen Parametern etwas besser zu veranschaulichen.
 //
 // int addiere(int a, int b){
 //     return a + b;
 // }
 // Hier sind a und b formale Parameter
 //
 // addiere(2, 5);
 // Hier sind 2 und 5 die aktuellen Parameter (a = 2, b = 5)
 //
 //
 // Könnten Sie abschliessend sagen, wie weit eine Methode implementiert
 // werden muss, damit sie syntaktisch korrekt (heisst: kompilierbar) wird?
 //
 // Damit eine Methode syntaktisch korrekt ist muss sie enthalten:
 // - Optional public oder private statement
 // - Ein rückgabetyp (void, int, double usw.)
 // - Ein Methodenname
 // - Eine Parameterliste () <- darf auch leer sein
 // - Einen Methodenkörper {}
 // - Je nach rückgabetyp ein return statement;

import java.util.Scanner;

public class Aufgabe2 {

    public static void main(String[] args) {
        // TODO - für jede der in dieser Klasse enthaltenen Methoden
        // einen sinnvollen Aufruf implementieren.

        // show
        show(new String[]{"Hello", " ", "world!"});

        // create
        for (int x : create(10, 3, 10)) {
            System.out.println(x);
        }

        // min
        System.out.println(min(2.3, 4.5, 6.3));

        // readInt
        System.out.println(readInt());
        System.out.println(readInt("Gib int: "));

        // merge
        for (double x : merge(new double[]{3.2, 5.1}, new double[]{1.2, 3.4})) {
            System.out.println(x);
        }

        // contains
        System.out.println(contains(new int[]{1, 2, 3, 4}, 5));
        System.out.println(contains(new int[]{1, 2, 3, 4}, 4));
    }

    /* *
     * Zeigt den Inhalt des übergebenen Arrays auf dem Bildschirm an.
     * @param das Array
     */
    public static void show(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }

    /* *
     * Erstellt ein Array mit der spezifizierten Länge und initialisiert
     * es mit den int-Werten, die sich in dem durch die Parameter from
     * und to definierten Bereich befinden.
     * @param length die Länge des Arrays
     * @param from die untere Grenze des Bereichs, aus dem die
     * Zufallswerte genommen werden dürfen
     * @param to die obere Grenze des Bereichs, aus dem die
     * Zufallswerte genommen werden dürfen
     * @return das Array
     */
    public static int[] create(int length, int from, int to) {
        int[] arr = new int[length];
        int range = to - from + 1;

        for (int i = 0; i < length; i++) {
            arr[i] = (int)(Math.random() * range) + from;
        }

        return arr;
    }

    /* *
     * Liefert den kleinesten der übergebenen Werte (Minimum) zurück.
     * @param a der erste Wert
     * @param b der zweite Wert
     * @param c der dritte Wert
     * @return der kleinste Wert (Minimum)
     */
    public static double min(double a, double b, double c) {
        double min = a;

        for (double x : new double[]{b, c}) {
            if (x < min)
                min = x;
        }

        return min;
    }

    /* *
     * Liest einen int-Wert von der Tastatur und liefert sie zurück.
     * @return der eingelesene int-Wert
     */
    public static int readInt() {
        Scanner sc = new Scanner(System.in);


        System.out.print("Gib einen int ein: ");
        int x = sc.nextInt();

        return x;
    }

    /* *
     * Liest einen int-Wert von der Tastatur und liefert sie zurück.
     * @param message die Meldung, die vor dem Einlesen angezeigt wird
     * @return der eingelesene int-Wert
     */
    public static int readInt(String message) {
        Scanner sc = new Scanner(System.in);


        System.out.print(message);
        int x = sc.nextInt();

        return x;
    }

    /* *
     * Fügt die beiden übergebenen Arrays zusammen und liefert das
     * resultierende Array zurück.
     * @param firstArray das erste Array
     * @param secondArray das zweite Array
     * @return das resultierende Array
     */
    public static double[] merge(double[] firstArray, double[] secondArray) {
        double[] res = new double[firstArray.length + secondArray.length];
        int count = 0;
        for (double x : firstArray) {
            res[count] = x;
            count++;
        }
        for (double x : secondArray) {
            res[count] = x;
            count++;
        }
        return res;
    }

    /* *
     * Sagt, ob der übergebene value-Wert im dem übergebenen
     * Array enthalten ist.
     * @param arr das Array, das untersucht werden soll
     * @param value der Wert, für den bestimmt werden soll, ob er in dem
     * spezifizierten Array enthalten ist oder nicht.
     * @return das Resultat (enthalten oder nicht)
     */
    public static boolean contains(int[] arr, int value) {
        for (int x : arr) {
            if (x == value) {
                return true;
            }
        }
        return false;
    }
}
