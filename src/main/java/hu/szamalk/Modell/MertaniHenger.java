package hu.szamalk.Modell;

public class MertaniHenger extends AbstractIdom {
    private static int hengerDb = 0;
    private double sugar, magassag;

    public MertaniHenger(double sugar, double magassag) {
        MertaniHenger.hengerDb++;
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public static int getHengerDb() {
        return hengerDb;
    }

    /* VESZÉLYES és nehéz használni */
//    public static void setHengerDb(int hengerDb) {
//        MertaniHenger.hengerDb = hengerDb;
//    }

    /* csak a leszármazott éri el, vagy aki azonos package-ben van */
    protected static void csokkentHengerDb() {
        MertaniHenger.hengerDb--;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public double terfogat() {
        return Math.pow(sugar, 2) * Math.PI * magassag;
        //return Math.pow(this.sugar, 2) * Math.PI * this.magassag;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "<|-- MertaniHenger{" +
                "sugar=" + sugar +
                ", magassag=" + magassag +
                '}';
    }


}
