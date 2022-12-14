package DatabazePojistenych;

import java.util.Scanner;

public class applicationMain {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        DatabazePojistenych databazePojistenych = new DatabazePojistenych();
        String volba = "";


        while (!volba.equals("4")) {
            databazePojistenych.vypisUvodniObrazovku();
            System.out.println();
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného:");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            volba = sc.nextLine();
            System.out.println();

            switch (volba) {
                case "1" -> databazePojistenych.pridejPojisteneho();
                case "2" -> databazePojistenych.vypisZaznamy();
                case "3" -> databazePojistenych.vyhledejPojisteneho();
                case "4" -> System.out.println("Libovolnou klávesou ukončíte program...");
                default -> System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
            }
        }
    }
    }

