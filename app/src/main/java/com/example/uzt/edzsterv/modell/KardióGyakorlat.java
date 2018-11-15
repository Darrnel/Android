package com.example.uzt.edzsterv.modell;

public class KardióGyakorlat {
    private KardioEnum gyakorlat;
    private int ora;
    private int perc;

    public KardióGyakorlat(KardioEnum gyakorlat, int ora, int perc){
        this.gyakorlat = gyakorlat;
        this.ora = ora;
        this.perc = perc;

    }
    public KardioEnum getGyakorlat() {
        return gyakorlat;
    }

    public void setGyakorlat(KardioEnum gyakorlat) {
        this.gyakorlat = gyakorlat;
    }

    public int getOra() {
        return ora;
    }

    public int getPerc() {
        return perc;
    }
}
