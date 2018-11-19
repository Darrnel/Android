package com.example.uzt.edzsterv.modell.Edzes;

public class Gyakorlat {


    private String nev;
    private int sorozat;
    private int ismetles;

    private int ora;
    private int perc;

    public Gyakorlat(BicepszEnum bicepszGyakorlat, int sorozat, int ismetles) {
        this.nev = bicepszGyakorlat.getGyakorlat();
        this.sorozat = sorozat;
        this.ismetles = ismetles;
    }

    public Gyakorlat(CombEnum combGyakorlat, int sorozat, int ismetles) {
        this.nev = combGyakorlat.getGyakorlat();
        this.sorozat = sorozat;
        this.ismetles = ismetles;
    }

    public Gyakorlat(HasEnum hasGyakorlat, int sorozat, int ismetles) {
        this.nev = hasGyakorlat.getGyakorlat();
        this.sorozat = sorozat;
        this.ismetles = ismetles;
    }

    public Gyakorlat(HátEnum hatGyakorlat, int sorozat, int ismetles) {
        this.nev = hatGyakorlat.getGyakorlat();
        this.sorozat = sorozat;
        this.ismetles = ismetles;
    }

    public Gyakorlat(MellEnum mellGyakorlat, int sorozat, int ismetles) {
        this.nev = mellGyakorlat.getGyakorlat();
        this.sorozat = sorozat;
        this.ismetles = ismetles;
    }

    public Gyakorlat(TricepszEnum tricepszGyakorlat, int sorozat, int ismetles) {
        this.nev = tricepszGyakorlat.getGyakorlat();
        this.sorozat = sorozat;
        this.ismetles = ismetles;
    }

    public Gyakorlat(VádliEnum vadliGyakorlat, int sorozat, int ismetles) {
        this.nev = vadliGyakorlat.getGyakorlat();
        this.sorozat = sorozat;
        this.ismetles = ismetles;
    }

    public Gyakorlat(VállEnum vallGyakorlat, int sorozat, int ismetles) {
        this.nev = vallGyakorlat.getGyakorlat();
        this.sorozat = sorozat;
        this.ismetles = ismetles;
    }

    public Gyakorlat(KardioEnum nev, int ora, int perc) {
        this.nev = nev.getGyakorlat();
        this.ora = ora;
        this.perc = perc;
    }

    public String getBicepszGyakorlat() {
        return nev;
    }

    public void setBicepszGyakorlat(BicepszEnum bicepszGyakorlat) {
        this.nev = bicepszGyakorlat.getGyakorlat();
    }

    public String getCombGyakorlat() {
        return nev;
    }

    public void setCombGyakorlat(CombEnum combGyakorlat) {
        this.nev = combGyakorlat.getGyakorlat();
    }

    public String getHasGyakorlat() {
        return nev;
    }

    public void setHasGyakorlat(HasEnum hasGyakorlat) {
        this.nev = hasGyakorlat.getGyakorlat();
    }

    public String getHatGyakorlat() {
        return nev;
    }

    public void setHatGyakorlat(HátEnum hatGyakorlat) {
        this.nev = hatGyakorlat.getGyakorlat();
    }

    public String getMellGyakorlat() {
        return nev;
    }

    public void setMellGyakorlat(MellEnum mellGyakorlat) {
        this.nev = mellGyakorlat.getGyakorlat();
    }

    public String getTricepszGyakorlat() {
        return nev;
    }

    public void setTricepszGyakorlat(TricepszEnum tricepszGyakorlat) {
        this.nev = tricepszGyakorlat.getGyakorlat();
    }

    public String getVadliGyakorlat() {
        return nev;
    }

    public void setVadliGyakorlat(VádliEnum vadliGyakorlat) {
        this.nev = vadliGyakorlat.getGyakorlat();
    }

    public String getVallGyakorlat() {
        return nev;
    }

    public void setVallGyakorlat(VállEnum vallGyakorlat) {
        this.nev = vallGyakorlat.getGyakorlat();
    }
    public String getGyakorlat() {
        return nev;
    }

    public void setGyakorlat(KardioEnum kardioGyakorlat) {
        this.nev = kardioGyakorlat.getGyakorlat();
    }

    public int getSorozat() {
        return sorozat;
    }

    public void setSorozat(int sorozat) {
        this.sorozat = sorozat;
    }

    public int getIsmetles() {
        return ismetles;
    }

    public void setIsmetles(int ismetles) {
        this.ismetles = ismetles;
    }

    public int getOra() {
        return ora;
    }

    public int getPerc() {
        return perc;
    }

    @Override
    public String toString() {
        return "Gyakorlat " +
                "nev : " + nev +
                ", sorozat : " + sorozat +
                ", ismetles : " + ismetles;
    }
}
