package ohtu.verkkokauppa;

public interface Viitegeneraattori {
    static Viitegeneraattori getInstance() {
        return new ViitegeneraattoriImpl();
    }

    int uusi();
}
