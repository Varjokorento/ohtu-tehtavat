package ohtu.kivipaperisakset.pelit;

import ohtu.kivipaperisakset.tekoalyt.Tekoaly;

public class KPSFactory {

    public static KPS getParempiTekoaly() {
        return new KPSTekoaly(20);
    }

    public static KPS getTekoaly() {
        return new KPSTekoaly(new Tekoaly());
    }

    public static KPS getPelaajaVPelaaja() {
        return new KPSPelaajaVsPelaaja();
    }
}
