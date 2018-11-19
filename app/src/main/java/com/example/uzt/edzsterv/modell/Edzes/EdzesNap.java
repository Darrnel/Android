package com.example.uzt.edzsterv.modell.Edzes;

import java.util.List;

public class EdzesNap {

    private String nap;
    private List<Edzes> edzesek;

    public EdzesNap(String nap, List<Edzes> edzesek) {
        this.nap = nap;
        this.edzesek = edzesek;
    }

   /* public String getNap() {
        return nap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public List<Edzes> getEdzesek() {
        return edzesek;
    }

    public void setEdzesek(List<Edzes> edzesek) {
        this.edzesek = edzesek;
    }

    @Override
    public String toString() {
        return "\n\tEdzesNap " +
                "nap='" + nap + '\'' +
                ", \n\t\t " + edzesek;
    }*/
}

