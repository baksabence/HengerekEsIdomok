package hu.szamalk.Modell;

public class TomorHenger extends MertaniHenger {
    private double fajsuly;

    public TomorHenger(double sugar, double magassag) {
        this(sugar, magassag, 1);
    }

    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public double suly() {
        return this.terfogat()  * fajsuly;
    }

    @Override
    public String toString() {
        String os = super.toString();
        /* amelyik szimpi, de legyen egységes a LyukasHenger-rel: */
        return os + " <|-- TomorHenger{" +
                "fajsuly=" + fajsuly +
                '}';

//        return "TomorHenger{" +
//                "fajsuly=" + fajsuly +
//                '}' + " --|> " + os;
    }
}
