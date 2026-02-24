/**
 * ----------------------------------------
 *  File Name:  aufgabe5.java
 *  Author:     Reto Althaus
 *  Created:    19-02-2026
 * ----------------------------------------
 */

import java.util.Scanner;

public class aufgabe5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;
        boolean x;
        boolean y;

        // Teilaufgabe 1
        if (a > b || a < b / 2 || a + c > b) {
            System.out.println("Genf");
        }

        // Teilaufgabe 2
        if (a > b || a - c > 0 && x != y) {
            System.out.println("Bern");
        }

        // Teilaufgabe 3
        if ((a / 2) % 2 != 0 || (b - c) % 2 == 0 || a != b && b != c) {
            System.out.println("Lugano");
        }
    }
}
