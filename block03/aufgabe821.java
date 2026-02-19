/**
 * ----------------------------------------
 *  File Name:  aufgabe821.java
 *  Author:     Reto Althaus
 *  Created:    19-02-2026
 * ----------------------------------------
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class aufgabe821
{
    // Verwenden Sie die Methode eingabeZahl(),
    // ohne sie genauer zu studieren
    public static int eingabeZahl()
    {
        int wert = -1;

        try
        {
            java.util.Scanner scanner =
            new java.util.Scanner (System.in);
            System.out.print ("Gib einen Wert ein: ");
            wert = scanner.nextInt();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.exit(-1);
        }
        return wert;
    }

    public static void main (String[] args)
    {
        int zahl = eingabeZahl();
        System.out.print ("Die eingegebene Zahl ist ");

        // if (zahl == 1)
        //     System.out.println ("EINS");
        // else if (zahl == 2)
        //     System.out.println ("ZWEI");
        // else if (zahl == 3)
        //     System.out.println ("DREI");
        // else if (zahl == 4)
        //     System.out.println ("VIER");
        // else if (zahl == 5)
        //     System.out.println ("FUENF");
        // else
        // {
        //     System.out.println ("UNBEKANNT");
        // }

        switch (zahl)
        {
            case 1 -> System.out.println("EINS");
            case 2 -> System.out.println("ZWEI");
            case 3 -> System.out.println("DREI");
            case 4 -> System.out.println("VIER");
            case 5 -> System.out.println("FÜNF");
            default -> System.out.println("UNBEKANNT");
        }
    }
}
