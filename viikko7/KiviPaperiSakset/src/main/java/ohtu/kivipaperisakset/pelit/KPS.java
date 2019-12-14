package ohtu.kivipaperisakset.pelit;

public abstract class KPS {

    static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

    public abstract void pelaa();
}
