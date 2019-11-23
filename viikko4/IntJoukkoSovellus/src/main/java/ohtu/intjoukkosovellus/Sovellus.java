package ohtu.intjoukkosovellus;

import ohtu.intjoukkosovellus.joukko.IntJoukko;

public class Sovellus {


    public static void main(String[] args) {
        System.out.println("Käytössäsi ovat joukot A, B ja C.");
        System.out.println("Komennot ovat lisää(li), poista(p), kuuluu(k), yhdiste(y), erotus(e), leikkaus(le) ja lopetus(quit)(q).");
        System.out.println("Joukon nimi komentona tarkoittaa pyyntöä tulostaa joukko.");
        TekstiKayttoLiittyma.lueSyote();
    }


}
