/**
 * ----------------------------------------
 *  File Name:  aufgabe811.java
 *  Author:     Reto Althaus
 *  Created:    19-02-2026
 * ----------------------------------------
 */

public class aufgabe811
{
    static final int BREITE = 20;
    static final int HOEHE = 10;

    public static void main (String[] args)
    {
        // int hoehe;
        // Zaehlvariable für die Hoehe
        // int breite;
        // Zaehlvariable für die Breite
        // breite = 0;
        // do
        // {
        //     System.out.print ("*");
        //     breite++;
        // }
        // while (breite < BREITE);

        for (int i = 0; i < BREITE; i++) {
            System.out.print("*");
        }
        System.out.println();

        // hoehe = 0;
        // while (hoehe < HOEHE - 2)
        // {
        //     System.out.print ("*");
        //     breite = 1;
        //     do
        //     {
        //         System.out.print (" ");
        //         breite++;
        //     }
        //     while (breite < BREITE - 1);
        //     System.out.println ("*");
        //     hoehe++;
        // }

        for (int i = 0; i < HOEHE - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < BREITE - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // breite = 0;
        // while (breite < BREITE)
        // {
        //     System.out.print ("*");
        //     breite++;
        // }
        // System.out.println();

        for (int i = 0; i < BREITE; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
