package com.example.uzt.edzsterv.modell.Edzes;

import java.util.List;

public class Edzes {

    private String tipus;
    private List<Gyakorlat> gyakorlatok;

    public Edzes(String tipus, List<Gyakorlat> gyakorlatok) {
        this.tipus = tipus;
        this.gyakorlatok = gyakorlatok;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public List<Gyakorlat> getGyakorlatok() {
        return gyakorlatok;
    }

    public void setGyakorlatok(List<Gyakorlat> gyakorlatok) {
        this.gyakorlatok = gyakorlatok;
    }

    @Override
    public String toString() {
        return "\n\t\tEdzes " +
                " tipus : '" + tipus + '\'' +
                " , \n\t\t\t " + gyakorlatok ;
    }
}
