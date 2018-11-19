package com.example.uzt.edzsterv.modell;



import com.example.uzt.edzsterv.modell.Edzes.Edzesterv;
import com.example.uzt.edzsterv.modell.Etrend.Etrend;

import java.util.List;

public class Felhasznalo {

    private String nev;
    private int testsuly;
    private int magassag;
    private double ttindex;

    private Etrend etrend;
    private List<Edzesterv> edzestervek;

    public Felhasznalo(String nev, int testsuly, int magassag, List<Edzesterv> edzestervek) {
        this.nev = nev;
        this.testsuly = testsuly;
        this.magassag = magassag;
        this.ttindex = ttindexSzamol(testsuly, magassag);
        this.edzestervek = edzestervek;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getTestsuly() {
        return testsuly;
    }

    public void setTestsuly(int testsuly) {
        this.testsuly = testsuly;
    }

    public int getMagassag() {
        return magassag;
    }

    public void setMagassag(int magassag) {
        this.magassag = magassag;
    }

    public double getTtindex() {
        return ttindex;
    }

    public List<Edzesterv> getEdzestervek() {
        return edzestervek;
    }

    public void setEdzestervek(List<Edzesterv> edzestervek) {
        this.edzestervek = edzestervek;
    }

    public Etrend getEtrend() {
        return etrend;
    }

    public void setEtrend(Etrend etrend) {
        this.etrend = etrend;
    }

    public double ttindexSzamol(int testsuly, int magassag){
        return 1.3 * testsuly / Math.pow((double) magassag / 100, 2.5);
    }
}
