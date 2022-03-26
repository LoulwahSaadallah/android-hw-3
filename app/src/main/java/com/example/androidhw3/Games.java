package com.example.androidhw3;

public class Games {
    private String name;
    private int imageformula;
    private double priceformula1;

    public Games(String name, int imageformula, double priceformula1) {
        this.name = name;
        this.imageformula = imageformula;
        this.priceformula1 = priceformula1;
    }

    public String getFormula1() {
        return name;
    }

    public void setFormula1(String formula1) {
        this.name = formula1;
    }

    public int getImageformula() {
        return imageformula;
    }

    public void setImageformula(int imageformula) {
        this.imageformula = imageformula;
    }

    public double getPriceformula1() {
        return priceformula1;
    }

    public void setPriceformula1(double priceformula1) {
        this.priceformula1 = priceformula1;
    }
}
