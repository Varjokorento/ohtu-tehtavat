package ohtu.kivipaperisakset.pelit;

public class KPSFactory {

    public static KPS getParempiTekoaly() {
        return new KPSParempiTekoaly();
    }

    public static KPS getTekoaly() {
        return new KPSTekoaly();
    }

    public static KPS getPelaajaVPelaaja() {
        return new KPSPelaajaVsPelaaja();
    }
}
