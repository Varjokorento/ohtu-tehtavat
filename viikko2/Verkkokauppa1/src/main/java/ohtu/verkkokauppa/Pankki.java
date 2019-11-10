package ohtu.verkkokauppa;


import org.springframework.stereotype.Service;

@Service
public interface Pankki {

    boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
}
