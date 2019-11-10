package ohtu.verkkokauppa;

import org.springframework.stereotype.Service;

import java.util.ArrayList;


public interface Kirjanpito {
    void lisaaTapahtuma(String tapahtuma);

    ArrayList<String> getTapahtumat();
}
