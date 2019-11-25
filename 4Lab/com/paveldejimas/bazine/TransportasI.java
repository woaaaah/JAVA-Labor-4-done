package com.paveldejimas.bazine;

public interface TransportasI {
    String getTipas();

    int getPagaminimoMetai();

    boolean getVariklis();

    public void setTipas(String tipas);

    public void setPagaminimoMetai(int pagaminimoMetai);

    public void setVariklis(boolean variklis);
}
