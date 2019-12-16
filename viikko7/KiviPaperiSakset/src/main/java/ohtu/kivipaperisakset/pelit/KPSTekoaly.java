package ohtu.kivipaperisakset.pelit;

import ohtu.kivipaperisakset.Tuomari;
import ohtu.kivipaperisakset.tekoalyt.Tekoaly;
import ohtu.kivipaperisakset.tekoalyt.TekoalyInterface;
import ohtu.kivipaperisakset.tekoalyt.TekoalyParannettu;

import java.util.Scanner;

public class KPSTekoaly extends KPS {

    private static final Scanner scanner = new Scanner(System.in);

    private TekoalyInterface tekoaly;

    KPSTekoaly(TekoalyInterface tekoalyInterface) {
        this.tekoaly = tekoalyInterface;
    }

    KPSTekoaly(int muistinkoko) {
        this.tekoaly = new TekoalyParannettu(muistinkoko);
    }



    @Override
    public void pelaa() {
        Tuomari tuomari = new Tuomari();

        System.out.print("Ensimmäisen pelaajan siirto: ");
        String ekanSiirto = scanner.nextLine();
        String tokanSiirto;

        tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);


        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

            System.out.print("Ensimmäisen pelaajan siirto: ");
            ekanSiirto = scanner.nextLine();

            tokanSiirto = tekoaly.annaSiirto();
            System.out.println("Tietokone valitsi: " + tokanSiirto);
            tekoaly.asetaSiirto(ekanSiirto);

        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }
}