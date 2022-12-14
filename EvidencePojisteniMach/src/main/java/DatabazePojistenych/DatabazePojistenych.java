package DatabazePojistenych;

import java.util.ArrayList;
import java.util.Scanner;

public class DatabazePojistenych {

    private final Databaze databaze;

    private Scanner sc = new Scanner(System.in, "Windows-1250");

    public DatabazePojistenych() {
        databaze = new Databaze();
    }

    public void vypisZaznamy() {
        ArrayList<Pojistenec> zaznamy = databaze.najdiVsechnyPojistene();
        for (Pojistenec z : zaznamy) {
            System.out.println(z);
        }
        System.out.println("\nPokračujte libovolnou klávesou...\n");

    }

    public void pridejPojisteneho() {
        System.out.println("Zadejte jméno pojístného:");
        String jmeno = sc.nextLine().trim();
        System.out.println("Zadejte příjmení pojistného:");
        String prijmeni = sc.nextLine().trim();
        System.out.println("Zadejte telefonní číslo:");
        int telefonniCislo = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte věk:");
        int vek = Integer.parseInt(sc.nextLine());
        databaze.pridejPojisteneho(jmeno, prijmeni, vek, telefonniCislo);
        System.out.println("\nData byla uložena. Pokračujte libovolnou klávesou...\n");

    }

    public void vyhledejPojisteneho() {
        System.out.println("Zadejte jméno pojíštěného:");
        String jmeno = sc.nextLine().trim();
        System.out.println("Zadejte příjmení");
        String prijmeni = sc.nextLine().trim();
        ArrayList<Pojistenec> zaznamy = databaze.najdiPojisteneho(jmeno, prijmeni);
        if (zaznamy.size() > 0) {
            for (Pojistenec z : zaznamy) {
                System.out.println(z);
            }
        } else {

            System.out.println("\nNebyly nalezeny žádné záznamy.\n");
        }
        System.out.println("\nPokračujte libovolnou klávesou...\n");
    }

    public void vypisUvodniObrazovku() {
        System.out.println("--------------------------------");
        System.out.println("Evidence pojíštěných");
        System.out.println("--------------------------------");

    }
}
