package DatabazePojistenych;

public class Pojistenec {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private int telefonniCislo;


    public Pojistenec(String jmeno, String prijmeni, int vek, int telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }


    @Override
    public String toString() {
        return jmeno + "\t" + prijmeni + "\t" + vek + "\t\t" + telefonniCislo;
    }
}


