/**
 * ----------------------------------------
 *  File Name:  aufgabe5.java
 *  Author:     Reto Althaus
 *  Created:    18-02-2026
 * ----------------------------------------
 */

public class aufgabe5 {
    public static void main( String [] args )
    {
        boolean a = false, b = true, c = true, d = false, v = false;
        int p = 9, q = 10;

        // Ausdruck A
        d = !b;                         // d = false
        System.out.println(d);

        // Ausdruck B
        v = !a || b && d || !c && !b;   // v = true
        //   t    t    f     f     f
        //   t      f           f
        //   t
        System.out.println(v);

        // Ausdruck C
        v = a && b && (p++ < q);    // v = false p = 9 q = 10
        //  f && t && (9 < 10)  the p++ does not get executed because of sce
        //  f && t && t         (java stops execution if the first of a && is false)
        //  f && t
        //  f
        System.out.println(v);
        System.out.println(p);
        System.out.println(q);

        // Ausdruck D
        v = a || b && (p++ < q);    // v = t p = 10 q = 10
        //  f || t && (9 < 10)      b is true so p++ gets executed so p becomes 10
        //  f || t && t             but p++ gets executed after comparing p to q
        //  f || t
        //  t
        System.out.println(v);
        System.out.println(p);
        System.out.println(q);
    }
}
