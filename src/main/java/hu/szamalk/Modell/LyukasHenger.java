package hu.szamalk.Modell;

public class LyukasHenger extends TomorHenger {
    private double falvastagsag;

    public LyukasHenger(double sugar, double magassag, double falvastagsag) {
        this(sugar, magassag, 1, falvastagsag);
    }

    public LyukasHenger(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    @Override
    public double terfogat() {
        /* sok változóval a myagyarázathoz: */
//        double kulsoV = super.terfogat();
//        double belsoR = getSugar()-falvastagsag;
//        MertaniHenger belsoH = new MertaniHenger(belsoR, this.getMagassag());
//        double belsoV = belsoH.terfogat();
//        return kulsoV - belsoV;

        double belsoR = getSugar()-falvastagsag;
        MertaniHenger belsoH = new MertaniHenger(belsoR, this.getMagassag());
        /* +1 henger létrejött, ezért kell csökkenteni: */
        //MertaniHenger.setHengerDb(MertaniHenger.getHengerDb()-1);
        MertaniHenger.csokkentHengerDb();

        return super.terfogat() - belsoH.terfogat();
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + " <|-- LyukasHenger{" +
                "falvastagsag=" + falvastagsag +
                '}';
    }
}
