package ohtu.command.operations;

import ohtu.Sovelluslogiikka;
import ohtu.command.Komento;

import javax.swing.*;

public class Summa extends Komento {

    public Summa(JTextField tuloskentta, JTextField syotekentta, JButton nollaa, JButton undo, Sovelluslogiikka sovelluslogiikka) {
        super(tuloskentta, syotekentta, nollaa, undo, sovelluslogiikka);
    }

    @Override
    public void suorita() {

        int arvo = 0;
        try {
            arvo = Integer.parseInt(syotekentta.getText());
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println(arvo);
        sovelluslogiikka.plus(arvo);

        int laskunTulos = sovelluslogiikka.tulos();

        syotekentta.setText("");
        tuloskentta.setText("" + laskunTulos);
        if (laskunTulos==0) {
            nollaa.setEnabled(false);
        } else {
            nollaa.setEnabled(true);
        }
        System.out.println("hello");
        System.out.println(laskunTulos);
        undo.setEnabled(true);
    }
}