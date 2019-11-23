package ohtu.intjoukkosovellus;

import ohtu.intjoukkosovellus.joukko.IntJoukko;
import ohtu.intjoukkosovellus.joukko.IntJoukkoUtils;

import java.util.Scanner;

public class TekstiKayttoLiittyma {

    private static IntJoukko A, B, C;
    private static Scanner lukija = new Scanner(System.in);

    private static String luku() {
        return lukija.nextLine();
    }

    static void lueSyote() {
        alustaJoukot();
        System.out.println("Tervetuloa joukkolaboratorioon!");
        String luettu;
        do {
            luettu = lukija.nextLine();
        } while (!syoteLooppi(luettu));
    }

    private static void alustaJoukot() {
        A = new IntJoukko();
        B = new IntJoukko();
        C = new IntJoukko();
    }

    private static boolean syoteLooppi(String luettu) {
        if (luettu.equals("lisää") || luettu.equals("li")) {
            lisaa();
        } else if (luettu.equalsIgnoreCase("poista") || luettu.equalsIgnoreCase("p")) {
            poista();
        } else if (luettu.equalsIgnoreCase("kuuluu") || luettu.equalsIgnoreCase("k")) {
            kuuluu();
        } else if (luettu.equalsIgnoreCase("yhdiste") || luettu.equalsIgnoreCase("y")) {
            yhdiste();
        } else if (luettu.equalsIgnoreCase("leikkaus") || luettu.equalsIgnoreCase("le")) {
            leikkaus();
        } else if (luettu.equalsIgnoreCase("erotus") || luettu.equalsIgnoreCase("e")) {
            erotus();
        } else if (luettu.equalsIgnoreCase("A")) {
            System.out.println(A);
        } else if (luettu.equalsIgnoreCase("B")) {
            System.out.println(B);
        } else if (luettu.equalsIgnoreCase("C")) {
            System.out.println(C);
        } else if (luettu.equalsIgnoreCase("lopeta") || luettu.equalsIgnoreCase("quit") || luettu.equalsIgnoreCase("q")) {
            System.out.println("Lopetetaan, moikka!");
            return true;
        } else {
            System.out.println("Virheellinen komento! " + luettu);
            System.out.println("Komennot ovat lisää(li), poista(p), kuuluu(k), yhdiste(y), erotus(e) ja leikkaus(le).");
        }
        System.out.println("Komennot ovat lisää(li), poista(p), kuuluu(k), yhdiste(y), erotus(e) ja leikkaus(le).");
        return false;
    }

    private static IntJoukko mikaJoukko() {
        String luettu;
        luettu = luku();
        while (true) {
            switch (luettu) {
                case "A":
                case "a":
                    return A;
                case "B":
                case "b":
                    return B;
                case "C":
                case "c":
                    return C;
                default:
                    System.out.println("Virheellinen joukko! " + luettu);
                    System.out.print("Yritä uudelleen!");
                    luettu = luku();
                    break;
            }
        }
    }

    private static void lisaa() {
        int lisLuku;
        IntJoukko joukko;
        System.out.print("Mihin joukkoon? ");
        joukko = mikaJoukko();
        System.out.println("");
        System.out.print("Mikä luku lisätään? ");
        lisLuku = lukija.nextInt();
        joukko.lisaa(lisLuku);
    }

    private static void yhdiste() {
        IntJoukko aJoukko, bJoukko, c;
        System.out.print("1. joukko? ");
        aJoukko = mikaJoukko();
        System.out.print("2. joukko? ");
        bJoukko = mikaJoukko();
        c = IntJoukkoUtils.yhdiste(aJoukko, bJoukko);
        System.out.println("A yhdiste B = " + c.toString());
    }

    private static void leikkaus() {
        IntJoukko aJoukko, bJoukko, c;
        System.out.print("1. joukko? ");
        aJoukko = mikaJoukko();
        System.out.print("2. joukko? ");
        bJoukko = mikaJoukko();
        c = IntJoukkoUtils.leikkaus(aJoukko, bJoukko);
        System.out.println("A leikkaus B = " + c.toString());
    }

    private static void erotus() {
        IntJoukko aJoukko, bJoukko, c;
        System.out.print("1. joukko? ");
        aJoukko = mikaJoukko();
        System.out.print("2. joukko? ");
        bJoukko = mikaJoukko();
        c = IntJoukkoUtils.erotus(aJoukko, bJoukko);
        System.out.println("A erotus B = " + c.toString());
    }

    private static void poista() {
        IntJoukko joukko;
        int lisLuku;
        System.out.print("Mistä joukosta? ");
        joukko = mikaJoukko();
        System.out.print("Mikä luku poistetaan? ");
        lisLuku = lukija.nextInt();
        joukko.poista(lisLuku);
    }

    private static void kuuluu() {
        int kysLuku;
        System.out.print("Mihin joukkoon? ");
        IntJoukko joukko = mikaJoukko();
        System.out.print("Mikä luku? ");
        kysLuku = lukija.nextInt();
        boolean kuuluuko = joukko.kuuluu(kysLuku);
        if (kuuluuko) {
            System.out.println(kysLuku + " kuuluu joukkoon ");
        } else {
            System.out.println(kysLuku + " ei kuulu joukkoon ");
        }
    }
}
