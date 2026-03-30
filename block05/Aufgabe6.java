/**
 * ----------------------------------------
 *  File Name:  Aufgabe6.java
 *  Author:     Reto Althaus
 *  Created:    30-03-2026
 * ----------------------------------------
 */

public class Aufgabe6 {
    public static void main(String[] args) {
        Punkt p1 = new Punkt();
        p1.setX(5);
        p1.setY(10);

        Punkt p2 = new Punkt(15, 20);

        System.out.println("Punkt 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Punkt 2: (" + p2.getX() + ", " + p2.getY() + ")");


        Strecke s1 = new Strecke();
        s1.setStart(new Punkt(0, 0));
        s1.setEnde(new Punkt(3, 4));

        System.out.println("Strecke 1 Start: (" + s1.getStart().getX() + ", " + s1.getStart().getY() + ")");
        System.out.println("Strecke 1 Ende: (" + s1.getEnde().getX() + ", " + s1.getEnde().getY() + ")");
        System.out.println("Strecke 1 Länge: " + s1.laenge());

        Strecke s2 = new Strecke(new Punkt(1, 1), new Punkt(4, 5));
        System.out.println("Strecke 2 Start: (" + s2.getStart().getX() + ", " + s2.getStart().getY() + ")");
        System.out.println("Strecke 2 Ende: (" + s2.getEnde().getX() + ", " + s2.getEnde().getY() + ")");
        System.out.println("Strecke 2 Länge: " + s2.laenge());

        System.out.println("Strecke 1 Mittelpunkt: (" + s1.mittelpunkt().getX() + ", " + s1.mittelpunkt().getY() + ")");
        System.out.println("Strecke 2 Mittelpunkt: (" + s2.mittelpunkt().getX() + ", " + s2.mittelpunkt().getY() + ")");
    }
}

class Strecke {
    private Punkt start;
    private Punkt ende;

    public Strecke() {
        this.start = new Punkt();
        this.ende = new Punkt();
    }

    public Strecke(Punkt start, Punkt ende) {
        this.start = start;
        this.ende = ende;
    }

    public Punkt getStart() {
        return this.start;
    }

    public void setStart(Punkt start) {
        this.start = start;
    }

    public Punkt getEnde() {
        return this.ende;
    }

    public void setEnde(Punkt ende) {
        this.ende = ende;
    }

    public double laenge() {
        int deltaX = this.ende.getX() - this.start.getX();
        int deltaY = this.ende.getY() - this.start.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public Punkt mittelpunkt() {
        int mittelX = (this.start.getX() + this.ende.getX()) / 2;
        int mittelY = (this.start.getY() + this.ende.getY()) / 2;
        return new Punkt(mittelX, mittelY);
    }
}

class Punkt {
    private int x;
    private int y;

    public Punkt() {
        this.x = 0;
        this.y = 0;
    }

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
