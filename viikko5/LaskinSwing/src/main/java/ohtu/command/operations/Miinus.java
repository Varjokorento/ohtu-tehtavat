package ohtu.command.operations;

import ohtu.Sovelluslogiikka;
import ohtu.command.Komento;

import javax.swing.*;

public class Miinus extends Komento {
    private int prevValue;

    public Miinus(JTextField tuloskentta, JTextField syotekentta, JButton nollaa, JButton undo, Sovelluslogiikka sovelluslogiikka) {
        super(tuloskentta, syotekentta, nollaa, undo, sovelluslogiikka);
    }

    @Override
    public void suorita() {
        prevValue = Integer.valueOf(tuloskentta.getText());
        int arvo = 0;
        arvo = Integer.parseInt(syotekentta.getText());
        sovelluslogiikka.miinus(arvo);

        int laskunTulos = sovelluslogiikka.tulos();

        syotekentta.setText("");
        tuloskentta.setText("" + laskunTulos);
        if (laskunTulos==0) {
            nollaa.setEnabled(false);
        } else {
            nollaa.setEnabled(true);
        }
        undo.setEnabled(true);
    }

    @Override
    public void peru() {
        syotekentta.setText("");
        tuloskentta.setText("" +prevValue);
    }


}