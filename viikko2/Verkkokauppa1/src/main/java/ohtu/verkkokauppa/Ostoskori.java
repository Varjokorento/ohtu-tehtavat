package ohtu.verkkokauppa;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Ostoskori {

    ArrayList<Tuote> tuotteet;

    public Ostoskori() {
        tuotteet = new ArrayList<Tuote>();
    }

    public void lisaa(Tuote t) {
        tuotteet.add(t);
    }

    public void poista(Tuote t) {
        tuotteet.remove(t);
    }

    public int hinta() {
        int hinta = 0;

        for (Tuote tuote : tuotteet) {
            hinta += tuote.getHinta();
        }

        return hinta;
    }
}
