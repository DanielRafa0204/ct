package cts;

public abstract class Vehicul {
    private final int MAX_INT = 9999999;
    private int viteza;
    private String denumire;

    public Vehicul(String denumire, int viteza) {
        this.denumire = denumire;
        this.viteza = viteza;
    }

    public abstract void deplasare();

    public int getViteza() {
        return viteza;
    }

    public String getDenumire() {
        return denumire;
    }


}