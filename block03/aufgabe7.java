/**
 * ----------------------------------------
 *  File Name:  aufgabe7.java
 *  Author:     Reto Althaus
 *  Created:    19-02-2026
 * ----------------------------------------
 */

import java.util.Scanner;

public class aufgabe7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Geben sie die Länge des Arrays an: ");
        int len = sc.nextInt();

        int[] randos = new int[len];
        int smallest = 1000;
        int sum = 0;

        System.out.println("\nHier sind " + len + " zufällige Zahlen:");

        for (int i = 0; i < len; i++) {
            randos[i] = 1 + (int)(Math.random() * 1000);
            System.out.println(randos[i]);
            if (randos[i] < smallest) {
                smallest = randos[i];
            }
            sum += randos[i];
        }

        System.out.println("\nDer kleinste Wert ist: " + smallest);
        System.out.println("Die summe der Werte beträgt: " + sum);

        int num = 0;

        for (int e : randos) {
            if (e % 2 == 0) {
                num++;
            }
        }

        int[] copyRandos = new int[num];

        for (int i = 0; i < len; i++) {
            if (randos[i] % 2 == 0) {
                copyRandos[--num] = randos[i];
            }
        }

        System.out.println("\nDie geraden Zahlen: ");

        for (int e : copyRandos) {
            System.out.println(e);
        }

        for (int i = len - 1; i >= 0; i--) {
            if (randos[i] % 2 != 0) {
                System.out.println("\nDie letzte ungerade Zahl ist: " + randos[i]);
                System.exit(0);
            }
        }
        System.out.println("Es hat keine ungerade Zahl!");
    }
}
