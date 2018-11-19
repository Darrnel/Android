package com.example.uzt.edzsterv.modell.Edzes.Enum;

public enum BicepszEnum {
    KÉTKEZES_RÚDDAL("Bicepsz kétkezes rúddal"),
    SCOTT_PADON("Bicepsz scott padon"),
    EGYKEZES_SÚLYZÓVAL("Bicepsz gykezes súlyzóval"),
    KALAPÁCS_FOGÁSSAL("Bicepsz kalapács fogással"),
    KÁBELLEL("Bicepsz kábellel"),
    LEHÚZÁS_BICEPSZRE("Lehúzás bicepszre"),
    HÚZÓDZKODÁS_SZŰKEN("Húzódzkodás szűken"),
    GÉPEN_KÉTKEZES("Bicepsz gépen(kétkezes)"),
    GÉPEN_EGYKEZES("Bicepsz gépen(egykezes)");

    private String gyakorlat;

    BicepszEnum(String gyakorlat) {
        this.gyakorlat = gyakorlat;
    }

    public String getGyakorlat() {
        return gyakorlat;
    }

    public void setGyakorlat(String gyakorlat) {
        this.gyakorlat = gyakorlat;
    }
}
