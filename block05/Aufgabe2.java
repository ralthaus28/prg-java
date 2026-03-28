/**
 * ----------------------------------------
 *  File Name:  Aufgabe2.java
 *  Author:     Reto Althaus
 *  Created:    23-03-2026
 * ----------------------------------------
 */

public class Aufgabe2 {
    public static void main(String[] args) {
        Lampe lampeA = new Lampe();
        Schalter swLampeA = new Schalter();

        lampeA.setVoltage(24);
        lampeA.setPower(40);
        lampeA.setConnectorType("E14");
        lampeA.setSwitch(swLampeA);

        System.out.println("Spannung: " + lampeA.getVoltage() + "V, Leistung: " + lampeA.getPower() + "W");

        Lampe lampeB = new Lampe(220, 100, "E-27", new Schalter());


        System.out.println("Spannung: " + lampeB.getVoltage() + "V, Leistung: " + lampeB.getPower() + "W, Fassung-Type: " + lampeB.getConnectorType());

        Schalter swLampeB = lampeB.getSwitch();

        System.out.println("Lampe A: " + ( swLampeA.isEingeschaltet() ? "Eingeschaltet" : "Ausgeschaltet" ));
        System.out.println("Lampe B: " + ( swLampeB.isEingeschaltet() ? "Eingeschaltet" : "Ausgeschaltet" ));

        swLampeA.ein();
        swLampeB.ein();

        System.out.println("Lampe A: " + ( swLampeA.isEingeschaltet() ? "Eingeschaltet" : "Ausgeschaltet" ));
        System.out.println("Lampe B: " + ( swLampeB.isEingeschaltet() ? "Eingeschaltet" : "Ausgeschaltet" ));
    }
}

class Schalter {
    private boolean eingeschaltet ;

    public void ein () {
        if (! eingeschaltet ) {
            eingeschaltet = true ;
        }
    }

    public void aus () {
        if ( eingeschaltet ){
            eingeschaltet = false ;
        }
    }

    public boolean isEingeschaltet () {
        return eingeschaltet ;
    }
}

class Lampe {
    private int voltage;
    private int power;
    private String connectorType;
    private Schalter sw;

    public Lampe() {
        voltage = 0;
        power = 0;
        connectorType = "";
        sw = new Schalter();
    }

    public Lampe(int voltage, int power, String connectorType, Schalter sw){
        this.voltage = voltage;
        this.power = power;
        this.connectorType = connectorType;
        this.sw = sw;
    }

    public int getVoltage(){
        return voltage;
    }

    public void setVoltage(int voltage){
        this.voltage = voltage;
    }

    public int getPower(){
        return power;
    }

    public void setPower(int power){
        this.power = power;
    }

    public String getConnectorType(){
        return connectorType;
    }

    public void setConnectorType(String connectorType){
        this.connectorType = connectorType;
    }

    public void setSwitch(Schalter sw){
        this.sw = sw;
    }

    public Schalter getSwitch() {
        return this.sw;
    }

}
