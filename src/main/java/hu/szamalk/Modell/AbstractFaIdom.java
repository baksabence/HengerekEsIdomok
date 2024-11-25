package hu.szamalk.Modell;

import hu.szamalk.Modell.AbstractIdom;

public abstract class AbstractFaIdom extends AbstractIdom {
    private static double fajsuly = .8;

    public abstract double terfogat();
    public double suly(){
        return terfogat() * hu.szamalk.Modell.AbstractFaIdom.fajsuly;
    }

    public static double getFajsuly() {
        return fajsuly;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "FaIdom{}";
    }
}
