package com.example.uzt.edzsterv.modell.Etrend;

public class Etrend {
    private String reggeli;
    private String tizorai;
    private String ebed;
    private String uzsonna;
    private String vacsora;

    public Etrend(String reggeli, String tizorai, String ebed, String uzsonna, String vacsora) {
        this.reggeli = reggeli;
        this.tizorai = tizorai;
        this.ebed = ebed;
        this.uzsonna = uzsonna;
        this.vacsora = vacsora;
    }

    public String getReggeli() {
        return reggeli;
    }

    public void setReggeli(String reggeli) {
        this.reggeli = reggeli;
    }

    public String getTizorai() {
        return tizorai;
    }

    public void setTizorai(String tizorai) {
        this.tizorai = tizorai;
    }

    public String getEbed() {
        return ebed;
    }

    public void setEbed(String ebed) {
        this.ebed = ebed;
    }

    public String getUzsonna() {
        return uzsonna;
    }

    public void setUzsonna(String uzsonna) {
        this.uzsonna = uzsonna;
    }

    public String getVacsora() {
        return vacsora;
    }

    public void setVacsora(String vacsora) {
        this.vacsora = vacsora;
    }

}

