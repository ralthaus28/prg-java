/**
 * ----------------------------------------
 *  File Name:  aufgabe2.java
 *  Author:     Reto Althaus
 *  Created:    16-02-2026
 * ----------------------------------------
 */

import java.util.Scanner;

public class aufgabe2
{
    public void main( String [] args )
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Geben sie die Breite des Vierecks an: ");
        double width = reader.nextDouble();
        System.out.print("Geben sie die Höhe des Vierecks an: ");
        double height = reader.nextDouble();

        if (width < 0 || height < 0)
        {
            System.out.println("Geben Sie valide Längen an!");
            reader.close();
            return;
        }

        double area = width * height;
        double circumference = 2 * width + 2 * height;
        System.out.printf("Die Fläche des Vierecks beträgt: %.2f%n", area);
        System.out.printf("Der Umfang des Vierecks beträgt: %.2f%n", circumference);
        reader.close();
    }
}
