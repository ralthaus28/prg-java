/**
 * ----------------------------------------
 *  File Name:  aufgabe2.java
 *  Author:     Reto Althaus
 *  Created:    19-02-2026
 * ----------------------------------------
 */

import java.util.Scanner;

public class aufgabe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Erste Zahl eingeben: ");
        int a = sc.nextInt();
        System.out.print("Zweite Zahl eingeben: ");
        int b = sc.nextInt();
        System.out.print("Dritte Zahl eingeben: ");
        int c = sc.nextInt();

        if (a < b){
            if (b < c)
                System.out.println("Klein nach gross: " + a + ", " + b + ", " + c + ", ");
            else if (a < c)
                System.out.println("Klein nach gross: " + a + ", " + c + ", " + b + ", ");
            else
                System.out.println("Klein nach gross: " + c + ", " + a + ", " + b + ", ");
        }
        else {
            if (a < c)
                System.out.println("Klein nach gross: " + b + ", " + a + ", " + c + ", ");
            else if (b < c)
                System.out.println("Klein nach gross: " + b + ", " + c + ", " + a + ", ");
            else
                System.out.println("Klein nach gross: " + c + ", " + b + ", " + a + ", ");
        }
    }
}
