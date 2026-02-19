/**
 * ----------------------------------------
 *  File Name:  aufgabe1.java
 *  Author:     Reto Althaus
 *  Created:    17-02-2026
 * ----------------------------------------
 */

public class aufgabe1
{
    public void main( String [] args )
    {
        final double kredit = 23859.00;
        final double abschlusskosten = 259.00;
        final double zins = 4.85 / 100;  //Zinssatz in dezimalbruch
        final int laufzeitJahre = 3;
        final int laufzeitMonate = laufzeitJahre * 12;

        double gesamtkredit = kredit + abschlusskosten;

        for(int jahr = 1; jahr <= laufzeitJahre; jahr++)    //Zinseszinsen 3 Jahre
        {
            gesamtkredit += gesamtkredit * zins;
        }

        double monatsrate = gesamtkredit / laufzeitMonate;

        System.out.printf("Gesamtkredit: %.3f\n", gesamtkredit);
        System.out.printf("Monatliche Rate: %.3f\n", monatsrate);
    }
}
