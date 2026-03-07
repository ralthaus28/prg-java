/**
 * ----------------------------------------
 *  File Name:  Demo.java
 *  Author:     Reto Althaus
 *  Created:    07-03-2026
 * ----------------------------------------
 */

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Geben sie ein Alter ein: ");
        int alter = sc.nextInt();
        System.out.println(isAdult(alter) ? "Du bist erwachsen!" : "Du bist miderjährig!");

        int[] array = {2, 4, 15, 33, 64};
        System.out.println("Grösste Zahl: " + getMaxElement(array));
        System.out.println("Gleiche Zahlen: " + getEvenNumbers(array));

        sc.close();
    }
    public static boolean isAdult(int years) {
        return years >= 18;
    }
    public static int getMaxElement(int[] arr) {
        int max = arr[0];
        // Implementierung (hier nicht von Interesse) …
        return max;
    }
    public static int[] getEvenNumbers(int[] arr) {
        int[] arrEvenNumbers = null;
        // Implementierung (hier nicht von Interesse) …
        return arrEvenNumbers;
    }
}
