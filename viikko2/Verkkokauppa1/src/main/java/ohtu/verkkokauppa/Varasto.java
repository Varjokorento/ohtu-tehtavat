package ohtu.verkkokauppa;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Varasto {

    Tuote haeTuote(int id);

    int saldo(int id);

    void otaVarastosta(Tuote t);

    void palautaVarastoon(Tuote t);

    List<String> haeTapahtumat();

}
