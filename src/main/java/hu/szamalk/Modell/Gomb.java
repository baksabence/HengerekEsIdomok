package hu.szamalk.Modell;

public class Gomb extends AbstractFaIdom{
    private double r;

    public Gomb(double r) {
        this.r = r;
    }

    @Override
    public double terfogat() {
        return 4*Math.pow(r,3)*Math.PI / 3;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + " <|-- Gomb{" +
                "r=" + r +
                '}';
    }
}
