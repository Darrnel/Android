package com.example.uzt.edzsterv.modell.Edzes.Enum;

public enum HátEnum {
    HÚZÓDZKODÁS("Húzódzkodás"),
    MELLHEZ_HÚZÁS("Mellhez húzás"),
    FELHÚZÁS("Felhúzás"),
    EVEZÉS_GÉPEN("Evezés gépen"),
    HÁTHOZ_HÚZÁS("Háthoz húzás"),
    FŰRÉSZELÉS_GÉPEN("Fűrészelés gépen");

    private String gyakorlat;

    HátEnum(String gyakorlat) {
        this.gyakorlat = gyakorlat;
    }

    public String getGyakorlat() {
        return gyakorlat;
    }

    public void setGyakorlat(String gyakorlat) {
        this.gyakorlat = gyakorlat;
    }
}
