package com.example.uzt.edzsterv.modell.Edzes;

public enum HasEnum {
    FELÜLÉS("Felülés"),
    HASPRÉS("Hasprés"),
    LÁBEMELÉS("Lábemelés"),
    TÖRZSFORDÍTÁS("Törzsfordítás"),
    TÉRDFELHÚZÁS("Térdfelhúzás"),
    FELÜLÉS_RÓMAI_PADON("Felülés római padon"),
    HASPRÉS_GÉPEN("Hasprés gépen"),
    FELÜLÉS_TÖRZSFORDÍTÁSSAL("Felülés törzsfordítással");

    private String gyakorlat;

    HasEnum(String gyakorlat) {
        this.gyakorlat = gyakorlat;
    }

    public String getGyakorlat() {
        return gyakorlat;
    }

    public void setGyakorlat(String gyakorlat) {
        this.gyakorlat = gyakorlat;
    }
}
