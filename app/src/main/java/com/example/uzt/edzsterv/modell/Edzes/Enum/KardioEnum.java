package com.example.uzt.edzsterv.modell.Edzes.Enum;

public enum KardioEnum {
    FUTÁS("Futás"),
    KOCOGÁS("Kocogás"),
    SÉTÁLÁS("Sétálás"),
    BICIKLIZÉS("Biciklizés"),
    ELIPSZISEZÉS("Elipszizés");

    private String gyakorlat;

    KardioEnum(String gyakorlat) {
        this.gyakorlat = gyakorlat;
    }

    public String getGyakorlat() {
        return gyakorlat;
    }

    public void setGyakorlat(String gyakorlat) {
        this.gyakorlat = gyakorlat;
    }
}
