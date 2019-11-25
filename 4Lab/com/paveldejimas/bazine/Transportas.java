package com.paveldejimas.bazine;

public class Transportas implements TransportasI {
    private String tipas;
    private boolean variklis;
    private int pagaminimoMetai;


    public Transportas(String tipas, boolean variklis, int pagaminimoMetai) {
        this.tipas = tipas;
        this.variklis = variklis;
        this.pagaminimoMetai = pagaminimoMetai;
    }

    public String getTipas() {
        return tipas;
    }

    public boolean getVariklis() {
        return variklis;
    }

    public int getPagaminimoMetai() {
        return pagaminimoMetai;
    }

    public void setPagaminimoMetai(int pagaminimoMetai) {
        this.pagaminimoMetai = pagaminimoMetai;
    }

    public void setTipas(String tipas) {
        this.tipas = tipas;
    }

    public void setVariklis(boolean variklis) {
        this.variklis = variklis;
    }

    public String toString() {
        return tipas + " " + variklis + " " + pagaminimoMetai + " " + "\n";
    }
}
