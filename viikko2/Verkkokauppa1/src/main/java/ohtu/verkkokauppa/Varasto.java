package ohtu.verkkokauppa;

import java.util.List;

public interface Varasto {
    static Varasto getInstance() {
        return new VarastoImpl();
    }

    Tuote haeTuote(int id);

    int saldo(int id);

    void otaVarastosta(Tuote t);

    void palautaVarastoon(Tuote t);

    List<String> haeTapahtumat();

}
