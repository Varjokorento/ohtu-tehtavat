package ohtu.verkkokauppa;

import java.util.ArrayList;

public interface Kirjanpito {
    static Kirjanpito getInstance() {
        return new KirjanpitoImpl();
    }

    void lisaaTapahtuma(String tapahtuma);

    ArrayList<String> getTapahtumat();
}
