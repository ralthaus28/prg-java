/**
 * ----------------------------------------
 *  File Name:  Aufgabe951.java
 *  Author:     Reto Althaus
 *  Created:    10-03-2026
 * ----------------------------------------
 */

public class Aufgabe951 {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Wrong ammount of parameters!");
            System.out.println("Aufgabe951 <int>");
            return;
        }

        int lines = Integer.parseInt(args[0]);

        for (; lines > 0; lines--) {
            System.out.println("Hello World!");
        }
    }
}
