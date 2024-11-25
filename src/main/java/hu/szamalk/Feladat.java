package hu.szamalk;

import hu.szamalk.Modell.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Feladat {
    private List<AbstractIdom> idomok;

    public static void main(String[] args) {
        new Feladat().run();
    }

    public Feladat(){
        idomok = new ArrayList<>();
        idomok.add(new MertaniHenger(3,4));
        idomok.add(new LyukasHenger(4,5,6,7));
        idomok.add(new TomorHenger(3,4));
        idomok.add(new Gomb(1.1));
        idomok.add(new Hasab(1,2,3));
    }

    public void run(){
            System.out.println(terfogatok());
            System.out.println(fajsulyok());
            System.out.println(fajsulyTipusok());
            System.out.println(melyikbolMennyi());
    }

    public String terfogatok(){
        String s = "Térfogatok?\n";
        for (AbstractIdom idom : idomok){
            s += idom;

            s += "\n V: " + idom.terfogat();
            s += "\n";

        }
        return s;

    }

    private String fajsulyok(){
        String s = "Fajsúlyok: ";
        for (AbstractIdom idom : idomok){
            if(idom instanceof AbstractFaIdom){
                s += "fajsúly: " + AbstractFaIdom.getFajsuly();
            } else if (idom instanceof TomorHenger) {
                s += "fajsúly: " + ((TomorHenger) idom).getFajsuly();
            }
            s += "\n";
        }
        return s;
    }

    private String fajsulyTipusok(){
        HashSet<Double> fajsulyok = new HashSet<>();
        String s = "Fajsúlyok: ";
        double fs = 0;
        for (AbstractIdom idom : idomok){
            if(idom instanceof AbstractFaIdom){
                fs = AbstractFaIdom.getFajsuly();
                fajsulyok.add(fs);
            } else if (idom instanceof TomorHenger) {
                fs = AbstractFaIdom.getFajsuly();
                fajsulyok.add(fs);
            }
        }
        return s + fajsulyok.toString();
    }

    private String melyikbolMennyi(){
        String s = "Melyik fajsúlyból mennyi van?";
        HashMap<Double, Integer> fajsulyok = new HashMap<>();
        double fs = 0;
        for (AbstractIdom idom : idomok){
            if(idom instanceof AbstractFaIdom){
                fs = AbstractFaIdom.getFajsuly();
            } else if (idom instanceof TomorHenger) {
                fs = ((TomorHenger)idom).getFajsuly();
            }
        }
        return s + fajsulyok.toString();
    }

}
