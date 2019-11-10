
package ohtu.verkkokauppa;

import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component
public class KirjanpitoImpl implements Kirjanpito {

    private ArrayList<String> tapahtumat =  new ArrayList<>();
    
    @Override
    public void lisaaTapahtuma(String tapahtuma) {
        tapahtumat.add(tapahtuma);
    }

    @Override
    public ArrayList<String> getTapahtumat() {
        return tapahtumat;
    }       
}
