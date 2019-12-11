package ohtu.kivipaperisakset;

public abstract class KPS {

    static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

    protected abstract void pelaa();
}
