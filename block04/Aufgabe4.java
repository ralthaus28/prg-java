/**
 * ----------------------------------------
 *  File Name:  Aufgabe4.java
 *  Author:     Reto Althaus
 *  Created:    10-03-2026
 * ----------------------------------------
 */

public class Aufgabe4 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        // Ausgabe von a und b
        System.out.println("a = " + a + " , b = " + b);

        b = 20; 
        // Mit dem Satz:
        // Primitive values do not share state with other primitive values.
        // ist gemeint das a sich nicht ändert wenn b geändert wird

        // Ausgabe von a und b
        System.out.println("a = " + a + " , b = " + b);
    }
}
