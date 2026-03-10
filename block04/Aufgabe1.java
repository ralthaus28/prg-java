/**
 * ----------------------------------------
 *  File Name:  Aufgabe1.java
 *  Author:     Reto Althaus
 *  Created:    10-03-2026
 * ----------------------------------------
 */

// Ein Modul kann nicht als elementarer Datentyp abgebildet werden weil:
// Ein Modul aus verschiedenen Eigenschaften besteht.
// Beispielsweise: Name(String), Raumnummer(int), Lehrer(String), klimatisiert(boolean)
public class Aufgabe1 {
    public static void main(String[] args) {
        Modul prg = new Modul();
        prg.modulName = "math";
        prg.raumNummer = 187;
        prg.lehrer = "peschä";
        prg.klimatisiert = true;

        Modul isf = new Modul();
        isf.modulName = "english";
        isf.raumNummer = 420;
        isf.lehrer = "hämpu";
        isf.klimatisiert = true;

        System.out.println(prg.modulName);
        System.out.println(prg.raumNummer);
        System.out.println(prg.lehrer);
        System.out.println(prg.klimatisiert);
        
        System.out.println();

        System.out.println(isf.modulName);
        System.out.println(isf.raumNummer);
        System.out.println(isf.lehrer);
        System.out.println(isf.klimatisiert);
    }

    public static class Modul {
        public String modulName;
        public int raumNummer;
        public String lehrer;
        public boolean klimatisiert;
    }
}
