package com.example.uzt.edzsterv.modell.Edzes;

import java.util.List;

public class Edzesterv {

    private String nev;
    private List<EdzesNap> edzesNapok;


    public Edzesterv(String nev, List<EdzesNap> edzesNapok) {
        this.nev = nev;
        this.edzesNapok = edzesNapok;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public List<EdzesNap> getEdzesNapok() {
        return edzesNapok;
    }

    public void setEdzesNapok(List<EdzesNap> edzesNapok) {
        this.edzesNapok = edzesNapok;
    }

    @Override
    public String toString() {
        return "Edzesterv nev: " + nev +
                " " + edzesNapok ;
    }
}
