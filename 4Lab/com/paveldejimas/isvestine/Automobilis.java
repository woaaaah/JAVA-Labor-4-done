package com.paveldejimas.isvestine;

import com.paveldejimas.bazine.Transportas;

public class Automobilis extends Transportas implements AutomobilisI {
    private String marke;
    private int duruSkaicius;
    private boolean varomasElektra;

    public Automobilis(String marke, int duruSkaicius, boolean varomasElektra) {
        super(marke, varomasElektra, duruSkaicius);
        this.varomasElektra = varomasElektra;
        this.marke = marke;
        this.duruSkaicius = duruSkaicius;
    }

    public String getMarke() {
        return marke;
    }

    public int getDuruSkaicius() {
        return duruSkaicius;
    }

    public boolean getvaromasElektra() {
        return varomasElektra;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setPagaminimoMetai(int duruSkaicius) {
        this.duruSkaicius = duruSkaicius;
    }

    public void setVaromasElektra(boolean varomasElektra) {
        this.varomasElektra = varomasElektra;
    }

    public void setDuruSkaicius(int duruSkaicius) {
        this.duruSkaicius = duruSkaicius;
    }

    public String toString() {
        return "Marke: " +  marke + ", " + "Duru skaicius: " + duruSkaicius;
    }
}
