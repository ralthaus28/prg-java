/**
 * ----------------------------------------
 *  File Name:  Aufgabe1.java
 *  Author:     Reto Althaus
 *  Created:    15-03-2026
 * ----------------------------------------
 */

public class Aufgabe1 {
    public static void main(String[] args) {
        Lampe lampeA = new Lampe();

        lampeA.setVoltage(24);
        lampeA.setPower(40);
        lampeA.setConnectorType("E14");

        System.out.println("Spannung: " + lampeA.getVoltage() + "V, Leistung: " + lampeA.getPower() + "W");

        Lampe lampeB = new Lampe(220, 100, "E-27");

        System.out.println("Spannung: " + lampeB.getVoltage() + "V, Leistung: " + lampeB.getPower() + "W, Fassung-Type: " + lampeB.getConnectorType());
    }
}

class Lampe {
    private int voltage;
    private int power;
    private String connectorType;

    public Lampe() {
        this.voltage = 0;
        this.power = 0;
        this.connectorType = "";
    }

    public Lampe(int voltage, int power, String connectorType){
        this.voltage = voltage;
        this.power = power;
        this.connectorType = connectorType;
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
}
