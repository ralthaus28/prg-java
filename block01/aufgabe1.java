/**
 * ----------------------------------------
 *  File Name:  aufgabe1.java
 *  Author:     Reto Althaus
 *  Created:    16-02-2026
 * ----------------------------------------
 */

import java.util.Scanner;

void main()
{
    Scanner reader = new Scanner(System.in);

    System.out.println("Geben sie die Breite des Vierecks an: ");
    int width = reader.nextInt();
    System.out.println("Geben sie die Höhe des Vierecks an: ");
    int height = reader.nextInt();

    if (width < 0 | height < 0)
    {
        System.out.println("Geben sie valide Längen an!");
    }
    else
    {
        int area = width * height;
        System.out.println("Das Viereck hat eine Fläche von: " + area);
    }
    reader.close();
}
