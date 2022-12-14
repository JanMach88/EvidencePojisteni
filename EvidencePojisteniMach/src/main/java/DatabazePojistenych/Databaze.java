package DatabazePojistenych;

import java.util.ArrayList;

public class Databaze {

    private final ArrayList<Pojistenec> pojistenci;
    public Databaze() {
        pojistenci = new ArrayList<>();
    }

    public void pridejPojisteneho(String jmeno, String prijmeni, int vek, int telefonniCislo) {
        pojistenci.add(new Pojistenec(jmeno,prijmeni,vek,telefonniCislo));
    }

    public ArrayList<Pojistenec> najdiVsechnyPojistene() {
        ArrayList<Pojistenec> vsichni = new ArrayList<>();
        vsichni.addAll(pojistenci);
        return vsichni;
    }


    public ArrayList<Pojistenec> najdiPojisteneho(String jmeno, String prijmeni) {
        ArrayList<Pojistenec> nalezene = new ArrayList<>();
        for (Pojistenec z : pojistenci) {
            if ((z.getJmeno().equals(jmeno)) && ((z.getPrijmeni().equals(prijmeni)))) {
                nalezene.add(z);
            }
        }
    return nalezene;

    }




}
