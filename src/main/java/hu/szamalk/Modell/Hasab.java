package hu.szamalk.Modell;

import hu.szamalk.Modell.AbstractFaIdom;

public class Hasab extends AbstractFaIdom {
    private double a,b,m;

    public Hasab(double a, double b, double m) {
        this.a = a;
        this.b = b;
        this.m = m;
    }

    @Override
    public double terfogat() {
        return a*b*m;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + " <|-- Hasab{" +
                "a=" + a +
                ", b=" + b +
                ", m=" + m +
                '}';
    }
}
