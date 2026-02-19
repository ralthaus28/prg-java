/**
 * ----------------------------------------
 *  File Name:  bancomat.java
 *  Author:     Reto Althaus
 *  Created:    17-02-2026
 * ----------------------------------------
 */

import module java.base;

void sleep500Msec(){
    try{
        Thread.sleep(500);
    }
    catch (InterruptedException e){
        e.printStackTrace();
    }
}

public class bancomat
{
    void main(){
        final String userPin = "1234";
        Scanner reader = new Scanner(System.in);

        System.out.print("Insert card (press any key)");
        reader.nextLine();

        for(int i = 0; i <= 9; i = i + 1){
            sleep500Msec();
            System.out.print("-");
        }
        System.out.println("");

        int tryCounter = 0;
        while(tryCounter < 2){
            String pin = IO.readln("Geben sie ihren PIN ein:");
            if(pin = userPin)
                break;
        }

        // if (width < 0 || height < 0)
        // {
        //     System.out.println("Geben Sie valide Längen an!");
        //     reader.close();
        //     return;
        // }
        //
        // double area = width * height;
        // double circumference = 2 * width + 2 * height;
        // System.out.printf("Die Fläche des Vierecks beträgt: %.2f%n", area);
        // System.out.printf("Der Umfang des Vierecks beträgt: %.2f%n", circumference);
        reader.close();
    }
}
