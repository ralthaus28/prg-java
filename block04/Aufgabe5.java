/**
 * ----------------------------------------
 *  File Name:  Aufgabe5.java
 *  Author:     Reto Althaus
 *  Created:    15-03-2026
 * ----------------------------------------
 */

import java.util.Scanner;

public class Aufgabe5 {

	public static void main(String[] args) {

		// Array-Laenge
		int arrayLaenge = 6;

		// Array erstellen
		int[] arrA = elementeEinlesen(arrayLaenge);

        ausgabe(arrA);

		System.out.println("\n\nSumme: " + summe(arrA));

		// Neues Array erstellen
		int[] arrB = elementeEinlesen(arrayLaenge);

        ausgabe(arrB);

		System.out.println("\n\nAnzahl negativer int-Werte: " + negative(arrB));


		// Neues Array erstellen
		int[] arrC = elementeEinlesen(arrayLaenge);

        ausgabe(arrC);

		System.out.println("\n\nAnzahl ungerader int-Werte: " + ungerade(arrC));
	}

    private static int[] elementeEinlesen(int len){
		Scanner sc = new Scanner(System.in);

        // Neues Array erstellen
		int[] arr = new int[len];

		// Elemente einlesen
		System.out.println("\nGanze Zahlen eingeben:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "-te Element:\t");
			arr[i] = sc.nextInt();
		}

        return arr;
    }

    private static void ausgabe(int[] arr){
		// Array-Inhalt ausgeben
		System.out.println("\nArray-Inhalt:");
		for (int n : arr) {
			System.out.print(n + "\t");
		}
    }

    private static int summe(int[] arr){
		int summe = 0;

		for (int n : arr) {
			summe += n;
		}

        return summe;
    }

    private static int negative(int[] arr){
		int anzahlNegativ = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				anzahlNegativ++;
			}
		}

        return anzahlNegativ;
    }

    private static int ungerade(int[] arr){
        int anzahlUngerade = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				anzahlUngerade++;
			}
		}

        return anzahlUngerade;
    }
}
