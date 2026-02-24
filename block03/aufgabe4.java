/**
 * ----------------------------------------
 *  File Name:  aufgabe4.java
 *  Author:     Reto Althaus
 *  Created:    19-02-2026
 * ----------------------------------------
 */

import java.util.Scanner;

public class aufgabe4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte die Obergrenze eingeben: ");
        int top = sc.nextInt();
        System.out.print("Bitte die Untergrenze eingeben: ");
        int bottom = sc.nextInt();

        do {
            System.out.println(top);
            top--;
        } while (top >= bottom);
    }
}
