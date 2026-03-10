/**
 * ----------------------------------------
 *  File Name:  Aufgabe931.java
 *  Author:     Reto Althaus
 *  Created:    10-03-2026
 * ----------------------------------------
 */

public class Aufgabe931
{
    public static void main(String[] args)
    {
        int intSumme = 0;
        int a = 1;
        int b = 2;
        double doubleSumme = 0.0;
        double c = 1.5;
        double d = 0.25;

        Taschenrechner tr = new Taschenrechner();

        intSumme = tr.addiere(a, b);

        System.out.println(a + " + " + b + " = " + intSumme);

        doubleSumme = tr.addiere(a, b);

        System.out.println(c + " + " + d + " = " + doubleSumme);
    }
}

class Taschenrechner
{
    public int addiere(int a, int b)
    {
        return a + b;
    }
    public double addiere(double a, double b)
    {
        return a + b;
    }
}
