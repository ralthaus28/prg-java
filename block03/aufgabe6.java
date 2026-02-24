/**
 * ----------------------------------------
 *  File Name:  aufgabe6.java
 *  Author:     Reto Althaus
 *  Created:    19-02-2026
 * ----------------------------------------
 */

import java.util.Scanner;

public class aufgabe6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Geben sie eine ganze positive Zahl grösser als 1 ein: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.err.println("Geben sie eine gültige Zahl ein");
            System.exit(1);
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println("Das ist keine Primzahl!");
                sc.close();
                System.exit(0);
            }
        }
        System.out.println("Das ist eine Primzahl!");

        sc.close();
    }
}
