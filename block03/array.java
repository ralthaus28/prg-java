/**
 * ----------------------------------------
 *  File Name:  array.java
 *  Author:     Reto Althaus
 *  Created:    19-02-2026
 * ----------------------------------------
 */

public class array {
    public static void main(String[] args) {
        double[] noten = {5, 5.5, 5.25, 6, 5.5, 5};
        double[] arr = new double [noten.length / 2];
        double durchschnitt = 0;

        int j = 0;

        for(int i = 0; i < noten.length; i++)
        {
            durchschnitt += noten[i];
            if(i % 2 == 1)
            {
                arr[j] = noten[i];
                j++;
            }
        }
        
        durchschnitt = durchschnitt / noten.length;
        System.out.println("Dein notendurchschnitt beträgt: " + durchschnitt);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Note Nr." + i + ": ");
            System.out.println(arr[i]);
        }
    }
}
