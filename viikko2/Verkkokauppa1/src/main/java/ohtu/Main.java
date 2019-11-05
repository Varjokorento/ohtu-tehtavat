package ohtu;

import ohtu.verkkokauppa.*;

public class Main {

    public static void main(String[] args) {

        Viitegeneraattori viitegen = new ViitegeneraattoriImpl();
        Kirjanpito kirjanpito      = new KirjanpitoImpl();
        Varasto varasto            = new VarastoImpl(kirjanpito);
        Pankki pankki              = new PankkiImpl(kirjanpito);
        Kauppa kauppa              = new Kauppa(varasto, pankki, viitegen);

        // kauppa hoitaa yhden asiakkaan kerrallaan seuraavaan tapaan:
        kauppa.aloitaAsiointi();
        kauppa.lisaaKoriin(1);
        kauppa.lisaaKoriin(3);
        kauppa.lisaaKoriin(3);
        kauppa.poistaKorista(1);
        kauppa.tilimaksu("Pekka Mikkola", "1234-12345");

        // seuraava asiakas
        kauppa.aloitaAsiointi();
        for (int i = 0; i < 24; i++) {
            kauppa.lisaaKoriin(5);
        }

        kauppa.tilimaksu("Arto Vihavainen", "3425-1652");

        // kirjanpito
        for (String tapahtuma : kauppa.haeTapahtumat()) {
            System.out.println(tapahtuma);
        }
    }
}
