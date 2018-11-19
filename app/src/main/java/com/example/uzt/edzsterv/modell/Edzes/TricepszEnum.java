package com.example.uzt.edzsterv.modell.Edzes;

public enum TricepszEnum {
    TOLÓDZKODÁS("Tolódzkodás"),
    LETOLÁS_KÖTÉLLEL("Letolás kötéllel"),
    LETOLÁS_RÚDDAL("Letolás rúddal"),
    FEKVENYOMÁS_SZŰKEN("Fekvenyomás szűken"),
    FEKVŐTÁMASZ("Fekvőtámasz"),
    TRICEPSZNYÚJTÁS_KÖTÉLLEL("Tricepsznyújtás kötéllel"),
    TRICEPSZNYÚJTÁS_PADON("Tricepsznyújtás padon");

    private String gyakorlat;

    TricepszEnum(String gyakorlat) {
        this.gyakorlat = gyakorlat;
    }

    public String getGyakorlat() {
        return gyakorlat;
    }

    public void setGyakorlat(String gyakorlat) {
        this.gyakorlat = gyakorlat;
    }
}
