/**
 * ----------------------------------------
 *  File Name:  aufgabe3.java
 *  Author:     Reto Althaus
 *  Created:    24-02-2026
 * ----------------------------------------
 */

import java.util.Scanner;

public class aufgabe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Geben sie ihre Grösse in cm an: ");
        double height = sc.nextDouble() / 100;
        System.out.print("Geben sie ihr Gewicht in kg an: ");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("Ihr BMI beträgt: %.2f", bmi);

        if (bmi < 18.5) {
            System.out.println(" (Untergewicht)");
        }
        else if (bmi < 25) {
            System.out.println(" (Normalgewicht)");
        }
        else  if (bmi < 30) {
            System.out.println(" (Übergewicht)");
        }
        else {
            System.out.println(" (Adipositas)");
        }
    }
}
