package ohtu.verkkokauppa;

public interface Pankki {

    static Pankki getInstance() {
        return new PankkiImpl();
    }

    boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
}
