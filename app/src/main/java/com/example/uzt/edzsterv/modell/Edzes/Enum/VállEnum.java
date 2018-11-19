package com.example.uzt.edzsterv.modell.Edzes.Enum;

public enum VállEnum {
    VÁLLBÓL_NYOMÁS_SÚLYZÓVAL("Vállból nyomás súlyzóval"),
    VÁLLBÓL_NYOMÁS_RÚDDAL("Vállból nyomás rúddal"),
    ELŐREEMELÉS_KÖTÉLLEL("Előre emelés kötéllel"),
    ELŐREEMELÉS_RÚDDAL("Előre emelés rúddal"),
    OLDALEMELÉS_KÖTÉLLEL("Oldalemelés kötéllel"),
    OLDALEMELÉS_SÚLYZÓVAL("Oldalemelés súlyzóval"),
    HÁTRAHÚZÁS_KÁBELLEL("Hátrahúzás kábellel"),
    HÁTSÓVÁLL_GÉPEN("Hátsó váll gépen"),
    HÁTSÓVÁLL_SÚLYZÓVAL("Hátsó váll súlyzóval"),
    VÁLLNYOMÁS_GÉPEN("Vállból nyomás gépen");

    private String gyakorlat;

    VállEnum(String gyakorlat) {
        this.gyakorlat = gyakorlat;
    }

    public String getGyakorlat() {
        return gyakorlat;
    }

    public void setGyakorlat(String gyakorlat) {
        this.gyakorlat = gyakorlat;
    }
}
