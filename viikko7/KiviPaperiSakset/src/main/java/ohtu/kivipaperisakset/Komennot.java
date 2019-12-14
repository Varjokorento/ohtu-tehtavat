package ohtu.kivipaperisakset;

import ohtu.kivipaperisakset.pelit.*;

import java.util.HashMap;
import java.util.Scanner;


public class Komennot {

    private static final Scanner scanner = new Scanner(System.in);

    public static void lueKomento() {
        HashMap<String, KPS> gameMap = new HashMap<>();
        gameMap.put("a", KPSFactory.getPelaajaVPelaaja());
        gameMap.put("b", KPSFactory.getTekoaly());
        gameMap.put("c", KPSFactory.getParempiTekoaly());
        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");

            String vastaus = scanner.nextLine();
            if (gameMap.get(vastaus) != null) {
                System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
                gameMap.get(vastaus).pelaa();
            } else {
                break;
            }
        }

    }

}
