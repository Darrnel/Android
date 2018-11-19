package com.example.uzt.edzsterv.modell.Edzes;

public enum CombEnum {
    GUGGOLÁS("Guggolás"),
    LÁBTOLÁS("Lábtolás gépen"),
    LÁBNYÚJTÁS("Lábnyújtás gépen"),
    LÁBHAJLÍTÁS("Lábhajlítás gépen"),
    KITÖRÉS("Kitörés"),
    GUGGOLÁS_GÉPPEL("Guggolás gépen"),
    FELHÚZÁS("Felhúzás"),
    SISSY_GUGGOLÁS("Guggolás Sissy gépen");

    private String gyakorlat;

    CombEnum(String gyakorlat) {
        this.gyakorlat = gyakorlat;
    }

    public String getGyakorlat() {
        return gyakorlat;
    }

    public void setGyakorlat(String gyakorlat) {
        this.gyakorlat = gyakorlat;
    }
}
