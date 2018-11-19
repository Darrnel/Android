package com.example.uzt.edzsterv.modell.Edzes.Enum;

public enum MellEnum {
    FEKVENYOMÁS_EGYENES_PADON("Fekvenyomás egyenes padon"),
    FEKVENYOMÁS_FERDE_PADON("Fekvenyomás ferde padon"),
    FEKVENYOMÁS_EGYKEZES_SÚLYZÓVAL("Fekvenyomás egykezes súlyzókkal"),
    FEKVENYOMÁS_GÉPEN("Fekvenyomás gépen"),
    TÁROGATÁS_GÉPEN("Tárogatás gépen"),
    TÁROGATÁS_KÁBELLEL("Tárogatás kábellel"),
    TÁROGATÁS_PADON("Tárogatás padon"),
    TOLÓDZKODÁS("Tolódzkodás");

    private String gyakorlat;

    MellEnum(String gyakorlat) {
        this.gyakorlat = gyakorlat;
    }

    public String getGyakorlat() {
        return gyakorlat;
    }

    public void setGyakorlat(String gyakorlat) {
        this.gyakorlat = gyakorlat;
    }
}
