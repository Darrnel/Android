package com.example.uzt.edzsterv.modell.Edzes;

public enum VádliEnum {
    ÁLLÓ_VÁDLIGÉP("Álló vádli gépen"),
    ÜLŐ_VÁDLIGÉP("Ülő vádli gépen"),
    SZAMÁRVÁDLI("Szamárvádli");

    private String gyakorlat;

    VádliEnum(String gyakorlat) {
        this.gyakorlat = gyakorlat;
    }

    public String getGyakorlat() {
        return gyakorlat;
    }

    public void setGyakorlat(String gyakorlat) {
        this.gyakorlat = gyakorlat;
    }
}
